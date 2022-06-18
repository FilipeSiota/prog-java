package exercicio1;
import javax.swing.JOptionPane;

/** 
 * Serve para a manipulação de datas
 * 
 * @author Filipe Mallmann Siota
 * @version 08/05/2022
 */
public class Data
{
    private int dia, mes, ano;
    
    /**
     * Constrói e inicializa uma Data com dia / mês / ano.
     * 
     * @param dia o dia da data
     * @param mes o mês da data
     * @param ano o ano da data (com 4 dígitos)
     */
    public Data(int dia, int mes, int ano)
    {
        this.setData(dia, mes, ano);
    }
    
    /**
     * Constrói e inicializa uma Data com dia / mês / ano por leitura de dados em tela.
     * 
     * @param dia o dia da data
     * @param mes o mês da data
     * @param ano o ano da data (com 4 dígitos)
     */
    public Data()
    {
        int dia, mes, ano;
        String valor;
        
        valor = JOptionPane.showInputDialog("Digite o dia:");
        dia = Integer.parseInt(valor);
        
        valor = JOptionPane.showInputDialog("Digite o mês:");
        mes = Integer.parseInt(valor);
        
        valor = JOptionPane.showInputDialog("Digite o ano:");
        ano = Integer.parseInt(valor);
        
        this.setData(dia, mes, ano);
    }
    
    /**
     * Verifica quantos dias tem determinado mês do ano
     * 
     * @param mes o mês a ser verificado
     * @return o número de dias que o mês tem
     */
    private int verificaDiasNoMes(int mes)
    {
        int quantDias;
        
        if(mes >= 1 && mes <= 12) // se o mês for válido
        {
            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) // se o mês tiver 31 dias
            {
                quantDias = 31;
            }
            else if(mes == 2) // se for fevereiro
            {
                if(ano % 4 == 0) // e for ano bissexto, tem 29 dias
                {
                    quantDias = 29;
                }
                else // se não for ano bissexto, tem 28 dias
                {
                    quantDias = 28;
                }
            }
            else // se não, é um mês que tem 30 dias
            {
                quantDias = 30;
            }
        }
        else // se o mês não for válido
        {
            quantDias = 0;
            
            System.out.println("O mês sendo verificado é inválido! O mês " + mes + " não existe.");
        }
        
