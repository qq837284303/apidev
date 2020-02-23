package com.syz.controller;

import com.syz.model.AnswerRecord;
import com.syz.service.AnswerRecordService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by K on 2020/2/21.
 */
@Api(tags = "做题记录管理")
@RestController
@RequestMapping("/api")
public class AnswerRecordController {

    @Autowired
    private AnswerRecordService answerRecordService;

    @ApiOperation("创建记录")
    @PostMapping("/createRecord")
    public ResponseEntity createRecord(AnswerRecord answerRecord){
        answerRecordService.createRecord(answerRecord);
        return new ResponseEntity(HttpStatus.OK);
    }

    @ApiOperation("查找用户做题数")
    @GetMapping("/getcountbyuid")
    public ResponseEntity getCountByUid(Integer uid){
        Integer count = answerRecordService.getCountByUid(uid);
        return new ResponseEntity(count,HttpStatus.OK);
    }

    @ApiOperation("查找用户错题id集")
    @GetMapping("/getquestionidsbyuid")
    public ResponseEntity getQuestionIdsByUid(Integer uid){

        return new ResponseEntity(answerRecordService.getQuestionIdsByUid(uid),HttpStatus.OK);
    }
}
