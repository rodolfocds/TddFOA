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
public class Diretor extends Funcionario {
    public Diretor(String nome) {
        super(nome);
    }

    @Override
    public double getBonus() {
        return this.salario * 0.35;
    }
}
