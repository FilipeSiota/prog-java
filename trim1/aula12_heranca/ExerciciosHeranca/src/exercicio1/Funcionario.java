package exercicio1;

public class Funcionario {
    
    private String nome;
    private String tipo;

    public Funcionario(String nome, String tipo) {
        this.setNome(nome);
        this.setTipo(tipo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void exibeDados() {
        System.out.println("Nome do funcionário: " + this.getNome() + "\nTipo de funcionário: " + this.getTipo());
    }
}
