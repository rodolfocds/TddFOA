
package banco;


public abstract class Conta {
    private int numero;
    protected double saldo;
    private Cliente titular;
    protected static int ultimaConta=1;

    public Conta(Cliente titular) {
        this.titular = titular;
        this.numero = ultimaConta;
        ultimaConta++;
    }
    
    

    public void deposito(double valor){
        this.saldo += valor; // saldo = saldo + valor
    }
    
    public abstract void saque(double valor);
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public abstract double getSaldo();

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    
    
}
