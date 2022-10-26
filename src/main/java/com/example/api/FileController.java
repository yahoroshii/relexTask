package com.example.api;

import com.example.dto.ResultDto;
import com.example.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileController {

    private final FileService service;

    @Autowired
    public FileController(FileService service) {
        this.service = service;
    }

    /**
     * Получение среднего значения
     *
     * @param file входной файл с числами
     * @return {@link ResultDto}
     */
    @PutMapping(value = "/average")
    public ResultDto getAverage(@RequestParam("file") MultipartFile file) {
        return service.getAverage(file);
    }

    /**
     * Получение минимального значения
     *
     * @param file входной файл с числами
     * @return {@link ResultDto}
     */
    @PutMapping(value = "/min")
    public ResultDto getMin(@RequestParam("file") MultipartFile file) {
        return service.getMin(file);

    }

    /**
     * Получение максимального значения
     *
     * @param file входной файл с числами
     * @return {@link ResultDto}
     */

    @PutMapping(value = "/max")
    public ResultDto getMax(@RequestParam("file") MultipartFile file) {
        return service.getMax(file);
    }

    /**
     * Получение всех возрастающих последовательностей максимальной длины
     *
     * @param file входной файл с числами
     * @return {@link ResultDto}
     */
    @PutMapping(value = "/sequence/increasing")
    public ResultDto getIncSequence(@RequestParam("file") MultipartFile file) {
        return service.getIncSequence(file);
    }

    /**
     * Получение всех убывающих последовательностей максимальной длины
     *
     * @param file входной файл с числами
     * @return {@link ResultDto}
     */
    @PutMapping(value = "/sequence/decreasing")
    public ResultDto getDecSequence(@RequestParam("file") MultipartFile file) {
        return service.getDecSequence(file);
    }

    /**
     * Получение медианного значения
     *
     * @param file входной файл с числами
     * @return {@link ResultDto}
     */
    @PutMapping(value = "/median")
    public ResultDto getMedian(@RequestParam("file") MultipartFile file) {
        return service.getMedian(file);
    }
}