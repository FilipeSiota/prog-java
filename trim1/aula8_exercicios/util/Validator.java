package util;
import javax.swing.JOptionPane;

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
            JOptionPane.showMessageDialog(null, "Dado inválido! Este campo deve receber no mínimo 2 caracteres.");
            
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
            JOptionPane.showMessageDialog(null, "Telefone inválido! O telefone deve seguir o padrão (DDD + 9 + XXXX-XXXX), colocando apenas os números.");
            
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
            JOptionPane.showMessageDialog(null, "Email inválido! O email deve seguir o padrão (email@provedor.complemento).");
            
            return false;
        }
    }
    
    public boolean validaCpf(String cpf)
    {
        if(cpf.length() == 11)
        {
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "CPF inválido! O CPF deve seguir o padrão (000.000.000-00), colocando apenas os números.");
            
            return false;
        }
    }
    
    public boolean validaIdade(int idade)
    {
        if(idade >= 0)
        {
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Idade inválida! O campo idade não recebe valores negativos.");
            
            return false;
        }
    }
    
    public boolean validaPotencia(double potencia)
    {
        if(potencia > 0)
        {
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Potência inválida! O campo potência só recebe valores maiores que zero.");
            
            return false;
        }
    }
    
    public boolean validaPreco(double preco)
    {
        if(preco > 0)
        {
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Preço inválido! O preço deve ser maior que zero.");
            
            return false;
        }
    }
    
    public boolean validaQuantidade(int quantidade)
    {
        if(quantidade > 0)
        {
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Quantidade inválida! A quantidade deve ser maior que zero.");
            
            return false;
        }
    }
    
    public boolean validaTempo(int tempo)
    {
        if(tempo > 0)
        {
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Tempo inválido! O tempo deve ser maior que zero.");
            
            return false;
        }
    }
    
    public boolean validaNumeroEp(int numeroEp)
    {
        if(numeroEp > 0)
        {
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Número do episódio inválido! O número do episódio deve ser maior que zero.");
            
            return false;
        }
    }
    
    public boolean validaNumeroTemporada(int numeroTemporada)
    {
        if(numeroTemporada > 0)
        {
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Número da temporada inválido! O número da temporada deve ser maior que zero.");
            
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
