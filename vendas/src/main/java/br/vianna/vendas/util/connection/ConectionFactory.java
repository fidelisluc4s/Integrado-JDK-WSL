package br.vianna.vendas.util.connection;

import br.vianna.vendas.model.Categoria;
import br.vianna.vendas.model.Cliente;
import br.vianna.vendas.model.DAO.CategoriaDAO;
import br.vianna.vendas.model.DAO.ClienteDAO;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

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
            //System.out.println("Conectou "+cf.getConnetion());

            Cliente c = new Cliente("Zezin", "ze@ze", "ze", "123", LocalDate.now().minusYears
                    (15));
            /*Cliente c = new Cliente("zezin", "ze@ze","ze","123",
            LocalDate.now().minusYears(15),null);*/
            new ClienteDAO().inserir(c);

            Categoria c1 = new Categoria(0,"Alimento", false);
            Categoria c2 = new Categoria(0,"Bebida", false);
            CategoriaDAO cDao = new CategoriaDAO();
            cDao.inserir(c1);
            cDao.inserir(c2);

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
