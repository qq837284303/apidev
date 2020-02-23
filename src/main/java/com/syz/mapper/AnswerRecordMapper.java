package com.syz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.syz.model.AnswerRecord;

import java.util.List;

/**
 * Created by K on 2020/2/21.
 */
public interface AnswerRecordMapper extends BaseMapper<AnswerRecord>{
    public List<Integer> selectQuestionIdsByUid(Integer uid);

}
