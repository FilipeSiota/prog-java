/**
 * 1. Desenvolva um algoritmo em Java que leia um número inteiro e imprima o
 * seu antecessor e seu sucessor.
 */
import java.util.Scanner; // add class Scanner

public class Exercicio1
{
    public static void main(String ... args) // main method
    {
        Scanner input = new Scanner(System.in); // create input object
        
        int num;
        
        System.out.println("Informe um número: ");
        num = input.nextInt();
        
        System.out.println("O antecessor de " + num + " é " + (num - 1));
        System.out.println("O sucessor de " + num + " é " + (num + 1));
    }
}
