package exercicio2;
import java.util.*;
import util.Validator;
import util.Formatter;

public class Contato
{
    private String nome, email;
    private ArrayList<String> telefones = new ArrayList<String>();
    private Validator validator = new Validator();
    private Formatter formatter = new Formatter();
    
    public Contato(String nome, String email, String telefone)
    {
        this.setNome(nome);
        this.setEmail(email);
        this.addTelefone(telefone);
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
    
    public void addTelefone(String telefone)
    {
        if(validator.validaTelefone(telefone))
        {
            this.telefones.add(telefone);
        }
    }
    
    public void removeTelefone(String telefone)
    {
        if(validator.validaTelefone(telefone))
        {
            if(this.telefones.contains(telefone))
            {
                this.telefones.remove(this.telefones.indexOf(telefone));
                
                System.out.println("Telefone excluído com sucesso!");
            }
            else
            {
                System.out.println("O telefone informado para exclusão não existe no contato <" + this.nome + ">!");
            }
        }
    }
    
    public String getTelefones()
    {
        String telefones = "";
    
        for(int i = 0; i < this.telefones.size(); i++)
        {
            telefones += "\t" + formatter.formataTelefone(this.telefones.get(i)) + "\n";
        }
        
        return telefones;
    }
    
    public void setEmail(String email)
    {
        if(validator.validaEmail(email))
        {
            this.email = email;
        }
    }
    
    public String getEmail()
    {
        return this.email;
    }
    
    public void listarTelefones()
    {
        System.out.println("Lista de números de telefones do contato <" + this.nome + ">:\n" + this.getTelefones());
    }
}
