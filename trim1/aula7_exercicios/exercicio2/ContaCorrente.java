package exercicio2;

/**
 * 2. Crie uma classe conta corrente que possua métodos sacar e depositar. Garanta que o saldo da conta seja apenas alterada por esses métodos.
 * Crie um construtor que garanta um valor válido e outro que já possua um valor inicial usado para transferências de contas.
 */

public class ContaCorrente
{
    private double saldo;
    
    public ContaCorrente()
    {
        this.saldo = 500;
        
        System.out.println("Saldo atual: R$" + this.saldo);
    }
    
    public ContaCorrente(double saldoInicial)
    {
        if(saldoInicial > 0)
        {
            this.saldo = saldoInicial;
        }
        else
        {
            this.saldo = 0;
            
            System.out.println("O valor inserido para o saldo inicial é inválido!");
        }
        
        System.out.println("Saldo atual: R$" + this.saldo);
    }
    
    public void sacar(double valor)
    {
        if(valor <= this.saldo)
        {
            this.saldo -= valor;
            
            System.out.println("O seu saldo após o saque é: R$" + this.saldo);
        }
        else
        {
            System.out.println("Não é permitido sacar um valor maior que o seu saldo atual!");
            System.out.println("Saldo atual: R$" + this.saldo);
        }
    }
    
    public void depositar(double valor)
    {
        this.saldo += valor;
        
        System.out.println("O seu saldo após o depósito é: R$" + this.saldo);
    }
}
