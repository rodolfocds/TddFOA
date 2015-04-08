
package br.com.empresa.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {
    public static void main(String[] args) throws SQLException {
        Connection conexao = Database.getConexao();
        System.out.println("Conexao aberta");
        
        
        
        String sql = "Insert into alunos(alu_id, alu_nome, alu_email, alu_telefone, alu_twitter) values(?, ?, ?, ?, ?)";
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.setInt(1, 11);
        statement.setString(2, "Saci Pererê");
        statement.setString(3, "perere@saci.com");
        statement.setString(4, "(31)3452-5432");
        statement.setString(5, "@sacireal");
        boolean resultado = statement.execute();
        System.out.println(resultado);
        statement.close();
        conexao.close();
        System.out.println("conexao fechada");
    }
}
