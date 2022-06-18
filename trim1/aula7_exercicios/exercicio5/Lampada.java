package exercicio5;

/**
 * 5. Considere a classe Lampada que também representa o número de watts da lâmpada (veja o exercício 4).
 * Escreva dois construtores para a classe: um que recebe como argumentos o número de watts da lâmpada,
 * e outro, sem argumentos, que considera que a lâmpada tem 60 watts por default.
 */

public class Lampada
{
    private boolean ligada;
    private int potenciaEmWatts;
    
    public Lampada(boolean ligada, int potenciaEmWatts) // método construtor
    {
        this.setLampadaLigada(ligada);
        this.potenciaEmWatts = potenciaEmWatts;
    }
    
    public Lampada(boolean ligada) // método construtor
    {
        this.setLampadaLigada(ligada);
        this.potenciaEmWatts = 60;
    }
    
    private void setLampadaLigada(boolean ligada)
    {
        this.ligada = ligada;
    }
    
    private boolean getLampadaLigada()
    {
        return this.ligada;
    }
    
    public void interruptor()
    {
        if(this.getLampadaLigada())
        {
            this.setLampadaLigada(false);
            this.verificarEstadoLampada();
        }
        else
        {
            this.setLampadaLigada(true);
            this.verificarEstadoLampada();
        }
    }
    
    public void verificarEstadoLampada()
    {
        if(this.getLampadaLigada())
        {
            System.out.println("Lâmpada acesa!");
        }
        else
        {
            System.out.println("Lâmpada apagada!");
        }
    }
}
