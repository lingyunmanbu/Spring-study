package com.rui.mapper;

import com.rui.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper{
    @Override
    public List<User> selectUser() {
        SqlSession sqlSession = getSqlSession();
        return sqlSession.getMapper(UserMapper.class).selectUser();
    }
}
