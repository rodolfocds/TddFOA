
package br.com.empresa;


public class TestaFuncionarios {
    public static void main(String[] args) {
        Funcionario desenvolvedor = new Desenvolvedor("Vitor");
        Gerente gerente = new Gerente("Pedro");
        Diretor diretor = new Diretor("Carolina");
        Dba dba = new Dba("Lucas");
        dba.salario = 1200;
        diretor.salario = 2000;
        gerente.salario = 1500;
        desenvolvedor.salario = 1000;
        System.out.println("O salário do desenvolvedor " + desenvolvedor.getNome() + 
                " é " + desenvolvedor.salario + 
                " e o valor do bônus é " + desenvolvedor.getBonus());
        System.out.println("O salário do DBA " + dba.getNome() + 
                " é " + dba.salario + 
                " e o valor do bônus é " + dba.getBonus());
        System.out.println("O salário do diretor " + diretor.getNome() + 
                " é " + diretor.salario + 
                " e o valor do bônus é " + diretor.getBonus());
        System.out.println("O salário do gerente " + gerente.getNome() + 
                " é " + gerente.salario + 
                " e o valor do bônus é " + gerente.getBonus());
        
        Acesso acesso = new Acesso();
        
        acesso.validaAcesso(gerente, 123);
        
    }
}
