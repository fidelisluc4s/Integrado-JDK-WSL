package br.vianna.vendas.model.DAO;
import br.vianna.vendas.model.Cliente;
import br.vianna.vendas.model.faces.IGenericsDAO;
import br.vianna.vendas.util.connection.ConectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ClienteDAO implements IGenericsDAO<Cliente> {

    public void inserir(Cliente cli) throws SQLException, ClassNotFoundException, SQLException {
        // 1 Conectar no banco
        Connection c = new ConectionFactory().getConnetion();
        //2 Montar Consulta
        String sql = "INSERT INTO vendas.usuario"+
                "(nome, email, login, senha, data_nascimento, perfil) " +
                "VALUES(?, ?, ?, md5(?), ?, 'CLIENTE');";
        //3 Trocar parametros
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, cli.getNome());
        ps.setString(2, cli.getEmail());
        ps.setString(3, cli.getLogin());
        ps.setString(4, cli.getSenha());
        ps.setString(1, cli.getDataNascimento().format(DateTimeFormatter.ofPattern("yyy-MM-dd")));

        //4 Executar

        ps.execute();
    }

    @Override
    public void alterar(Cliente cli) throws SQLException, ClassNotFoundException, SQLException {

    }

    @Override
    public void apagar(int key) throws SQLException, ClassNotFoundException, SQLException {

    }

    @Override
    public Cliente buscarPelaChave(int cli) throws SQLException, ClassNotFoundException, SQLException {
        return null;
    }

    @Override
    public ArrayList<Cliente> buscarTodos() throws SQLException, ClassNotFoundException, SQLException {
        return null;
    }
}
