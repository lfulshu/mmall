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

    public ServerResponse<User> login(String username, String password);

    public ServerResponse<String> register(User user);

    public ServerResponse<String> checkValid(String str,String type);

}
