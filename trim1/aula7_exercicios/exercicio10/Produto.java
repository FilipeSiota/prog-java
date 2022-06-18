package exercicio10;

/**
 * 10. Transforme a classe Produto para o padrão JQuery de getter e setter.
 */

public class Produto
{
    private String nome;
    private double preco;
    private double descontoMaximo, desconto;
    private int parcelasMaximo, parcelas;
    
    public Produto(String nome, double preco) // método construtor
    {
        this.nome(nome);
        this.preco(preco);
        this.descontoMaximo(20);
        this.parcelasMaximo(24);
        this.desconto(0);
        this.parcelas(1);
    }
    
    public void nome(String nome)
    {
        if(nome.length() >= 2)
        {
            this.nome = nome;
        }
        else
        {
            System.out.println("Nome inválido! O nome do produto deve ter ao menos 2 caracteres.");
        }
    }
    
    private String nome()
    {
        return this.nome;
    }
    
    public void preco(double preco)
    {
        if(preco >= 0.01)
        {
            this.preco = preco;
        }
        else
        {
            System.out.println("Preço inválido! O preco mínimo para um produto é de R$0,01 (1 centavo).");
        }
    }
    
    private double preco()
    {
        return this.preco;
    }
    
    private void descontoMaximo(double descontoMaximo)
    {
        this.descontoMaximo = descontoMaximo;
    }
    
    private double descontoMaximo()
    {
        return this.descontoMaximo;
    }
    
    private void parcelasMaximo(int parcelasMaximo)
    {
        this.parcelasMaximo = parcelasMaximo;
    }
    
    private int parcelasMaximo()
    {
        return this.parcelasMaximo;
    }
    
    public void desconto(double desconto)
    {
        if(desconto >= 0 && desconto <= descontoMaximo)
        {
            this.desconto = desconto;
        }
        else
        {
            System.out.println("Desconto inválido! O desconto pode ir de 0.0% a no máximo " + this.descontoMaximo + "%.");
        }
    }
    
    private double desconto()
    {
        return this.desconto;
    }
    
    public void parcelas(int parcelas)
    {
        if(parcelas >= 1 && parcelas <= parcelasMaximo)
        {
            this.parcelas = parcelas;
        }
        else
        {
            System.out.println("Número de parcelas inválido! O número de parcelas pode ir de 1 a no máximo " + this.parcelasMaximo + ".");
        }
    }
    
    private int parcelas()
    {
        return this.parcelas;
    }
}