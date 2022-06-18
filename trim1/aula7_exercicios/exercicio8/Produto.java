package exercicio8;

/**
 * 8. Crie uma classe Produto que tenha um construtor que inicialize o produto com um nome e um valor.
 * Defina os seguintes valores "default" para a mesma:
 * - Desconto máximo: 20%
 * - Quantidade de parcelas máxima: 24
 * Crie métodos que modifiquem os valores padrões, permitindo apenas valores mais restritos (menos parcelas ou menos desconto)
 * O nome não pode possuir menos que 2 caracteres
 * O preço não pode ser menor que 1 centavo
 */

public class Produto
{
    private String nome;
    private double preco;
    private double descontoMaximo, desconto;
    private int parcelasMaximo, parcelas;
    
    public Produto(String nome, double preco) // método construtor
    {
        this.setNome(nome);
        this.setPreco(preco);
        this.setDescontoMaximo(20);
        this.setParcelasMaximo(24);
        this.setDesconto(0);
        this.setParcelas(1);
    }
    
    public void setNome(String nome)
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
    
    private String getNome()
    {
        return this.nome;
    }
    
    public void setPreco(double preco)
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
    
    private double getPreco()
    {
        return this.preco;
    }
    
    private void setDescontoMaximo(double descontoMaximo)
    {
        this.descontoMaximo = descontoMaximo;
    }
    
    private double getDescontoMaximo()
    {
        return this.descontoMaximo;
    }
    
    private void setParcelasMaximo(int parcelasMaximo)
    {
        this.parcelasMaximo = parcelasMaximo;
    }
    
    private int getParcelasMaximo()
    {
        return this.parcelasMaximo;
    }
    
    public void setDesconto(double desconto)
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
    
    private double getDesconto()
    {
        return this.desconto;
    }
    
    public void setParcelas(int parcelas)
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
    
    private int getParcelas()
    {
        return this.parcelas;
    }
}