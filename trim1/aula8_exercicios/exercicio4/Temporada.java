package exercicio4;
import java.util.*;
import javax.swing.JOptionPane;
import util.Validator;

public class Temporada
{
    private String nome;
    private int numeroTemporada, numeroDeEpisodios;
    private ArrayList<Episodio> episodios = new ArrayList<Episodio>();
    private Validator validator = new Validator();
    
    public Temporada(int numeroTemporada, String nome, Episodio episodio)
    {
        this.setNumeroTemporada(numeroTemporada);
        this.setNome(nome);
        this.setNumeroDeEpisodios();
        this.addEpisodio(episodio);
    }
    
    public void setNumeroTemporada(int numeroTemporada)
    {
        if(validator.validaNumeroTemporada(numeroTemporada))
        {
            this.numeroTemporada = numeroTemporada;
        }
    }
    
    public int getNumeroTemporada()
    {
        return this.numeroTemporada;
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
    
    public void addEpisodio(Episodio episodio)
    {
        if(!this.episodios.contains(episodio))
        {
            this.episodios.add(episodio);
            
            this.setNumeroDeEpisodios();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Esse episódio já está inserido nesta temporada.");
        }
    }
    
    public String getEpisodios(boolean printOnScreen)
    {
        if(this.episodios.size() > 0)
        {
            String listaDeEpisodios = "";
            
            for(Episodio episodio : episodios)
            {
                listaDeEpisodios += episodio.toString() + "\n\n";
            }
            
            if(printOnScreen)
            {
                JOptionPane.showMessageDialog(null, listaDeEpisodios);
            }
            
            return listaDeEpisodios;
        }
        else
        {
            if(printOnScreen)
            {
                JOptionPane.showMessageDialog(null, "Ainda não há episódios nesta temporada.");
            }
            
            return "Ainda não há episódios nesta temporada.";
        }
    }
    
    public void setNumeroDeEpisodios()
    {
        this.numeroDeEpisodios = this.episodios.size();
    }
    
    public int getNumeroDeEpisodios()
    {
        return this.numeroDeEpisodios;
    }
    
    @Override
    public String toString()
    {
        return "Nº Temporada: " + this.getNumeroTemporada() + "\nNome: " + this.getNome() + "\nNº Episódios: " + this.getNumeroDeEpisodios() + "\n\n>> Episódios <<\n\n" + this.getEpisodios(false);
    }
}
