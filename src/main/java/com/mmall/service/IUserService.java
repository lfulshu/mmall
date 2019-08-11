package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;
import org.springframework.stereotype.Service;

/**
 * @Author liizzz
 * @Data 2019/8/11 12:14
 */
@Service
public interface IUserService {
    ServerResponse<User> login(String username, String password);

    public ServerResponse<String> register(User user);
}
