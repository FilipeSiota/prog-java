package exercicio7;

/** 
 * 7. Escreva outro construtor para a classe Data (exe1) que receba uma instância da própria classe Data e use os dados desta para inicializar os campos
 */

public class Data
{
    private int dia, mes, ano;
    private boolean erro = false;
    
    public Data(int dia, int mes, int ano) // método construtor
    {
        this.setData(dia, mes, ano);
    }
    
    public Data(Data data) // método construtor
    {
        this.setData(data.getDia(), data.getMes(), data.getAno());
    }
    
    private void setDia(int dia)
    {
        if(dia > 0) // se o dia for minimamente válido
        {
            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) // se o mês for até 31 dias
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
            else if(mes == 2) // se for fevereiro
            {
                if(ano % 4 == 0) // e for ano bissexto
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
                else if(dia <= 28) // se não for ano bissexto e o dia for menor ou igual a 28, ele é válido
                {
                    this.dia = dia;
                }
                else
                {
                    erro = true;
                }
            }
            else if(dia <= 30) // se não, ele é um mês que vai até o dia 30, e por isso, se o dia for menor ou igual a 30, ele é válido
            {
                this.dia = dia;
            }
            else
            {
                erro = true;
            }
        }
        else
        {
            erro = true;
        }
    }
    
    private int getDia()
    {
        return this.dia;
    }
    
    private void setMes(int mes)
    {
        if(mes > 0 && mes <= 12) // se mês for maior que 0 e menor ou igual a 12, ele é válido
        {
            this.mes = mes;
        }
        else
        {
            erro = true;
        }
    }
    
    private int getMes()
    {
        return this.mes;
    }
    
    private void setAno(int ano)
    {
        this.ano = ano;
    }
    
    private int getAno()
    {
        return this.ano;
    }
    
    private String formatarData(int dia, int mes, int ano, char separador)
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
    
    private void setData(int dia, int mes, int ano)
    {
        this.setAno(ano);
        this.setMes(mes);
        this.setDia(dia);
        
        if(erro)
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
    
    public void verData()
    {
        System.out.println("Data: " + this.formatarData(this.dia, this.mes, this.ano, '/'));
    }
}
