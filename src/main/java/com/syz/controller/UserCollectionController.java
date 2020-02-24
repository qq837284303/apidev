package com.syz.controller;

import com.syz.model.UserCollection;
import com.syz.service.UserCollectionService;
import com.syz.service.dto.UserCollectionQueryCriteria;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by K on 2020/2/24.
 */
@Api(tags = "用户收藏管理")
@RestController
@RequestMapping("/api")
public class UserCollectionController {

    @Autowired
    private UserCollectionService userCollectionService;

    @ApiOperation("创建收藏记录")
    @PostMapping("/usercollection")
    public ResponseEntity create(UserCollectionQueryCriteria userCollectionQueryCriteria){
        userCollectionService.create(userCollectionQueryCriteria);
        return new ResponseEntity(userCollectionQueryCriteria, HttpStatus.CREATED);
    }

    @ApiOperation("删除收藏记录")
    @DeleteMapping("/usercollection")
    public ResponseEntity delete(UserCollectionQueryCriteria userCollectionQueryCriteria){
        userCollectionService.delete(userCollectionQueryCriteria);
        return new ResponseEntity(HttpStatus.OK);
    }

    @ApiOperation("查找收藏记录")
    @GetMapping("/usercollection/{uid}")
    public ResponseEntity get(@PathVariable(name = "uid") Integer uid){
        return new ResponseEntity(userCollectionService.selectByUid(uid),HttpStatus.OK);
    }
}
