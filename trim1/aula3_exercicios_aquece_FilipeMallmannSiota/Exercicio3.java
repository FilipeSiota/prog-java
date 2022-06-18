/**
 * 3. Leia até 100 nomes de alunos e ordene em ordem alfabética.
 */
import java.util.Scanner; // add class Scanner

public class Exercicio3
{
    public static void main(String ... args) // main method
    {
        Scanner input = new Scanner(System.in); // create input object
        
        int LENGTH = 100;
        String[] names = new String[LENGTH];
        String auxName;
        int counter = 0, keepGoing = 0;
        int comparisonResult;
        
        do
        {
            System.out.println("Informe o " + (counter + 1) + "º nome:");
            names[counter] = input.next();
            
            counter++;
            
            if (counter < LENGTH)
            {
                System.out.println("Digite (1) se deseja informar mais um nome ou qualquer outro número para sair: ");
                keepGoing = input.nextInt();
            }
        }
        while (keepGoing == 1 && counter < LENGTH);
        
        // organizing the array in alphabetic order by Bubble Sort method
        for (int rep = 0; rep < (counter - 1); rep++) // avoid over-processing
        {
            for (int pos = 0; pos < (counter - 1) - rep; pos++) // avoid over-processing
            {
                comparisonResult = names[pos].compareTo(names[pos + 1]);
                
                if (comparisonResult > 0)
                {
                    auxName = names[pos];
                    names[pos] = names[pos + 1];
                    names[pos + 1] = auxName;
                }
            }
        }
        
        // print in the screen the ordered array
        System.out.println("Nomes informados listados em ordem alfabética:");
        
        for (int pos = 0; pos < counter; pos++)
        {
            System.out.println(names[pos]);
        }
    }
}
