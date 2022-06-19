package exercicio4;

public class Teste
{
    public static void main(String... args)
    {
        Filme f1 = new Filme("Titanic", "Descrição do Titanic", "Romance", 140);
        Filme f2 = new Filme("Titanic 2", "Descrição do Titanic 2", "Romance", 120);
        Filme f3 = new Filme("Titanic 3", "Descrição do Titanic 3", "Romance", 160);
        Filme f4 = new Filme("Titanic 4", "Descrição do Titanic 4", "Romance", 180);
        
        //System.out.println(f4.toString());
        
        Episodio ep1 = new Episodio(1, "Dear Billy", "The Best Chapter", 75);
        Episodio ep2 = new Episodio(2, "Nina Project", "The Second Best Chapter", 82);
        Episodio ep3 = new Episodio(3, "Dear Billy", "The Best Chapter", 75);
        Episodio ep4 = new Episodio(4, "Nina Project", "The Second Best Chapter", 82);
        Episodio ep5 = new Episodio(5, "Dear Billy", "The Best Chapter", 75);
        Episodio ep6 = new Episodio(6, "Nina Project", "The Second Best Chapter", 82);
        Episodio ep7 = new Episodio(7, "Dear Billy", "The Best Chapter", 75);
        Episodio ep8 = new Episodio(8, "Nina Project", "The Second Best Chapter", 82);
        
        //System.out.println(ep8.toString());
        
        Temporada t1 = new Temporada(1, "Stranger Things", ep1);
        t1.addEpisodio(ep2);
        t1.addEpisodio(ep3);
        t1.addEpisodio(ep4);
        t1.addEpisodio(ep5);
        t1.addEpisodio(ep6);
        t1.addEpisodio(ep7);
        t1.addEpisodio(ep8);
        
        Temporada t2 = new Temporada(2, "Stranger Things 2", ep1);
        t2.addEpisodio(ep2);
        t2.addEpisodio(ep3);
        t2.addEpisodio(ep4);
        t2.addEpisodio(ep5);
        t2.addEpisodio(ep6);
        t2.addEpisodio(ep7);
        t2.addEpisodio(ep8);
        
        Temporada t3 = new Temporada(3, "Stranger Things 3", ep1);
        t3.addEpisodio(ep2);
        t3.addEpisodio(ep3);
        t3.addEpisodio(ep4);
        t3.addEpisodio(ep5);
        t3.addEpisodio(ep6);
        t3.addEpisodio(ep7);
        t3.addEpisodio(ep8);
    
        Temporada t4 = new Temporada(4, "Stranger Things 4", ep1);
        t4.addEpisodio(ep2);
        t4.addEpisodio(ep3);
        t4.addEpisodio(ep4);
        t4.addEpisodio(ep5);
        t4.addEpisodio(ep6);
        t4.addEpisodio(ep7);
        t4.addEpisodio(ep8);
        
        //System.out.println(t4.toString());
        
        Serie s1 = new Serie("STRANGER THINGS", "The Best Series Ever", "Science Fiction", t1);
        s1.addTemporada(t2);
        s1.addTemporada(t3);
        s1.addTemporada(t4);
        
        Serie s2 = new Serie("STRANGER THINGS: STARRING FILIPE MALLMANN SIOTA", "The Best Series Ever With Me", "Science Fiction", t1);
        s2.addTemporada(t2);
        s2.addTemporada(t3);
        s2.addTemporada(t4);
        
        //System.out.println(s2.toString());
        
        MinhaLista ml = new MinhaLista();
        ml.addFilme(f1);
        ml.addFilme(f4);
        ml.addSerie(s1);
        ml.addSerie(s2);
        
        //System.out.println(ml.toString());
        
        Lancamentos l = new Lancamentos();
        l.addFilme(f2);
        l.addFilme(f3);
        l.addSerie(s1);
        l.addSerie(s2);
        
        System.out.println(l.toString());
    }
}
