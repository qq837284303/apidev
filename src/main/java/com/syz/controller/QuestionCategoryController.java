package com.syz.controller;

import com.syz.service.QuestionCategoryService;
import com.syz.service.dto.PageDTO;
import com.syz.service.dto.QuestionCategoryQueryCriteria;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by K on 2020/2/20.
 */
@Api(tags = "问题分类管理")
@RestController
@RequestMapping("/api")
public class QuestionCategoryController {

    @Autowired
    private QuestionCategoryService questionCategoryService;

    @ApiOperation("")
    @GetMapping("/questioncategorys")
    public ResponseEntity getQuestioncategorys(QuestionCategoryQueryCriteria questionCategoryQueryCriteria, PageDTO pageDTO){

        return new ResponseEntity(questionCategoryService.getQuestioncategorys(questionCategoryQueryCriteria,pageDTO),HttpStatus.OK);
    }
}
