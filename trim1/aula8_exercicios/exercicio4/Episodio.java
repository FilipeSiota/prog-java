package exercicio4;
import util.Validator;

public class Episodio
{
    private String nome, descricao;
    private int numeroEp, duracaoEmMinutos;
    private Validator validator = new Validator();
    
    public Episodio(int numeroEp, String nome, String descricao, int duracaoEmMinutos)
    {
        this.setNumeroEp(numeroEp);
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setDuracaoEmMinutos(duracaoEmMinutos);
    }
    
    public void setNumeroEp(int numeroEp)
    {
        if(validator.validaNumeroEp(numeroEp))
        {
            this.numeroEp = numeroEp;
        }
    }
    
    public int getNumeroEp()
    {
        return this.numeroEp;
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
        return "Nome: #" + this.getNumeroEp() + " " + this.getNome() + "\nDescrição: " + this.getDescricao() + "\nDuração: " + this.getDuracaoEmMinutos() + " minutos";
    }
}
