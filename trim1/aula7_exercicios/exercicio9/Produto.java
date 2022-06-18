package exercicio9;

/**
 * 9. Transforme a classe produto para que possua setters fluentes.
 * Crie uma classe TestaProduto mostrando o funcionamento do setter fluente com desconto de 10% e 12 parcelas.
 */

public class Produto
{
    private String nome;
    private double preco;
    private double descontoMaximo, desconto;
    private int parcelasMaximo, parcelas;
    
    public Produto(String nome, double preco) // método construtor
    {
        this.setNome(nome)
        .setPreco(preco)
        .setDescontoMaximo(20)
        .setParcelasMaximo(24)
        .setDesconto(0)
        .setParcelas(1);
    }
    
    public Produto setNome(String nome) // setter fluente
    {
        if(nome.length() >= 2)
        {
            this.nome = nome;
        }
        else
        {
            System.out.println("Nome inválido! O nome do produto deve ter ao menos 2 caracteres.");
        }
        
        return this;
    }
    
    private String getNome()
    {
        return this.nome;
    }
    
    public Produto setPreco(double preco)
    {
        if(preco >= 0.01)
        {
            this.preco = preco;
        }
        else
        {
            System.out.println("Preço inválido! O preco mínimo para um produto é de R$0,01 (1 centavo).");
        }
        
        return this;
    }
    
    private double getPreco()
    {
        return this.preco;
    }
    
    private Produto setDescontoMaximo(double descontoMaximo)
    {
        this.descontoMaximo = descontoMaximo;
        
        return this;
    }
    
    private double getDescontoMaximo()
    {
        return this.descontoMaximo;
    }
    
    private Produto setParcelasMaximo(int parcelasMaximo)
    {
        this.parcelasMaximo = parcelasMaximo;
        
        return this;
    }
    
    private int getParcelasMaximo()
    {
        return this.parcelasMaximo;
    }
    
    public Produto setDesconto(double desconto)
    {
        if(desconto >= 0 && desconto <= descontoMaximo)
        {
            this.desconto = desconto;
        }
        else
        {
            System.out.println("Desconto inválido! O desconto pode ir de 0.0% a no máximo " + this.descontoMaximo + "%.");
        }
        
        return this;
    }
    
    private double getDesconto()
    {
        return this.desconto;
    }
    
    public Produto setParcelas(int parcelas)
    {
        if(parcelas >= 1 && parcelas <= parcelasMaximo)
        {
            this.parcelas = parcelas;
        }
        else
        {
            System.out.println("Número de parcelas inválido! O número de parcelas pode ir de 1 a no máximo " + this.parcelasMaximo + ".");
        }
        
        return this;
    }
    
    private int getParcelas()
    {
        return this.parcelas;
    }
}