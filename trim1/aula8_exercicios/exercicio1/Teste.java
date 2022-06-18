package exercicio1;
import javax.swing.JOptionPane;

/**
 * Testando o funcionamento do programa
 * 
 * @author Filipe Mallmann Siota 
 * @version (um número da versão ou uma data)
 */
public class Teste
{
    public static void main(String... args)
    {
        Pessoa pessoa = new Pessoa();
        Livro livro = new Livro();
        Emprestimo emprestimo = new Emprestimo(pessoa, livro);
        
        System.out.println(pessoa.toString() + "\n--\n" + livro.toString() + "\n--\n" + emprestimo.toString());
    }
}
