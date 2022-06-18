package exercicio1;
import javax.swing.JOptionPane;

/**
 * Representa o livro a ser pego por empréstimo
 * 
 * @author Filipe Mallmann Siota 
 * @version 07/05/2022
 */
public class Livro
{
    private String nome, autor, editora, idioma;
    
    /**
     * Contrói e inicializa um Livro com seu nome, autor, editora e idioma.
     * 
     * @param nome indica o nome do livro
     * @param autor indica o autor do livro
     * @param editora indica a editora do livro
     * @param idioma indica o idioma do livro
     */
    public Livro(String nome, String autor, String editora, String idioma)
    {
        this.setNome(nome);
        this.setAutor(autor);
        this.setEditora(editora);
        this.setIdioma(idioma);
    }
    
    /**
     * Contrói e inicializa um Livro com seu nome, autor, editora e idioma por leitura de dados em tela.
     * 
     * @param nome indica o nome do livro
     * @param autor indica o autor do livro
     * @param editora indica a editora do livro
     * @param idioma indica o idioma do livro
     */
    public Livro()
    {
        String valor;
        
        valor = JOptionPane.showInputDialog("Digite o nome do livro:");
        this.setNome(valor);
        
        valor = JOptionPane.showInputDialog("Digite o autor do livro:");
        this.setAutor(valor);
        
        valor = JOptionPane.showInputDialog("Digite a editora do livro:");
        this.setEditora(valor);
        
        valor = JOptionPane.showInputDialog("Digite o idioma do livro:");
        this.setIdioma(valor);
    }
    
    /**
     * @param nome novo valor para o nome do livro
     */
    public void setNome(String nome)
    {
        if(nome.length() > 0)
        {
            this.nome = nome;
        }
        else
        {
            System.out.println("Nome inválido! Você deixou o campo nome em branco.");
        }
    }
    
    /**
     * @return o nome do livro
     */
    public String getNome()
    {
        return this.nome;
    }
    
    /**
     * @param autor novo valor para o autor do livro
     */
    public void setAutor(String autor)
    {
        if(autor.length() > 0)
        {
            this.autor = autor;
        }
        else
        {
            System.out.println("Autor inválido! Você deixou o campo autor em branco.");
        }
    }
    
    /**
     * @return o autor do livro
     */
    public String getAutor()
    {
        return this.autor;
    }
    
    /**
     * @param editora novo valor para a editora do livro
     */
    public void setEditora(String editora)
    {
        if(editora.length() > 0)
        {
            this.editora = editora;
        }
        else
        {
            System.out.println("Editora inválida! Você deixou o campo editora em branco.");
        }
    }
    
    /**
     * @return a editora do livro
     */
    public String getEditora()
    {
        return this.editora;
    }
    
    /**
     * @param idioma novo valor para o idioma do livro
     */
    public void setIdioma(String idioma)
    {
        if(idioma.length() > 0)
        {
            this.idioma = idioma;
        }
        else
        {
            System.out.println("Idioma inválido! Você deixou o campo idioma em branco.");
        }
    }
    
    /**
     * @return o idioma do livro
     */
    public String getIdioma()
    {
        return this.idioma;
    }
    
    /**
     * Exibe as informações sobre o livro na tela.
     * 
     * @return o objeto instanciado a Livro formatado em String
     */
    public void exibirInfoLivro()
    {
        JOptionPane.showMessageDialog(null, this.toString());
    }
    
    @Override
    public String toString()
    {
        return "Nome: " + this.getNome() + "\nAutor: " + this.getAutor() + "\nEditora: " + this.getEditora() + "\nIdioma: " + this.getIdioma();
    }
}
