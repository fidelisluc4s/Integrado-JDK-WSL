package br.vianna.vendas.model.faces;

import br.vianna.vendas.model.Cliente;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IGenericsDAO<C> {
    public void inserir(C cli)
            throws SQLException, ClassNotFoundException, SQLException;
    public void alterar(C cli)
            throws SQLException, ClassNotFoundException, SQLException;
    public void apagar(int key)
            throws SQLException, ClassNotFoundException, SQLException;
    public C buscarPelaChave(int cli)
            throws SQLException, ClassNotFoundException, SQLException;
    public ArrayList<C>
            buscarTodos()
            throws SQLException, ClassNotFoundException, SQLException;



}
