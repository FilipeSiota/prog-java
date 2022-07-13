package exerciciosheranca.exercicio1;

/**
 *
 * @author Filipe
 */
public class Funcionario {
    
    private int matricula;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public void exibeDados() {
        System.out.println("Matrícula: " + this.matricula);
    }
}
