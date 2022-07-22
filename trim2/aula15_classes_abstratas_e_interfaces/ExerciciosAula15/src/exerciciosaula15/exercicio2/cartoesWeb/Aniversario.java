package exerciciosaula15.exercicio2.cartoesWeb;

import exerciciosaula15.exercicio2.CartaoWeb;

public class Aniversario extends CartaoWeb{
    
    public Aniversario(String destinatario) {
        super(destinatario);
    }
    
    @Override
    public void showMessage() {
        System.out.println(this.getDestinatario() + ", feliz aniversário! Parabéns!");
    }
}
