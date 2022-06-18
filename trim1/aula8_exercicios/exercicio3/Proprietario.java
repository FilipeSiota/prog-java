package exercicio3;
import javax.swing.JOptionPane;
import validation.Validator;

public class Proprietario
{
    private String nome, cnh, cpf;
    private Validator validator = new Validator();
    
    public void setNome(String nome)
    {
        if(validator.validaNome(nome))
        {
            this.nome = nome;
        }
    }
}
