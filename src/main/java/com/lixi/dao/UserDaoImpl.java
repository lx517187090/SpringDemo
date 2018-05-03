package com.lixi.dao;

import com.lixi.dao.impl.IUserDao;
import com.lixi.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImpl implements IUserDao {

    private SqlSessionFactory sqlSessionFactory;

    public UserDaoImpl(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }
    @Override
    public User findUserById(int id) {
        SqlSession sqlSession =sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("test.findById",id);
        sqlSession.close();
        return user;
    }

    @Override
    public List<User> findUserByName(String name) {
        SqlSession sqlSession =sqlSessionFactory.openSession();
        List<User> user = sqlSession.selectList("test.findById",name);
        sqlSession.close();
        return user;
    }
}
