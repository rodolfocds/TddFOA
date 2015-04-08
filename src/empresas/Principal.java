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
public class Principal {
    public static void main(String[] args) {
        Desenvolvedor dev = new Desenvolvedor("Fulano de Tal");
        Gerente gerente = new Gerente("Priscila");
        Acesso acesso = new Acesso();
        gerente.setSenha(123);
        dev.salario = 1000;
        
        acesso.validaAcesso(gerente, 123);
        
        System.out.println("O bônus do desenvolvedor "+ dev.getNome() + " é " + dev.getBonus());
    }
}
