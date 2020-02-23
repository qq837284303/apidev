package com.syz.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by K on 2020/2/20.
 */
@Data
@TableName("question_category")
public class QuestionCategory implements Serializable{
    private Integer id;
    private String name;
    private Integer pid;
    private String value;
    private Integer sort;
    private String description;
    private Long createdBy;
    private Timestamp createdAt;
    private Long updatedBy;
    private Timestamp updatedAt;
}