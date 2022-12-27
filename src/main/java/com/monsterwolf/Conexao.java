package com.monsterwolf;

import java.sql.*;

public class Conexao {
    static Connection connection = null;
    String url = "jdbc:mysql://localhost:3306/projeto";
    String user = "root";
    String password = "1234";

    public Conexao() {
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexao realizada com sucesso");
        } catch (SQLException e) {
            System.out.println("Problema na conexao: " + e.getMessage());
        }
    }

    public static Connection getConexao() {
        return connection;
    }
}