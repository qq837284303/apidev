package com.syz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.syz.mapper.ExamMapper;
import com.syz.model.Exam;
import com.syz.service.ExamService;
import com.syz.service.dto.ExamQueryCriteria;
import com.syz.service.dto.PageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by K on 2020/2/21.
 */
@Service
public class ExamServiceImpl implements ExamService {
    @Autowired
    private ExamMapper examMapper;
    @Override
    public List<Exam> getExams(ExamQueryCriteria examQueryCriteria, PageDTO pageDTO) {
        Page<Exam> page = new Page<>(pageDTO.getCurrent(),pageDTO.getSize());
        QueryWrapper<Exam> wrapper = new QueryWrapper();
        if (examQueryCriteria.getPublicType()!=null){
            wrapper.eq(true,"public_type",examQueryCriteria.getPublicType());
        }
        if (examQueryCriteria.getType()!=null){
            wrapper.eq(true,"type",examQueryCriteria.getType());
        }
        return examMapper.selectPage(page,wrapper).getRecords();
    }

    @Override
    public List<Exam> getExamById(List<Integer> ids) {
        return examMapper.selectBatchIds(ids);
    }
}
