
package banco;


public class Principal {
    
    public static void main(String[] args) {
        
        ContaCorrente cc1 = new ContaCorrente(new Cliente("Gabriel"));
        ContaPoupanca cp1 = new ContaPoupanca(new Cliente("Carol"));
        
        
        //cc1.setSaldo(100);
        
        System.out.println("Saldo cc1: " + cc1.getSaldo());
        
        cc1.saque(500);
        
        
        System.out.println("O numero da cc1 é " + cc1.getNumero());
        System.out.println("O numero da cp1 é " + cp1.getNumero());
        
        System.out.println("cc1 - ultimaConta: " + cc1.ultimaConta);
        System.out.println("cp1 - ultimaConta: " + cp1.ultimaConta);
        
        cc1.ultimaConta = 10;
        
        System.out.println("cc1 - ultimaConta: " + cc1.ultimaConta);
        System.out.println("cp1 - ultimaConta: " + cp1.ultimaConta);
        
    }
}
