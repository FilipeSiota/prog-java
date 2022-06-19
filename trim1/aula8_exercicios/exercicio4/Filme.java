package exercicio4;
import util.Validator;

public class Filme
{
    private String nome, descricao, categoria;
    private int duracaoEmMinutos;
    private Validator validator = new Validator();
    
    public Filme(String nome, String descricao, String categoria, int duracaoEmMinutos)
    {
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setCategoria(categoria);
        this.setDuracaoEmMinutos(duracaoEmMinutos);
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
    
    public void setDescricao(String descricao)
    {
        if(validator.validaNome(descricao))
        {
            this.descricao = descricao;
        }
    }
    
    public String getDescricao()
    {
        return this.descricao;
    }
    
    public void setCategoria(String categoria)
    {
        if(validator.validaNome(categoria))
        {
            this.categoria = categoria;
        }
    }
    
    public String getCategoria()
    {
        return this.categoria;
    }
    
    public void setDuracaoEmMinutos(int duracaoEmMinutos)
    {
        if(validator.validaTempo(duracaoEmMinutos))
        {
            this.duracaoEmMinutos = duracaoEmMinutos;
        }
    }
    
    public int getDuracaoEmMinutos()
    {
        return this.duracaoEmMinutos;
    }
    
    @Override
    public String toString()
    {
        return "Nome: " + this.getNome() + "\nDescrição: " + this.getDescricao() + "\nCategoria: " + this.getCategoria() + "\nDuração: " + this.getDuracaoEmMinutos() + " minutos";
    }
}
