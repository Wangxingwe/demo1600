package com.ax.javaspringboot;


import com.ax.javaspringboot.entity.User;
import com.ax.javaspringboot.mappers.UserMapper;
import com.ax.javaspringboot.sqlUitl.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserTest {
    final
    @Test
    public void testSelectUser(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.selectUser();
        users.forEach(System.out::println);
        sqlSession.close();

    }

}
