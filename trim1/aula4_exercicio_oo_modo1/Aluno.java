
/**
 * Crie uma classe aluno
 * Crie os atributos
 *  Nome completo String
 *  Matricula - int
 *  Notas [5] - double
 * Crie os métodos
 *  Altera nome
 *  Adiciona nota (caso já adicionou todas as notas exiba uma mensagem de erro)
 *  Altera matricula
 *  Calcula a média
 */

public class Aluno
{
    int MAX = 5;
    
    String nomeCompleto;
    int matricula;
    double[] notas = new double[MAX];
    int contaNotas = 0;
    
    void alterarNome(String novoNome)
    {
        nomeCompleto = novoNome;
        
        System.out.println("Nome alterado com sucesso!");
    }
    
    void adicionarNota(double novaNota)
    {
        if(contaNotas < MAX)
        {
            notas[contaNotas] = novaNota;
            
            contaNotas++;
            
            System.out.println("Nota adicionada com sucesso!");
        }
        else
        {
            System.out.println("Ação negada. O número máximo de notas foi atingido!");
        }
    }
    
    void alterarMatricula(int novaMatricula)
    {
        matricula = novaMatricula;
        
        System.out.println("Matrícula alterada com sucesso!");
    }
    
    void calcularMedia()
    {
        if(contaNotas > 0)
        {
            double soma = 0;
            
            for(int pos = 0; pos < contaNotas; pos++)
            {
                soma += notas[pos];
            }
            
            double media = soma / contaNotas;
            
            System.out.println("A média é: " + media);
        }
        else
        {
            System.out.println("Nenhuma nota foi adicionada ainda!");
        }
    }
}
