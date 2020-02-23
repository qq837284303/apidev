package com.syz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.syz.mapper.AnswerRecordMapper;
import com.syz.model.AnswerRecord;
import com.syz.service.AnswerRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by K on 2020/2/21.
 */
@Service
public class AnswerRecordServiceImpl implements AnswerRecordService {
    @Autowired
    public AnswerRecordMapper answerRecordMapper;

    @Override
    public void createRecord(AnswerRecord answerRecord) {
        answerRecordMapper.insert(answerRecord);
    }

    @Override
    public Integer getCountByUid(Integer uid) {
        QueryWrapper<AnswerRecord> wrapper = new QueryWrapper();
        wrapper.eq(true,"user_id",uid);
        return answerRecordMapper.selectCount(wrapper);
    }

    @Override
    public List<Integer> getQuestionIdsByUid(Integer uid) {
        return answerRecordMapper.selectQuestionIdsByUid(uid);
    }
}
