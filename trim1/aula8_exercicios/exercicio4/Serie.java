package exercicio4;
import java.util.*;
import javax.swing.JOptionPane;
import util.Validator;

public class Serie
{
    private String nome, descricao, categoria;
    private int numeroDeTemporadas;
    private ArrayList<Temporada> temporadas = new ArrayList<Temporada>();
    private Validator validator = new Validator();
    
    public Serie(String nome, String descricao, String categoria, Temporada temporada)
    {
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setCategoria(categoria);
        this.setNumeroDeTemporadas();
        this.addTemporada(temporada);
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
    
    public void addTemporada(Temporada temporada)
    {
        if(!this.temporadas.contains(temporada))
        {
            this.temporadas.add(temporada);
            
            this.setNumeroDeTemporadas();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Essa temporada já está inserida nesta série.");
        }
    }
    
    public String getTemporadas(boolean printOnScreen)
    {
        if(this.temporadas.size() > 0)
        {
            String listaDeTemporadas = "";
            
            for(Temporada temporada : temporadas)
            {
                listaDeTemporadas += temporada.toString() + "--\n\n";
            }
            
            if(printOnScreen)
            {
                JOptionPane.showMessageDialog(null, listaDeTemporadas);
            }
            
            return listaDeTemporadas;
        }
        else
        {
            if(printOnScreen)
            {
                JOptionPane.showMessageDialog(null, "Ainda não há temporadas nesta série.");
            }
            
            return "Ainda não há temporadas nesta série.";
        }
    }
    
    public void setNumeroDeTemporadas()
    {
        this.numeroDeTemporadas = this.temporadas.size();
    }
    
    public int getNumeroDeTemporadas()
    {
        return this.numeroDeTemporadas;
    }
    
    @Override
    public String toString()
    {
        return "Nome: " + this.getNome() + "\nDescrição: " + this.getDescricao() + "\nCategoria: " + this.getCategoria() + "\nNº Temporadas: " + this.getNumeroDeTemporadas() + "\n\n>> Temporadas <<\n\n" + this.getTemporadas(false);
    }
}
