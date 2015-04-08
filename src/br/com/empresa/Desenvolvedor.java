
package br.com.empresa;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome) {
        super(nome);
    }

    @Override
    public double getBonus() {
        return this.salario * 0.25;
    }
    
    
}
