package util;

/**
 * Escreva a descrição da classe Formatter aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Formatter
{
    public String formataTelefone(String telefone)
    {
        String telefoneFormatado;
        
        telefoneFormatado = "(" + telefone.substring(0, 2) + ") " + telefone.charAt(2) + " " + telefone.substring(3, 7) + "-" + telefone.substring(7, 11);
        
        return telefoneFormatado;
    }
    
    public String formataCpf(String cpf)
    {
        String cpfFormatado;
        
        cpfFormatado = cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11);
        
        return cpfFormatado;
    }
}
