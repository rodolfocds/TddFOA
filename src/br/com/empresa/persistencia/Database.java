/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.empresa.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rogerio
 */
public class Database
{
    public static Connection getConexao() throws SQLException
    {
        return DriverManager.getConnection("jdbc:derby://localhost:1527/teste", "root", "root");
    }
}
