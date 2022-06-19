package exercicio4;
import java.util.*;
import javax.swing.JOptionPane;

public class Lancamentos
{
    private ArrayList<Filme> filmes = new ArrayList<Filme>();
    private ArrayList<Serie> series = new ArrayList<Serie>();
    
    public void addFilme(Filme filme)
    {
        if(!this.filmes.contains(filme))
        {
            this.filmes.add(filme);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Esse filme já está inserido nos lançamentos.");
        }
    }
    
    public String getFilmes(boolean printOnScreen)
    {
        if(this.filmes.size() > 0)
        {
            String listaDeFilmes = "";
            
            for(Filme filme : filmes)
            {
                listaDeFilmes += filme.toString() + "\n\n--\n\n";
            }
            
            if(printOnScreen)
            {
                JOptionPane.showMessageDialog(null, listaDeFilmes);
            }
            
            return listaDeFilmes;
        }
        else
        {
            if(printOnScreen)
            {
                JOptionPane.showMessageDialog(null, "Ainda não há filmes entre os lançamentos.");
            }
            
            return "Ainda não há filmes entre os lançamentos.";
        }
    }
    
    public void addSerie(Serie serie)
    {
        if(!this.series.contains(serie))
        {
            this.series.add(serie);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Essa série já está inserida nos lançamentos.");
        }
    }
    
    public String getSeries(boolean printOnScreen)
    {
        if(this.series.size() > 0)
        {
            String listaDeSeries = "";
            
            for(Serie serie : series)
            {
                listaDeSeries += serie.toString();
            }
            
            if(printOnScreen)
            {
                JOptionPane.showMessageDialog(null, listaDeSeries);
            }
            
            return listaDeSeries;
        }
        else
        {
            if(printOnScreen)
            {
                JOptionPane.showMessageDialog(null, "Ainda não há séries entre os lançamentos.");
            }
            
            return "Ainda não há séries entre os lançamentos.";
        }
    }
    
    @Override
    public String toString()
    {
        return ">> Filmes <<\n\n" + this.getFilmes(false) + ">> Séries <<\n\n" + this.getSeries(false);
    }
}
