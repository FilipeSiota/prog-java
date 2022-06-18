package exercicio4;

/**
 * 4. Escreva um construtor para a classe Lampada de forma que instâncias desta só possam ser criadas se um estado inicial for passado para o construtor.
 * Esse estado pode ser o valor booleano que indica se a lâmpada está acesa (true) ou apagada (false).
 * Crie o método interruptor para trocar o estado e dizer se a lâmpada está acesa ou apagada.
 * Crie um método que exiba se a mesma está acesa ou apagada.
 */

public class Lampada
{
    private boolean ligada;
    
    public Lampada(boolean ligada) // método construtor
    {
        this.setLampadaLigada(ligada);
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
