package com.syz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.syz.mapper.QuestionCategoryMapper;
import com.syz.model.QuestionCategory;
import com.syz.service.QuestionCategoryService;
import com.syz.service.dto.PageDTO;
import com.syz.service.dto.QuestionCategoryQueryCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by K on 2020/2/20.
 */
@Service
public class QuestionCategoryServiceImpl implements QuestionCategoryService {

    @Autowired
    private QuestionCategoryMapper questionCategoryMapper;


    @Override
    public List<QuestionCategory> getQuestioncategorys(QuestionCategoryQueryCriteria questionCategoryQueryCriteria, PageDTO pageDTO) {
        QueryWrapper<QuestionCategory> wrapper = new QueryWrapper();
        if (questionCategoryQueryCriteria.getId()!=null){
            wrapper.eq(true,"id",questionCategoryQueryCriteria.getId());
        }
        if (questionCategoryQueryCriteria.getPid()!=null){
            wrapper.eq(true,"pid",questionCategoryQueryCriteria.getPid());
        }
        Page<QuestionCategory> page = new Page(pageDTO.getCurrent(),pageDTO.getSize());

        return questionCategoryMapper.selectPage(page,wrapper).getRecords();
    }
}
