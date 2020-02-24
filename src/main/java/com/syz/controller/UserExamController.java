package com.syz.controller;

import com.syz.model.UserExam;
import com.syz.service.UserExamService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by K on 2020/2/24.
 */
@Api(tags = "用户测验记录管理")
@RestController
@RequestMapping("/api")
public class UserExamController {

    @Autowired
    private UserExamService userExamService;

    @ApiOperation("新增记录")
    @PostMapping("userexam")
    public ResponseEntity create(UserExam userExam){
        userExamService.create(userExam);
        return new ResponseEntity(HttpStatus.OK);
    }

}
