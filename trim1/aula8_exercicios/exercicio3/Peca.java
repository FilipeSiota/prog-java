package exercicio3;
import javax.swing.JOptionPane;
import util.Validator;

public class Peca
{
    private String nome;
    private double preco;
    private int quantidade;
    private Validator validator = new Validator();
    
    public Peca(String nome, double preco, int quantidade)
    {
        this.setNome(nome);
        this.setPreco(preco);
        this.setQuantidade(quantidade);
    }
    
    public void setNome(String nome)
    {
        if(validator.validaNome(nome))
        {
            this.nome = nome;
        }
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public void setPreco(double preco)
    {
        if(validator.validaPreco(preco))
        {
            this.preco = preco;
        }
    }
    
    public double getPreco()
    {
        return this.preco;
    }
    
    public void setQuantidade(int quantidade)
    {
        if(validator.validaQuantidade(quantidade))
        {
            this.quantidade = quantidade;
        }
    }
    
    public int getQuantidade()
    {
        return this.quantidade;
    }
    
    @Override
    public String toString()
    {
        return "Nome: " + this.getNome() + "\nPreço: R$" + this.getPreco() + "\nQuantidade: " + this.getQuantidade();
    }
}
