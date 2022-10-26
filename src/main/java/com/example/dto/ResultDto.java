package com.example.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultDto {
    private Double average;
    private Integer min;
    private Integer max;
    private List<List<Integer>> incSequence;
    private List<List<Integer>> decSequence;
    private Integer median;
}
