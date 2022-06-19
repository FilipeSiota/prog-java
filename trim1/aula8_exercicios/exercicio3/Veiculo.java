package exercicio3;
import java.util.*;
import javax.swing.JOptionPane;
import util.Validator;

public class Veiculo
{
    private String tipo, marca, modelo;
    private double potenciaDoMotor;
    private Proprietario proprietario;
    private ArrayList<Concerto> concertos = new ArrayList<Concerto>(); 
    private Validator validator = new Validator();
    
    public Veiculo()
    {
        this.setTipo();
        this.setMarca();
        this.setModelo();
        this.setPotenciaDoMotor();
        this.setProprietario();
        this.addConcerto();
    }
    
    public void setTipo()
    {
        String tipo = JOptionPane.showInputDialog("Informe o tipo do veículo (carro, moto, etc):");
        
        if(validator.validaNome(tipo))
        {
            this.tipo = tipo;
        }
    }
    
    public String getTipo()
    {
        return this.tipo = tipo;
    }
    
    public void setMarca()
    {
        String marca = JOptionPane.showInputDialog("Informe a marca do veículo:");
        
        if(validator.validaNome(marca))
        {
            this.marca = marca;
        }
    }
    
    public String getMarca()
    {
        return this.marca;
    }
    
    public void setModelo()
    {
        String modelo = JOptionPane.showInputDialog("Informe o modelo do veículo:");
        
        if(validator.validaNome(modelo))
        {
            this.modelo = modelo;
        }
    }
    
    public String getModelo()
    {
        return this.modelo;
    }
    
    public void setPotenciaDoMotor()
    {
        double potenciaDoMotor = Double.parseDouble(JOptionPane.showInputDialog("Informe a potência do motor do veículo:"));
        
        if(validator.validaPotencia(potenciaDoMotor))
        {
            this.potenciaDoMotor = potenciaDoMotor;
        }
    }
    
    public double getPotenciaDoMotor()
    {
        return this.potenciaDoMotor;
    }
    
    public void setProprietario()
    {
        this.proprietario = new Proprietario();
    }
    
    public String getProprietario()
    {
        return this.proprietario.toString();
    }
    
    public void addConcerto()
    {
        Concerto concerto = new Concerto();
        
        this.concertos.add(concerto);
    }
    
    public String getConcertos(boolean printOnScreen)
    {
        if(this.concertos.size() > 0)
        {
            String listaDeConcertos = "";
        
            for(Concerto concerto : this.concertos)
            {
                listaDeConcertos += concerto.toString() + "\n\n";
            }
            
            if(printOnScreen)
            {
                JOptionPane.showMessageDialog(null, listaDeConcertos);
            }
            
            return listaDeConcertos;
        }
        else
        {
            if(printOnScreen)
            {
                JOptionPane.showMessageDialog(null, "Nenhum concerto está vinculado a este veículo.");
            }
            
            return "Nenhum concerto está vinculado a este veículo.";
        }
    }
    
    public void mostrarInformacoesAoMecanico()
    {
        JOptionPane.showMessageDialog(null, this.toString());
    }
    
    @Override
    public String toString()
    {
        return "Tipo: " + this.getTipo() + "\nMarca: " + this.getMarca() + "\nModelo: " + this.getModelo() + "\nPotência do motor: " + this.getPotenciaDoMotor() + " CV\n\n>> Proprietário <<\n" + this.getProprietario() + "\n\n>> Lista de concertos <<\n\n" + this.getConcertos(false);
    }
}
