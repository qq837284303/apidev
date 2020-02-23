package com.syz.model;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by K on 2020/2/20.
 */
@Data
public class Exam implements Serializable {
    private Long id;
    private String title;
    private Timestamp examDate;
    private Long examTime;
    private Integer type;
    private Integer publicType;
    private String password;
    private Long createdBy;
    private Timestamp createdAt;
}

