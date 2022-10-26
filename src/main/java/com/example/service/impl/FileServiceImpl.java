package com.example.service.impl;

import com.example.dto.ResultDto;
import com.example.service.FileService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class FileServiceImpl implements FileService {

    @Override
    public ResultDto getAverage(MultipartFile file) {
        try (var br = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
            var line = "";
            var resultAverage = 0L;
            var count = 0L;
            while ((line = br.readLine()) != null) {
                resultAverage += Integer.parseInt(line);
                count++;
            }
            return ResultDto.builder().average((double) resultAverage / count).build();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ResultDto getIncSequence(MultipartFile file) {
        return ResultDto.builder().incSequence(getSequence(file, Comparator.naturalOrder())).build();
    }

    @Override
    public ResultDto getDecSequence(MultipartFile file) {
        return ResultDto.builder().decSequence(getSequence(file, Comparator.reverseOrder())).build();
    }

    @Override
    public ResultDto getMin(MultipartFile file) {
        try (var br = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
            var resultMin = Integer.MAX_VALUE;
            var line = "";
            while ((line = br.readLine()) != null) {
                var el = Integer.parseInt(line);
                if (el < resultMin) {
                    resultMin = el;
                }
            }
            return ResultDto.builder().min(resultMin).build();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ResultDto getMedian(MultipartFile file) {
        try (var br = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
            List<Integer> elementsList = new ArrayList<>();
            var line = "";
            while ((line = br.readLine()) != null) {
                elementsList.add(Integer.parseInt(line));
            }
            elementsList = elementsList.stream().sorted().collect(Collectors.toList());
            var result = elementsList.size() % 2 == 1
                    ? elementsList.get(elementsList.size() % 2)
                    : (elementsList.get(elementsList.size() / 2 - 1) + elementsList.get(elementsList.size() / 2)) / 2;
            return ResultDto.builder().median(result).build();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public ResultDto getMax(MultipartFile file) {
        try (var br = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
            var resultMax = Integer.MIN_VALUE;
            var line = "";
            while ((line = br.readLine()) != null) {
                var el = Integer.parseInt(line);
                if (el > resultMax) {
                    resultMax = el;
                }
            }
            return ResultDto.builder().max(resultMax).build();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private List<List<Integer>> getSequence(MultipartFile file, Comparator<Integer> comparator) {
        try (var br = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
            final var result = new ArrayList<List<Integer>>();
            final var buffer = new ArrayList<Integer>();
            var maxLen = 0;
            var line = "";
            var prev = comparator.compare(1, 2) > 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            while ((line = br.readLine()) != null) {
                var val = Integer.valueOf(line);
                if (comparator.compare(val, prev) > 0) {
                    buffer.add(val);
                    if (buffer.size() == maxLen) {
                        result.add(List.copyOf(buffer));
                    }
                    if (buffer.size() > maxLen) {
                        result.clear();
                        result.add(List.copyOf(buffer));
                        maxLen = buffer.size();
                    }
                    prev = val;
                    continue;
                }
                buffer.clear();
                buffer.add(val);
                prev = val;
            }
            return result;
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}