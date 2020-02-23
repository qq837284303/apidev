package com.syz.controller;

import com.syz.service.QuestionService;
import com.syz.service.dto.PageDTO;
import com.syz.service.dto.QuestionQueryCriteria;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by K on 2020/2/19.
 */
@Api(tags = "题目管理")
@RestController
@RequestMapping("/api")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @ApiOperation("获取所有题目")
    @GetMapping("/questions")
    public ResponseEntity getQuestions(QuestionQueryCriteria questionQueryCriteria, PageDTO pageDTO){
        return new ResponseEntity(questionService.getQuestions(questionQueryCriteria,pageDTO), HttpStatus.OK);
    }
    @ApiOperation("根据测验id获取题目")
    @GetMapping("/questionsbylistid")
    public ResponseEntity getQuestionsByExamId(Integer eId){
        return new ResponseEntity(questionService.getQuestionsByListId(eId),HttpStatus.OK);
    }
}
