package com.syz.service;

import com.syz.model.Exam;
import com.syz.service.dto.ExamQueryCriteria;
import com.syz.service.dto.PageDTO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by K on 2020/2/21.
 */
public interface ExamService {

    public List<Exam> getExams(ExamQueryCriteria examQueryCriteria, PageDTO pageDTO);
}
