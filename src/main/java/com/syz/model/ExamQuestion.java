package com.syz.model;

import lombok.Data;

/**
 * Created by K on 2020/2/21.
 */
@Data
public class ExamQuestion {
    private Long id;
    private Long examId;
    private Long questionId;
}
