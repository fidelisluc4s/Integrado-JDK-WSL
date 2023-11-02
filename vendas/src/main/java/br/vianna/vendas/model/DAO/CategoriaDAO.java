package br.vianna.vendas.model.DAO;

import br.vianna.vendas.model.Categoria;
import br.vianna.vendas.model.Cliente;
import br.vianna.vendas.model.faces.IGenericsDAO;
import br.vianna.vendas.util.connection.ConectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class CategoriaDAO implements IGenericsDAO<Categoria> {


    public void inserir(Categoria cate) throws SQLException, ClassNotFoundException, SQLException {
        // 1 Conectar no banco
        Connection c = new ConectionFactory().getConnetion();
        //2 Montar Consulta
        String sql = "INSERT INTO vendas.categoria\n" +
                "(id, nome, tem_isencao)\n" +
                "VALUES(0, '', b'0');";
        //3 Trocar parametros
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, cate.getNome());
        ps.setBoolean(2, cate.isTemIsencao());


        //4 Executar

        ps.execute();
    }

    @Override
    public void alterar(Categoria cli) throws SQLException, ClassNotFoundException, SQLException {

    }

    @Override
    public void apagar(int key) throws SQLException, ClassNotFoundException, SQLException {

    }

    @Override
    public Categoria buscarPelaChave(int cli) throws SQLException, ClassNotFoundException, SQLException {
        return null;
    }

    @Override
    public ArrayList<Categoria> buscarTodos() throws SQLException, ClassNotFoundException, SQLException {
        return null;
    }
}
