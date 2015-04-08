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
public class Acesso {
    
    public void validaAcesso(Autenticavel aut, int teste){
        if(aut.autentica(teste))
            System.out.println("Acesso Permitido!");
        else
            System.out.println("Acesso negado!");
    }
}
