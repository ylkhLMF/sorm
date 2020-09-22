package com.liumf.dao;

import com.liumf.pojo.User;
import com.liumf.utils.MyBatisConnectUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    /**
     * 查询全部
     */
    @Test
    public void getUserInfo() {
        SqlSession sqlSession = MyBatisConnectUtil.getSqlSession();
        userMapper mapper = sqlSession.getMapper(userMapper.class);
        List<User> userInfo = mapper.getUserInfo();
        System.out.println(userInfo);
        sqlSession.close();
    }


}