package net.terzeron.spring.user.dao;

import net.terzeron.spring.user.domain.User;

import java.sql.SQLException;

/**
 * Created by terzeron on 2015. 12. 9..
 */
public class UserDaoTest {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ConnectionMaker connectionMaker = new DConnectionMaker();
        UserDao dao = new UserDao(connectionMaker);

        User user = new User();
        user.setId("hongkildong");
        user.setName("홍길동");
        user.setPassword("1234");

        dao.add(user);

        System.out.println(user.getId() + " registered");
    }
}
