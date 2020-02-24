package com.syz.service;

import com.syz.model.UserCollection;
import com.syz.service.dto.UserCollectionQueryCriteria;

import java.util.List;

/**
 * Created by K on 2020/2/24.
 */
public interface UserCollectionService {
    public void create(UserCollectionQueryCriteria userCollectionQueryCriteria);

    public void delete(UserCollectionQueryCriteria userCollectionQueryCriteria);

    public List<Integer> selectByUid(Integer uid);
}
