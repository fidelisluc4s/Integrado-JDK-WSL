package br.vianna.vendas.util.connection;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionFactory {
    public Connection getConnetion() throws ClassNotFoundException, SQLException {

        //JDBC
        //Drfinir o Driver (Tradutor)
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Conectar no banco
        return DriverManager.getConnection("jdbc:mysql://localhost:3306","aluno","aluno");
    }

    public static void main(String[] args) {
        ConectionFactory cf = new ConectionFactory();
        try {
            System.out.println("Conectou "+cf.getConnetion());
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
