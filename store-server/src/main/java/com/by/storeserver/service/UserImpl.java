package com.by.storeserver.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.store.common.pojo.User;
import com.store.common.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Service
@Component
public class UserImpl implements UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserImpl.class);
    @Override
    public User getUser(User user) {
        user.setUserName("zhangsan");
        return user;
    }
}
