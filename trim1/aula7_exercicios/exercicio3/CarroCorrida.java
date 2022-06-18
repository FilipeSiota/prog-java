package exercicio3;

/**
 * 3. Crie uma classe
 * Classe CarroCorrida
 * 
 * >> Atributos:
 * - numeroCarro : int
 * - piloto : String
 * - equipe : String
 * - velocidadeMaxima : float
 * - velocidadeAtual : float
 * - ligado : boolean
 * 
 * >> Métodos:
 * + CarroCorrida(int numeroCarro, String piloto, String equipe, float velocidadeMaxima) - "Construtor"
 * + set... (alterar atributos da Classe - "Modificadores")
 * + get... (retorna valores dos atributos da Classe - "Acessores")
 * + acelerar(float) - aumenta unidades em Km/h
 * + frear(float) - reduz a velocidade em percentual (%) de frenagem
 * + parar()
 * + ligar()
 * + desligar()
 * 
 * >> Observações:
 * - Não ultrapassar a velocidade máxima
 * - Frear e Acelerar só funcionam se o carro estiver ligado
 * - Desligar só funciona se o carro estiver parado
 */

public class CarroCorrida
{
    private int numeroCarro;
    private String piloto, equipe;
    private double velocidadeMaxima, velocidadeAtual;
    private boolean ligado;
    
    public CarroCorrida(int numeroCarro, String piloto, String equipe, double velocidadeMaxima) // método construtor
    {
        this.setNumeroCarro(numeroCarro);
        this.setPiloto(piloto);
        this.setEquipe(equipe);
        this.setVelocidadeMaxima(velocidadeMaxima);
        this.setVelocidadeAtual(0);
        this.setCarroLigado(false);
    }
    
    public void setNumeroCarro(int numeroCarro)
    {
        this.numeroCarro = numeroCarro;
    }
    
    private int getNumeroCarro()
    {
        return this.numeroCarro;
    }
    
    public void setPiloto(String piloto)
    {
        this.piloto = piloto;
    }
    
    private String getPiloto()
    {
        return this.piloto;
    }
    
    public void setEquipe(String equipe)
    {
        this.equipe = equipe;
    }
    
    private String getEquipe()
    {
        return this.equipe;
    }
    
    public void setVelocidadeMaxima(double velocidadeMaxima)
    {
        if(velocidadeMaxima > 0)
        {
            this.velocidadeMaxima = velocidadeMaxima;
        }
        else
        {
            System.out.println("A velocidade máxima informada é inválida!");
        }
    }
    
    private double getVelocidadeMaxima()
    {
        return this.velocidadeMaxima;
    }
    
    private void setVelocidadeAtual(double velocidadeAtual)
    {
        if(velocidadeAtual > 0)
        {
            if(velocidadeAtual <= this.velocidadeMaxima)
            {
                this.velocidadeAtual = velocidadeAtual;
            }
            else
            {
                this.velocidadeAtual = this.velocidadeMaxima;
                
                System.out.println("A sua velocidade atual foi limitada a velocidade máxima de " + this.velocidadeMaxima + " km/h");
            }
        }
        else
        {
            this.velocidadeAtual = 0;
        }
    }
    
    private double getVelocidadeAtual()
    {
        return this.velocidadeAtual;
    }
    
    private void setCarroLigado(boolean ligado)
    {
        this.ligado = ligado;
    }
    
    private boolean getCarroLigado()
    {
        return this.ligado;
    }
    
    public void acelerar(double quantidadeKmPorHr)
    {
        if(this.ligado)
        {
            this.setVelocidadeAtual(this.velocidadeAtual + quantidadeKmPorHr);
            
            System.out.println("Acelerando para " + this.velocidadeAtual + " km/h ...");
        }
        else
        {
            System.out.println("Você precisa LIGAR o carro para poder acelerá-lo!");
        }
    }
   
    public void frear(double porcentagem)
    {
        if(this.ligado)
        {
            if(porcentagem >= 100)
            {
                this.parar();
            }
            else if(porcentagem <= 0)
            {
                System.out.println("O percentual de frenagem informado é inválido!");
            }
            else
            {
                this.setVelocidadeAtual(this.velocidadeAtual - (porcentagem / 100 * this.velocidadeAtual));
                
                System.out.println("Freando para " + this.velocidadeAtual + " km/h ...");
            }
        }
        else
        {
            System.out.println("Você precisa LIGAR o carro para poder freá-lo!");
        }
    }
    
    public void parar()
    {
        if(this.ligado)
        {
            if(this.velocidadeAtual > 0)
            {
                this.setVelocidadeAtual(0);
                
                System.out.println("Parando o carro ...");
            }
            else
            {
                System.out.println("O carro já está parado!");
            }
        }
        else
        {
            System.out.println("Você precisa LIGAR o carro para poder pará-lo!");
        }
    }
    
    public void ligar()
    {
        if(!this.ligado)
        {
            this.setCarroLigado(true);
            
            System.out.println("Ligando o carro ...");
        }
        else
        {
            System.out.println("O carro já está ligado!");
        }
    }
    
    public void desligar()
    {
        if(this.ligado)
        {
            if(this.velocidadeAtual == 0)
            {
                this.setCarroLigado(false);
                
                System.out.println("Desligando o carro ...");
            }
            else
            {
                System.out.println("Você precisa parar o carro para desligá-lo!");
            }
        }
        else
        {
            System.out.println("O carro já está desligado!");
        }
    }
}
