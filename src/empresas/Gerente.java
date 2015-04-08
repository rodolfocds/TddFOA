
package empresas;

/**
 *
 * @author rosenclevergazoni
 */
public class Gerente extends Funcionario implements Autenticavel {

    public Gerente(String nome){
        super(nome);
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
