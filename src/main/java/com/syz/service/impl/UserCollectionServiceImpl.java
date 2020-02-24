package com.syz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.syz.mapper.UserCollectionMapper;
import com.syz.model.UserCollection;
import com.syz.service.UserCollectionService;
import com.syz.service.dto.UserCollectionQueryCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by K on 2020/2/24.
 */
@Service
public class UserCollectionServiceImpl implements UserCollectionService{


    @Autowired
    private UserCollectionMapper userCollectionMapper;
    @Override
    public void create(UserCollectionQueryCriteria userCollectionQueryCriteria) {
        UserCollection userCollection = new UserCollection();
        userCollection.setQuestionId(userCollectionQueryCriteria.getQId());
        userCollection.setUserId(userCollectionQueryCriteria.getUId());
        userCollectionMapper.insert(userCollection);
    }

    @Override
    public void delete(UserCollectionQueryCriteria userCollectionQueryCriteria) {
        QueryWrapper<UserCollection> wrapper = new QueryWrapper();
        if(userCollectionQueryCriteria.getId()!=null){
            wrapper.eq(true,"id",userCollectionQueryCriteria.getId());
            userCollectionMapper.delete(wrapper);
            return;
        }
        if(userCollectionQueryCriteria.getQId()!=null && userCollectionQueryCriteria.getUId()!=null){
            wrapper.eq(true,"question_id",userCollectionQueryCriteria.getQId());
            wrapper.eq(true,"user_id",userCollectionQueryCriteria.getUId());
            userCollectionMapper.delete(wrapper);
            return ;
        }
    }

    @Override
    public List<Integer> selectByUid(Integer uid) {
        QueryWrapper<UserCollection> wrapper = new QueryWrapper();
        if(uid!=null){
            wrapper.eq(true,"user_id",uid);
            List<Integer> qId = userCollectionMapper.selectByUid(uid);
            return qId;
        }


        return null;
    }
}
