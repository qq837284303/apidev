package com.syz.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * Created by K on 2020/2/23.
 */
@Data
public class UserExam {
    @TableId(type = IdType.AUTO)
    private Long id;
    private Long userId;
    private Long examId;
    private Integer score;
    private Long spendTime;
    private Integer status;
}
