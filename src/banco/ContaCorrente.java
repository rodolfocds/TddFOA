package banco;

public class ContaCorrente extends Conta {

    private double limiteEspecial = 100;

    public ContaCorrente(Cliente titular) {
        super(titular);
    }
    
    

    @Override
    public void saque(double valor) {
        if (valor < this.saldo + limiteEspecial) {
            this.saldo -= valor;//saldo = saldo - valor
        } else {
            System.out.println("Saldo insuficiente!\n Valor disponível: " + this.saldo
                    + "\n Limite Especial: " + limiteEspecial + "\n Total: " + getSaldo());
        }
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public double getSaldo() {
        return this.saldo + limiteEspecial;
    }
}
