
package empresa;


public class Desenvolvedor extends Funcionario {
    
    public Desenvolvedor(String nome){ // método construtor
        super(nome);
    }

    @Override
    public double getBonus() {
        return this.salario * 0.25;
    }
    
    
}
