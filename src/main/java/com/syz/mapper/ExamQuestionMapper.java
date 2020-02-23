package com.syz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.syz.model.ExamQuestion;

import java.util.List;

/**
 * Created by K on 2020/2/21.
 */
public interface ExamQuestionMapper extends BaseMapper<ExamQuestion>{
    public List<Integer> selectQuestionsIdByExamId(Integer eid);
}
