/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.empresa;

/**
 *
 * @author rosenclevergazoni
 */
public class Gerente extends Funcionario implements Autenticavel {
    public Gerente(String nome) {
        super(nome);
        this.setSenha(123);
    }

    @Override
    public double getBonus() {
        return this.salario * 0.3;
    }

    @Override
    public boolean autentica(int senha) {
        return this.getSenha()==senha;
    }
    
}