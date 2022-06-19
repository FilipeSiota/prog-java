package exercicio3;
import java.util.*;
import javax.swing.JOptionPane;
import util.Validator;

public class Concerto
{
    private String descricao;
    private ArrayList<Peca> pecas = new ArrayList<Peca>();
    private double custo;
    private Validator validator = new Validator();
    
    public Concerto()
    {
        this.setDescricao();
        this.addPeca();
        this.setCusto();
    }
    
    public void setDescricao()
    {
        String descricao = JOptionPane.showInputDialog("Informe uma descrição para o concerto: ");
        
        if(validator.validaNome(descricao))
        {
            this.descricao = descricao;
        }
    }
    
    public String getDescricao()
    {
        return this.descricao;
    }
    
    /**
     * method split()
     * @link https://www.alura.com.br/artigos/como-separar-palavras-de-string-em-java
     */
    public void addPeca()
    {
        String pecas = JOptionPane.showInputDialog("Informe as peças necessárias para o concerto:\nSiga este modelo (nomePeca/preco/quantidade; nomePeca/preco/quantidade)\nEx.: Pneu/69.99/4; Volante/28.79/1");
        
        String[] pecasSeparadas = pecas.split(";|;\\s|/");
        
        System.out.println(Arrays.toString(pecasSeparadas));
        
        for(int peca = 0; peca < pecasSeparadas.length; peca++)
        {
            Peca novaPeca = new Peca(pecasSeparadas[peca], Double.parseDouble(pecasSeparadas[++peca]), Integer.parseInt(pecasSeparadas[++peca]));
            
            this.pecas.add(novaPeca);
        }
    }
    
    public String getPecas(boolean printOnScreen)
    {
        if(this.pecas.size() > 0)
        {
            String listaDePecas = "";
        
            for(Peca peca : this.pecas)
            {
                listaDePecas += peca.toString() + "\n\n";
            }
            
            if(printOnScreen)
            {
                JOptionPane.showMessageDialog(null, listaDePecas);
            }
            
            return listaDePecas;
        }
        else
        {
            if(printOnScreen)
            {
                JOptionPane.showMessageDialog(null, "Nenhuma peça está vinculada a este concerto.");
            }
            
            return "Nenhuma peça está vinculada a este concerto.";
        }
    }
    
    public void setCusto()
    {
        this.custo = 0.0;
        
        for(Peca peca : this.pecas)
        {
            this.custo += peca.getPreco() * peca.getQuantidade();
        }
    }
    
    public double getCusto()
    {
        return this.custo;
    }
    
    @Override
    public String toString()
    {
        return "Descrição: " + this.getDescricao() + "\n\n- Lista de peças\n\n" + this.getPecas(false) + "Custo: R$" + this.getCusto();
    }
}
