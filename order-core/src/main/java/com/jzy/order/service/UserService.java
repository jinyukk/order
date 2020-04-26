package com.jzy.order.service;

import com.jzy.order.db.tables.pojos.UserEntity;

/**
 * @author jinziyu
 * @date 2020/4/25 0:25
 */
public interface UserService {
    UserEntity getByUid(String uid);

    void checkPermission(String uid, Long shopId);
}
