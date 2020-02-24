package com.syz.service.impl;

import com.syz.mapper.UserExamMapper;
import com.syz.model.UserExam;
import com.syz.service.UserExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by K on 2020/2/24.
 */
@Service
public class UserExamServiceImpl implements UserExamService {

    @Autowired
    private UserExamMapper userExamMapper;

    @Override
    @Transactional()
    public void create(UserExam userExam) {
        userExamMapper.insert(userExam);
    }
}
