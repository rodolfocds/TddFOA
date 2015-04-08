package banco;

public class ContaPoupanca extends Conta
{
    private double percentualRendimento = 1;

    public ContaPoupanca(Cliente titular)
    {
        super(titular);
    }

    public void saque(double valor)
    {
        if (valor < this.getSaldo())
        {
            this.setSaldo(this.getSaldo() - valor);
        }
        else
        {
            System.out.println("Saldo insuficiente!" + this.getSaldo());
        }
    }

    public double getPercentualRendimento()
    {
        return percentualRendimento;
    }

    public void setPercentualRendimento(double percentualRendimento)
    {
        this.percentualRendimento = percentualRendimento;
    }

    public double getSaldo()
    {
        return this.saldo;
    }

}
