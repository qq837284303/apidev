package com.syz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.syz.model.UserCollection;

import java.util.List;

/**
 * Created by K on 2020/2/24.
 */
public interface UserCollectionMapper extends BaseMapper<UserCollection>{
    public List<Integer> selectByUid(Integer uid);
}
