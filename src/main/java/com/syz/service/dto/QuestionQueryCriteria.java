package com.syz.service.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by K on 2020/2/20.
 */
@Data
public class QuestionQueryCriteria implements Serializable{
    private Integer examId;
    private String question;
    private String category;
    private Integer type;
    private Integer status;
    private Long categoryId;
}
