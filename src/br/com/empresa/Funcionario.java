
package br.com.empresa;


public abstract class Funcionario {
    protected double salario;
    private int senha;
    private String nome;
    
    public Funcionario(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    public abstract double getBonus();
}
