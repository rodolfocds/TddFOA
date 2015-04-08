
package empresa;


public abstract class Funcionario {
    protected double salario;
    private int senha;
    private String nome;
    
    public Funcionario(String nome){
        this.nome = nome;
    }
    public abstract double getBonus(); //método abstrato

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
