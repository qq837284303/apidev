package com.syz.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.sql.Timestamp;

/**
 * Created by K on 2020/2/21.
 */
@Data
public class AnswerRecord {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer userId;
    private Integer questionId;
    private String answer;
    private Boolean result;
    private Timestamp createdAt;
}
