package com.syz.service;

import com.syz.model.QuestionCategory;
import com.syz.service.dto.PageDTO;
import com.syz.service.dto.QuestionCategoryQueryCriteria;

import java.util.List;

/**
 * Created by K on 2020/2/20.
 */
public interface QuestionCategoryService {
    public List<QuestionCategory> getQuestioncategorys(QuestionCategoryQueryCriteria questionCategoryQueryCriteria, PageDTO pageDTO);
}
