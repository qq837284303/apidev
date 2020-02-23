package com.syz.model;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by K on 2020/2/19.
 */
@Data
public class Question implements Serializable{
    private Integer id;
    private String question;
    private String selects;
    private String answer;
    private String type;
    private String img;
    private String source;
    private String resolution;
    private String category;
    private Integer level;
    private Integer status;
    private Long addUser;
    private Long createdBy;
    private Timestamp createdAt;
    private Long updatedBy;
    private Timestamp updatedAt;

}
