package exercicio2;
import java.util.*;
import validation.Validator;

public class Contato
{
    private String nome, email;
    private ArrayList<String> telefones = new ArrayList<String>();
    private Validator validator = new Validator();
    
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
            telefones += "\t" + this.telefones.get(i) + "\n";
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
    
    private String formatarTelefone(String telefone)
    {
        String telefoneFormatado;
        
        telefoneFormatado = "(" + telefone.substring(0, 2) + ") " + telefone.charAt(2) + " " + telefone.substring(3, 7) + "-" + telefone.substring(7, 11);
        
        return telefoneFormatado;
    }
    
    public void listarTelefones()
    {
        System.out.println("Lista de números de telefones do contato <" + this.nome + ">:\n" + this.getTelefones());
    }
}
