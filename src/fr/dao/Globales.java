/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.dao;

import java.sql.Connection;

/**
 *
 * @author Joke-
 */
public class Globales {
    
    private static Connection connection;

    public static Connection getConnection() {
        return connection;
    }

    public static void setConnection(Connection connection) {
        Globales.connection = connection;
    }       
    
}
