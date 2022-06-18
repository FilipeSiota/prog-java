/**
 * 2. Leia até 5 notas de um aluno e calcule a média.
 */
import java.util.Scanner; // add class Scanner

public class Exercicio2
{
    public static void main(String ... args) // main method
    {
        Scanner input = new Scanner(System.in); // create input object
        
        int MAX = 5;
        double grade;
        double sum = 0;
        double average;
        int counter = 0, keepGoing = 0;
        
        do
        {
            System.out.println("Informe a " + (counter + 1) + "º nota: ");
            grade = input.nextDouble();
            
            sum += grade;
            
            counter++;
            
            if (counter < MAX)
            {
                System.out.println("Digite (1) se deseja informar mais uma nota ou qualquer outro número para sair: ");
                keepGoing = input.nextInt();
            }
        }
        while (keepGoing == 1 && counter < MAX);
        
        average = sum / counter;
        
        System.out.println("A média é: " + average);
    }
}
