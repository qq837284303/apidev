package com.syz.service;

import com.syz.model.AnswerRecord;

import java.util.List;

/**
 * Created by K on 2020/2/21.
 */
public interface AnswerRecordService {
    public void createRecord(AnswerRecord answerRecord);

    public Integer getCountByUid(Integer uid);

    public List<Integer> getQuestionIdsByUid(Integer uid);


}
