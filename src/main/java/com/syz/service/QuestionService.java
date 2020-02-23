package com.syz.service;

import com.syz.model.Question;
import com.syz.service.dto.PageDTO;
import com.syz.service.dto.QuestionQueryCriteria;

import java.util.List;

/**
 * Created by K on 2020/2/19.
 */
public interface QuestionService {
    public List<Question> getQuestions(QuestionQueryCriteria questionQueryCriteria, PageDTO pageDTO);

    public List<Question> getQuestionsByListId(Integer eId);
}
