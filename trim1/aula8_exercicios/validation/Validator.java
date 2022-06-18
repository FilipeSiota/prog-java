package validation;

public class Validator
{
    public boolean validaNome(String nome)
    {
        if(nome.length() >= 2)
        {
            return true;
        }
        else
        {
            System.out.println("Nome inválido! O nome deve ter no mínimo 2 caracteres.");
            
            return false;
        }
    }
    
    public boolean validaTelefone(String telefone)
    {
        if(telefone.length() == 11 && telefone.charAt(2) == '9')
        {
            return true;
        }
        else
        {
            System.out.println("Telefone inválido! O telefone deve seguir o padrão (DDD + 9 + XXXX-XXXX), colocando apenas os números.");
            
            return false;
        }
    }
    
    public boolean validaEmail(String email)
    {
        if(email.contains("@") && email.contains("."))
        {
            return true;
        }
        else
        {
            System.out.println("Email inválido! O email deve seguir o padrão (email@provedor.complemento).");
            
            return false;
        }
    }
    
    public boolean possuiDescricao(String descricao)
    {
        if(descricao.isEmpty())
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
