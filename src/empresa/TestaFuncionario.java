/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author rosenclevergazoni
 */
public class TestaFuncionario {
    
    public static void main(String[] args) {
        Desenvolvedor dev = new Desenvolvedor("Alguém");
        
        dev.setSalario(4000);
        System.out.println("O nome do funcionário é " + dev.getNome());
        System.out.println("O salário é " + dev.getSalario());
        System.out.println("O bônus é " + dev.getBonus());
    }
}
