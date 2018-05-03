package com.lixi.service;

import com.lixi.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import  org.apache.ibatis.io.Resources;



import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

public class MybatisFirst {

    //private SqlSessionFactory sqlSessionFactory;

   /* @Before
    public void init()throws IOException{
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }*/

    public static void main(String[] args) throws IOException{
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();

        User user = new User();
        user.setId(3);
        user.setUsername("f22222ff");
        user.setBirthday(new Date());
        user.setAddress("xxcc1111c");
        try {
            //user = session.selectOne("test.findUserByName","xx");
            session.insert("test.insertUser",user);
            session.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        System.out.println(user);
    }
}

























