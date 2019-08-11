package com.mmall.dao;

import com.mmall.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 自定义mapper接口
     */
    int checkUsername(String username);

    /**
     * mybatis需要传递多个参数的时候，需要使用到@Param注解
     */
    User selectLogin(@Param("username")String username,@Param("password")String password);

    int checkEmail(String email);
}