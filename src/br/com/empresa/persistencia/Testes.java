/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.empresa.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rogerio
 */
public class Testes
{
    public static boolean conexao() throws SQLException
    {
        Connection conexao = Database.getConexao();
        String sql;
        sql = "Select * from produtos";
        Statement resultado = conexao.createStatement();
        boolean resposta = resultado.execute(sql);
        System.out.println(resposta);

        resultado.close();
        conexao.close();
        System.out.println("Conexão Fechada.");

        return resposta;
    }

    public static void alteracao()
    {

    }

    public static void exclusao()
    {

    }

    public static boolean insercao() throws SQLException
    {
        Connection conexao = Database.getConexao();
        System.out.println("Conexao aberta");
        
        String sql ="select max(alu_id) from alunos";
        Statement resultado = conexao.createStatement();
        boolean resposta = resultado.execute(sql);
        System.out.println(resposta);

        if(!resposta) return resposta;
        
        ResultSet lista = resultado.getResultSet();
        int ultimoID = 0;
        
        if (lista.next())
        {
            ultimoID = lista.getInt(1);
        }
        
        lista.close();
        resultado.close();
        
        sql = "Insert into alunos(alu_id, alu_nome, alu_email, alu_telefone, alu_twitter) values(?, ?, ?, ?, ?)";
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.setInt(1, ultimoID+1);
        statement.setString(2, "Saci Pererê");
        statement.setString(3, "perere@saci.com");
        statement.setString(4, "(31)3452-5432");
        statement.setString(5, "@sacireal");
        int result = statement.executeUpdate();
        System.out.println(statement);
        System.out.println(resultado);
        statement.close();
        conexao.close();
        System.out.println("conexao fechada");
        
         if(result == 2)
         {
             resposta = false;
         }
         else
         {
             resposta = true;
         }
                
        return resposta;
    }
}
