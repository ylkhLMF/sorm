package com.liumf.dao;

import com.liumf.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author dreamFly
 * @date 1:16 2020/9/23
 * @className UserDao
 * @description
 */

public interface userMapper {


    // @Select("select * from user")
    List<User> getUserInfo();

}
