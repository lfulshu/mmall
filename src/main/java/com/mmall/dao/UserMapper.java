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
     * 根据用户名查询此用户的个数，一般是用户名不会重复，所以，可以用作检验，当前用户民是否已经被使用了。
     */
    int checkUsername(String username);

    /**
     * mybatis需要传递多个参数的时候，需要使用到@Param注解
     * 登陆操作，如果查询用户名和密码存在于数据库中，则登陆正常，密码是MD5加密后的密文
     */
    User selectLogin(@Param("username")String username,@Param("password")String password);

    int checkEmail(String email);
}