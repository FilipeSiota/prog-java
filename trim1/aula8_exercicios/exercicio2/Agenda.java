package exercicio2;
import java.util.*;
import util.Validator;

public class Agenda
{
    private String nome, descricao;
    private ArrayList<Contato> contatos = new ArrayList<Contato>();
    private Validator validator = new Validator();
    
    public Agenda(String nome, String descricao, Contato contato)
    {
        this.setNome(nome);
        this.setDescricao(descricao);
        this.addContato(contato);
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
    
    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }
    
    public String getDescricao()
    {
        if(validator.possuiDescricao(this.descricao))
        {
            return this.descricao;
        }
        else
        {
            return "Sem descrição";
        }
    }
    
    public void addContato(Contato contato)
    {
        if(this.contatos.contains(contato))
        {
            System.out.println("A agenda já possui esse contato.");
        }
        else
        {
            this.contatos.add(contato);
        }
    }
    
    public void removeContato(Contato contato)
    {
        if(this.contatos.contains(contato))
        {
            this.contatos.remove(this.contatos.indexOf(contato));
            
            System.out.println("Contato excluído com sucesso!");
        }
        else
        {
            System.out.println("O contato informado para exclusão não existe na agenda <" + this.nome + ">!");
        }
    }
    
    public Contato getContato(String telefone)
    {
        if(validator.validaTelefone(telefone))
        {
            for(Contato contato : this.contatos) // para cada contato em contatos
            {
                if(contato.getTelefones().contains(telefone))
                {
                    return contato;
                }
            }
        }
        
        // se nenhum contato foi retornado
        System.out.println("O telefone informado não consta em nenhum contato desta agenda.");
        
        return null;
    }
    
    public void listarContatos()
    {
        System.out.println("Lista de contatos da agenda <" + this.nome + ">:");
        
        for(Contato contato : this.contatos) // para cada contato em contatos
        {
            System.out.println("Nome: " + contato.getNome() + "\nE-mail: " + contato.getEmail() + "\nTelefone(s):\n" + contato.getTelefones());
        }
    }
}