package br.com.empresa.persistencia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaConexao
{
    public static void main(String[] args) throws SQLException
    {
        Connection conexao = Database.getConexao();
        String sql;
        sql = "Select * from produtos";
        Statement resultado = conexao.createStatement();
        boolean resposta = resultado.execute(sql);
        System.out.println(resposta);

        ResultSet lista = resultado.getResultSet();
        //Listar nome, email e twitter?
        while (lista.next())
        {
            int id = lista.getInt("prod_id");
            String nome = lista.getString("prod_nome");
            String descricao = lista.getString("prod_descricao");
            System.out.println("id: " + id + "; Nome do produto: " + nome + "; descrição: " + descricao);
        }
        lista.close();
        resultado.close();
        conexao.close();
        System.out.println("Conexão Fechada.");
    }
}
