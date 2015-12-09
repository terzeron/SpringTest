package net.terzeron.user.dao;

import sun.tools.java.ClassNotFound;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by terzeron on 2015. 12. 9..
 */
public interface ConnectionMaker {
    public Connection makeConnection() throws ClassNotFoundException, SQLException;
}
