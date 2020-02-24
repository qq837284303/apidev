package com.syz.controller;

import com.syz.model.Exam;
import com.syz.service.ExamService;
import com.syz.service.dto.ExamQueryCriteria;
import com.syz.service.dto.PageDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by K on 2020/2/20.
 */
@Api(tags = "测验管理")
@RestController
@RequestMapping("api")
public class ExamController {

    @Autowired
    private ExamService examService;
    @ApiOperation("获取所有测验信息")
    @GetMapping("/exams")
    public ResponseEntity getExams(ExamQueryCriteria examQueryCriteria, PageDTO pageDTO){
        return new ResponseEntity(examService.getExams(examQueryCriteria,pageDTO), HttpStatus.OK);
    }


    @ApiOperation("根据Id获取测验信息")
    @GetMapping("/examsbyid")
    public ResponseEntity getExamByid(@RequestParam(name = "ids",required = true) List<Integer> ids){
        return new ResponseEntity(examService.getExamById(ids),HttpStatus.OK);
    }
}
