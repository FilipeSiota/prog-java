package exercicio1;
import javax.swing.JOptionPane;

/**
 * Representa a pessoa que pegou o livro
 * 
 * @author Filipe Mallmann Siota
 * @version 07/05/2022
 */
public class Pessoa
{
    private String nome, cpf;
    private int idade;
    private char sexo;
    
    /**
     * Constrói e inicializa uma Pessoa com seu nome, CPF, idade e sexo.
     * 
     * @param nome nome da pessoa
     * @param cpf CPF da pessoa (apenas os 11 números)
     * @param idade idade da pessoa (não pode ser negativa)
     * @param sexo sexo da pessoa ('M' para Masculino ou 'F' para Feminino)
     */
    public Pessoa(String nome, String cpf, int idade, char sexo)
    {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setIdade(idade);
        this.setSexo(sexo);
    }
    
    /**
     * Constrói e inicializa uma Pessoa com seu nome, CPF, idade e sexo por leitura de dados em tela.
     * 
     * @param nome nome da pessoa
     * @param cpf CPF da pessoa (apenas os 11 números)
     * @param idade idade da pessoa (não pode ser negativa)
     * @param sexo sexo da pessoa ('M' para Masculino ou 'F' para Feminino)
     */
    public Pessoa()
    {
        String valor;
        
        valor = JOptionPane.showInputDialog("Digite o nome da pessoa:");
        this.setNome(valor);
        
        valor = JOptionPane.showInputDialog("Digite o CPF da pessoa:");
        this.setCpf(valor);
        
        valor = JOptionPane.showInputDialog("Digite a idade da pessoa:");
        this.setIdade(Integer.parseInt(valor));
        
        valor = JOptionPane.showInputDialog("Digite o sexo da pessoa ('M' para Masculino ou 'F' para Feminino):");
        this.setSexo(valor.charAt(0));
    }
    
    /**
     * @param nome novo valor para nome
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
     * @return o nome
     */
    public String getNome()
    {
        return this.nome;
    }
    
    /**
     * @param cpf novo valor para CPF
     */
    public void setCpf(String cpf)
    {
        if(cpf.length() == 11)
        {
            this.cpf = cpf;
        }
        else
        {
            System.out.println("CPF inválido! Você precisa informar 11 algarismos para o CPF.");
        }
    }
    
    /**
     * @return o cpf
     */
    public String getCpf()
    {
        return this.cpf;
    }
    
    /**
     * @param idade novo valor para idade
     */
    public void setIdade(int idade)
    {
        if(idade >= 0)
        {
            this.idade = idade;
        }
        else
        {
            System.out.println("Idade inválida! A idade não pode ser negativa.");
        }
    }
    
    /**
     * @return a idade
     */
    public int getIdade()
    {
        return this.idade;
    }
    
    /**
     * @param sexo novo valor para sexo
     */
    public void setSexo(char sexo)
    {
        if(sexo == 'M' || sexo == 'm' || sexo == 'F' || sexo == 'f')
        {
            this.sexo = sexo;
        }
        else
        {
            System.out.println("Sexo inválido! Tente colocar 'M' para masculino ou 'F' para feminino.");
        }
    }
    
    /**
     * @return o sexo por extenso
     */
    public String getSexo()
    {
        String sexo;
        
        if(this.sexo == 'M' || this.sexo == 'm')
        {
            sexo = "Masculino";
        }
        else if(this.sexo == 'F' || this.sexo == 'f')
        {
            sexo = "Feminino";
        }
        else
        {
            sexo = null;
        }
        
        return sexo;
    }
    
    /**
     * Exibe as informações sobre a pessoa na tela.
     * 
     * @return o objeto instanciado a Pessoa formatado em String
     */
    public void exibirInfoPessoa()
    {
        JOptionPane.showMessageDialog(null, this.toString());
    }
    
    @Override
    public String toString()
    {
        return "Nome: " + this.getNome() + "\nCPF: " + this.getCpf() + "\nIdade: " + this.getIdade() + " ano(s)\nSexo: " + this.getSexo();
    }
}
