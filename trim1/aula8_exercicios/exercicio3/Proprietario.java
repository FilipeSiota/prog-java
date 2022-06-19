package exercicio3;
import javax.swing.JOptionPane;
import util.Validator;
import util.Formatter;

public class Proprietario
{
    private String nome, cpf;
    private int idade;
    private Validator validator = new Validator();
    private Formatter formatter = new Formatter();
    
    public Proprietario()
    {
        this.setNome();
        this.setIdade();
        this.setCpf();
    }
    
    public void setNome()
    {
        String nome = JOptionPane.showInputDialog("Informe o nome do proprietário:");
        
        if(validator.validaNome(nome))
        {
            this.nome = nome;
        }
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public void setIdade()
    {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do proprietário:"));
        
        if(validator.validaIdade(idade))
        {
            this.idade = idade;
        }
    }
    
    public int getIdade()
    {
        return this.idade;
    }
    
    public void setCpf()
    {
        String cpf = JOptionPane.showInputDialog("Informe o CPF do proprietário:");
        
        if(validator.validaCpf(cpf))
        {
            this.cpf = cpf;
        }
    }
    
    public String getCpf()
    {
        return this.cpf;
    }
    
    @Override
    public String toString()
    {
        return "Nome: " + this.getNome() + "\nIdade: " + this.getIdade() + "\nCPF: " + formatter.formataCpf(this.getCpf());
    }
}
