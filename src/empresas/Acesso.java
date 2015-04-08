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
public class Acesso {
    public void validaAcesso(Autenticavel aut, int senha){
        if (aut.autentica(senha))
            System.out.println("Acesso Permitido!");
        else
            System.out.println("Acesso Negado!");
    }
}
