
package empresas;

/**
 *
 * @author rosenclevergazoni
 */
public class Dba extends Funcionario{

    public Dba(String nome){
        super(nome);
    }
    @Override
    public double getBonus() {
        return this.salario * 0.2;
    }
    
    
}
