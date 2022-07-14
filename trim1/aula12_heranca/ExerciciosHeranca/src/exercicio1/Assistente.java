package exercicio1;

public class Assistente extends Funcionario {
    
    private int numMat;
    private double bonusSalarial;

    public Assistente(String nome, String tipo, int numMat, double bonusSalarial) {
        super(nome, tipo);
        this.setNumMat(numMat);
        this.setBonusSalarial(bonusSalarial);
    }

    public int getNumMat() {
        return numMat;
    }

    public void setNumMat(int numMat) {
        this.numMat = numMat;
    }
    
    public double getBonusSalarial() {
        return bonusSalarial;
    }

    public void setBonusSalarial(double bonusSalarial) {
        this.bonusSalarial = bonusSalarial;
    }
    
    @Override
    public void exibeDados() {
        System.out.println("Nome do funcionário: " + this.getNome() + "\nTipo de funcionário: " + this.getTipo() + "\nNúmero de matrícula: " + this.getNumMat() + "Bônus salarial: " + this.getBonusSalarial());
    }
}
