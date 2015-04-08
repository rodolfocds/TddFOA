/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresas;

/**
 *
 * @author rosenclevergazoni
 */
public abstract class Funcionario {
    protected double salario;
    private int senha;
    private String nome;
    
    public Funcionario(String nome){
        this.nome = nome;
    }

    public abstract double getBonus();

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    public String getNome(){
        return this.nome;
    }
}
