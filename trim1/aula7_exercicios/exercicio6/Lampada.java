package exercicio6;

/**
 * 6. Considere a classe Lampada dos exercícios anteriores crie um método get e set que garanta que a potencia esteja em uma escala de 1 a 1000.
 */

public class Lampada
{
    private boolean ligada;
    private int potenciaEmWatts;
    
    public Lampada(boolean ligada, int potenciaEmWatts) // método construtor
    {
        this.setLampadaLigada(ligada);
        this.setPotenciaEmWatts(potenciaEmWatts);
    }
    
    public Lampada(boolean ligada) // método construtor
    {
        this.setLampadaLigada(ligada);
        this.setPotenciaEmWatts(60);
    }
    
    public void setPotenciaEmWatts(int potenciaEmWatts)
    {
        if(potenciaEmWatts >= 1 && potenciaEmWatts <= 1000)
        {
            this.potenciaEmWatts = potenciaEmWatts;
        }
        else
        {
            System.out.println("A potência indicada é inválida! A potência deve estar em uma escala de 1 a 1000 watts.");
        }
    }
    
    private int getPotenciaEmWatts()
    {
        return this.potenciaEmWatts;
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
