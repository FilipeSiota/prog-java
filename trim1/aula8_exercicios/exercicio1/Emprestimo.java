package exercicio1;
import javax.swing.JOptionPane;

/**
 * Representa os empréstimos de Livro feitos por Pessoa
 * 
 * @author Filipe Mallmann Siota 
 * @version 07/05/2022
 */
public class Emprestimo
{
    private Pessoa portadorDoLivro;
    private Livro livro;
    private Data dataRetirada, dataDevolucao;
    private int duracaoDoEmprestimoEmDias;
    
    /**
     * Constrói e inicializa um Emprestimo com o portador do livro, livro, data da retirada e duração do empréstimo em dias.
     * 
     * @param portadorDoLivro um objeto instanciado a classe Pessoa
     * @param livro um objeto instanciado a classe Livro
     * @param diaRetirada dia da data de retirada
     * @param mesRetirada mês da data de retirada
     * @param anoRetirada ano da data de retirada
     * @param duracaoDoEmprestimoEmDias duração do empréstimo em dias
     */
    public Emprestimo(Pessoa portadorDoLivro, Livro livro, int diaRetirada, int mesRetirada, int anoRetirada, int duracaoDoEmprestimoEmDias)
    {
        this.setPortadorDoLivro(portadorDoLivro);
        this.setLivro(livro);
        this.dataRetirada = new Data(diaRetirada, mesRetirada, anoRetirada);
        this.setDuracaoDoEmprestimoEmDias(duracaoDoEmprestimoEmDias);
    }
    
    /**
     * Constrói e inicializa um Emprestimo com o portador do livro, livro, data da retirada e duração do empréstimo em dias.
     * 
     * @param portadorDoLivro um objeto instanciado a classe Pessoa
     * @param livro um objeto instanciado a classe Livro
     * @param diaRetirada dia da data de retirada
     * @param mesRetirada mês da data de retirada
     * @param anoRetirada ano da data de retirada
     * @param duracaoDoEmprestimoEmDias duração do empréstimo em dias
     */
    public Emprestimo(Pessoa portadorDoLivro, Livro livro)
    {
        String valor;
        int dia, mes, ano;
        
        this.setPortadorDoLivro(portadorDoLivro);
        this.setLivro(livro);
        
        valor = JOptionPane.showInputDialog("Digite o dia da retirada:");
        dia = Integer.parseInt(valor);
        
        valor = JOptionPane.showInputDialog("Digite o mês da retirada:");
        mes = Integer.parseInt(valor);
        
        valor = JOptionPane.showInputDialog("Digite o ano da retirada:");
        ano = Integer.parseInt(valor);
        
        this.dataRetirada = new Data(dia, mes, ano);
        
        valor = JOptionPane.showInputDialog("Digite a duração do empréstimo em dias:");
        this.setDuracaoDoEmprestimoEmDias(Integer.parseInt(valor));
    }
    
    /**
     * @param portadorDoLivro um objeto instanciado a classe Pessoa
     */
    public void setPortadorDoLivro(Pessoa portadorDoLivro)
    {
        this.portadorDoLivro = portadorDoLivro;
    }
    
    /**
     * @return o objeto portadorDoLivro formatado para String
     */
    public String getPortadorDoLivro()
    {
        return this.portadorDoLivro.toString();
    }
    
    /**
     * @param livro um objeto instanciado a classe Livro
     */
    public void setLivro(Livro livro)
    {
        this.livro = livro;
    }
    
    /**
     * @return o objeto livro formatado para String
     */
    public String getLivro()
    {
        return this.livro.toString();
    }
    
    /**
     * @param diaRetirada dia da data de retirada
     * @param mesRetirada mês da data de retirada
     * @param anoRetirada ano da data de retirada
     */
    public void setDataRetirada(int dia, int mes, int ano)
    {
        this.dataRetirada.setData(dia, mes, ano);
    }
    
    /**
     * @return a data de retirada formatada pela classe Data
     */
    public String getDataRetirada()
    {
        return this.dataRetirada.toString();
    }
    
    /**
     * @param duracaoDoEmprestimoEmDias duração do empréstimo em dias
     */
    public void setDuracaoDoEmprestimoEmDias(int duracaoDoEmprestimoEmDias)
    {
        if(duracaoDoEmprestimoEmDias > 0)
        {
            this.duracaoDoEmprestimoEmDias = duracaoDoEmprestimoEmDias;
            
            this.setDataDevolucao(duracaoDoEmprestimoEmDias);
        }
        else
        {
            System.out.println("Duração do empréstimo inválida! A duração do empréstimo deve ser de no mínimo 1 dia.");
        }
    }
    
    /**
     * @return a duração do empréstimo em dias
     */
    public int getDuracaoDoEmprestimoEmDias()
    {
        return this.duracaoDoEmprestimoEmDias;
    }
    
    /**
     * Calcula a data da devolução baseando-se na data de retirada e na duração do empréstimo em dias
     * 
     * @param diasFuturo duração do empréstimo em dias
     */
    private void setDataDevolucao(int diasFuturo)
    {
        this.dataDevolucao = this.dataRetirada.calcularDataFutura(diasFuturo);
    }
    
    /**
     * @return a data de devolução formatada pela classe Data
     */
    public String getDataDevolucao()
    {
        return this.dataDevolucao.toString();
    }
    
    /**
     * Exibe as informações sobre o empréstimo na tela.
     * 
     * @return o objeto instanciado a Emprestimo formatado em String
     */
    public void exibirInfoEmprestimo()
    {
        JOptionPane.showMessageDialog(null, this.toString());
    }
    
    @Override
    public String toString()
    {
        return ">> Portador do livro\n" + this.getPortadorDoLivro() + "\n\n>> Livro\n" + this.getLivro() + "\n\nData de retirada: " + this.getDataRetirada() + "\nData de devolução: " + this.getDataDevolucao() + "\nDuração do empréstimo: " + this.getDuracaoDoEmprestimoEmDias() + " dia(s)";
    }
}