        return quantDias;
    }
    
    /**
     * @param dia o novo valor de dia para a data
     * @return retorna um booleano de erro
     */
    private boolean setDia(int dia)
    {
        boolean erro = false;
        
        if(dia > 0) // se o dia for minimamente válido
        {
            if(this.verificaDiasNoMes(mes) == 31) // se o mês for até 31 dias
            {
                if(dia <= 31) // se o dia for menor ou igual a 31, ele é válido
                {
                    this.dia = dia;
                }
                else
                {
                    erro = true;
                }
            }
            else if(this.verificaDiasNoMes(mes) == 29) // se for fevereiro e ano bissexto
            {
                if(dia <= 29) // se o dia for menor ou igual a 29, ele é válido
                {
                    this.dia = dia;
                }
                else
                {
                    erro = true;
                }
            }
            else if(this.verificaDiasNoMes(mes) == 28) // se for fevereiro, mas não for ano bissexto
            {
                if(dia <= 28) // se o dia for menor ou igual a 28, ele é válido
                {
                    this.dia = dia;
                }
                else
                {
                    erro = true;
                }
            }
            else if(this.verificaDiasNoMes(mes) == 30) // se o mês for até 30 dias
            {    
                if(dia <= 30) // se o dia for menor ou igual a 30, ele é válido
                {
                    this.dia = dia;
                }
                else
                {
                    erro = true;
                }
            }
        }
        else
        {
            erro = true;
        }
        
        return erro;
    }
    
    /**
     * @return o dia da data
     */
    private int getDia()
    {
        return this.dia;
    }
    
    /**
     * @param mes o novo valor de mês para a data
     * @return retorna um booleano de erro
     */
    private boolean setMes(int mes)
    {
        boolean erro = false;
        
        if(mes > 0 && mes <= 12) // se mês for maior que 0 e menor ou igual a 12, ele é válido
        {
            this.mes = mes;
        }
        else
        {
            erro = true;
        }
        
        return erro;
    }
    
    /**
     * @return o mês da data
     */
    private int getMes()
    {
        return this.mes;
    }
    
    /**
     * @param ano o novo valor de ano (com 4 dígitos) para a data
     */
    private void setAno(int ano)
    {
        this.ano = ano;
    }
    
    /**
     * @return o ano da data
     */
    private int getAno()
    {
        return this.ano;
    }
    
    /**
     * Formata a data armazenada de acordo com um determinado separador
     * 
     * @param separador o separador para a data
     * @return a data formatada em uma String
     */
    public String formatarData(char separador)
    {
        String dataFormatada;
        
        if(this.dia < 10)
        {
            dataFormatada = "0" + this.dia;
        }
        else
        {
            dataFormatada = "" + this.dia;
        }
        
        dataFormatada += separador; // coloca o separador de data
        
        if(this.mes < 10)
        {
            dataFormatada += "0" + this.mes;
        }
        else
        {
            dataFormatada += "" + this.mes;
        }
        
        dataFormatada += separador; // coloca o separador de data
        
        if(this.ano < 10)
        {
            dataFormatada += "000" + this.ano;
        }
        else if(this.ano < 100)
        {
            dataFormatada += "00" + this.ano;
        }
        else if(this.ano < 1000)
        {
            dataFormatada += "0" + this.ano;
        }
        else
        {
            dataFormatada += "" + this.ano;
        }
        
        return dataFormatada;
    }
    
    /**
     * Formata uma data qualquer de acordo com um determinado separador
     * 
     * @param dia o dia dessa data
     * @param mes o mês dessa data
     * @param ano o ano dessa data
     * @param separador o separador para a data
     * @return a data formatada em uma String
     */
    public String formatarData(int dia, int mes, int ano, char separador)
    {
        String dataFormatada;
        
        if(dia < 10)
        {
            dataFormatada = "0" + dia;
        }
        else
        {
            dataFormatada = "" + dia;
        }
        
        dataFormatada += separador; // coloca o separador de data
        
        if(mes < 10)
        {
            dataFormatada += "0" + mes;
        }
        else
        {
            dataFormatada += "" + mes;
        }
        
        dataFormatada += separador; // coloca o separador de data
        
        if(ano < 10)
        {
            dataFormatada += "000" + ano;
        }
        else if(ano < 100)
        {
            dataFormatada += "00" + ano;
        }
        else if(ano < 1000)
        {
            dataFormatada += "0" + ano;
        }
        else
        {
            dataFormatada += "" + ano;
        }
        
        return dataFormatada;
    }
    
    /**
     * Altera a data armazenada
     * 
     * @param dia o novo valor de dia para a data
     * @param mes o novo valor de mês para a data
     * @param ano o novo valor de ano para a data
     */
    public void setData(int dia, int mes, int ano)
    {
        boolean erro;
        
        this.setAno(ano);
        
        erro = this.setMes(mes);
        
        if(!erro) // se não houve erro ao setar o mês
        {
            erro = this.setDia(dia);
        }
        
        if(erro) // se houve algum erro ao setar a data
        {
            this.dia = 0;
            this.mes = 0;
            this.ano = 0;
            
            System.out.println("A data " + this.formatarData(dia, mes, ano, '/') + " é inválida!");
            
            System.out.println("Data setada para: " + this.formatarData(this.dia, this.mes, this.ano, '-'));
            
        }
        else
        {
            System.out.println("A data " + this.formatarData(dia, mes, ano, '/') + " é válida!");
        }
    }
    
    /**
     * Calcula a data futura daqui a x dias a partir da data atual
     * 
     * @param dias a quantidade de dias a serem somados a data atual
     * @return um objeto Data com a data futura
     */
    public Data calcularDataFutura(int dias)
    {
        Data dataFutura;
        int diaFuturo, mesFuturo, anoFuturo;
        
        diaFuturo = this.dia + dias;
        mesFuturo = this.mes;
        anoFuturo = this.ano;
        
        if(diaFuturo > this.verificaDiasNoMes(mesFuturo)) // se o diaFuturo ultrapassar o limite de dias do atual mesFuturo
        {
            do
            {
                diaFuturo -= this.verificaDiasNoMes(mesFuturo); // diminui-se o total de dias do mesFuturo do diaFuturo
                
                if(mesFuturo + 1 > 12) // se vai virar o ano na data
                {
                    mesFuturo = 1;
                    anoFuturo++;
                }
                else // se não, adiciona um ao mesFuturo
                {
                    mesFuturo++;
                }
            }
            while(diaFuturo > this.verificaDiasNoMes(mesFuturo)); // enquanto diaFuturo continuar ultrapassando o limite de dias do atual mesFuturo
        }
        
        dataFutura = new Data(diaFuturo, mesFuturo, anoFuturo); // cria um novo objeto Data com a data futura
        
        return dataFutura;
    }
    
    @Override
    public String toString()
    {
        return this.formatarData(this.dia, this.mes, this.ano, '/');
    }
}
