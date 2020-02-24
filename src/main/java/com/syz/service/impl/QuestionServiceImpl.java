package com.syz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.syz.mapper.ExamQuestionMapper;
import com.syz.mapper.QuestionMapper;
import com.syz.model.Question;
import com.syz.service.QuestionService;
import com.syz.service.dto.PageDTO;
import com.syz.service.dto.QuestionQueryCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by K on 2020/2/19.
 */
@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private ExamQuestionMapper examQuestionMapper;

    public List<Question> getQuestions(QuestionQueryCriteria questionQueryCriteria, PageDTO pageDTO){
        QueryWrapper<Question> wrapper = new QueryWrapper<>();
        if(questionQueryCriteria.getCategory()!=null && questionQueryCriteria.getCategory().equals("")){
            wrapper.eq(true,"category",questionQueryCriteria.getCategory());
        }
        if(questionQueryCriteria.getQuestion()!=null && questionQueryCriteria.getQuestion().equals("")){
            wrapper.eq(true,"question",questionQueryCriteria.getQuestion());
        }
        if(questionQueryCriteria.getType()!=null){
            wrapper.eq(true,"type",questionQueryCriteria.getType());
        }
        if(questionQueryCriteria.getStatus()!=null){
            wrapper.eq(true,"status",questionQueryCriteria.getStatus());
        }

        Page<Question> page = new Page(pageDTO.getCurrent(),pageDTO.getSize());
        return questionMapper.selectPage(page,wrapper).getRecords();
    }

    @Override
    public List<Question> getQuestionsByListId(Integer eId) {
        List<Integer> ids = examQuestionMapper.selectQuestionsIdByExamId(eId);
        return questionMapper.selectBatchIds(ids);
    }

    @Override
    public List<Question> getQuestionsByIds(List<Integer> ids) {
        return questionMapper.selectBatchIds(ids);
    }
}