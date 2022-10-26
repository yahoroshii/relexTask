package com.example.service;

import com.example.dto.ResultDto;
import org.springframework.web.multipart.MultipartFile;

public interface FileService {

    ResultDto getAverage(MultipartFile file);

    ResultDto getMin(MultipartFile file);

    ResultDto getMax(MultipartFile file);

    ResultDto getIncSequence(MultipartFile file);

    ResultDto getDecSequence(MultipartFile file);

    ResultDto getMedian(MultipartFile file);
}