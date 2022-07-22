package exerciciosaula15.exercicio2.cartoesWeb;

import exerciciosaula15.exercicio2.CartaoWeb;

public class Natal extends CartaoWeb{
    
    public Natal(String destinatario) {
        super(destinatario);
    }
    
    @Override
    public void showMessage() {
        System.out.println(this.getDestinatario() + ", feliz natal! HO HO HO ...");
    }
}
