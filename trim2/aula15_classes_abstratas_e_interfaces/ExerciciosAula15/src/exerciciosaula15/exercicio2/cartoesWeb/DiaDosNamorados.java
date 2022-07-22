package exerciciosaula15.exercicio2.cartoesWeb;

import exerciciosaula15.exercicio2.CartaoWeb;

public class DiaDosNamorados extends CartaoWeb{
    
    public DiaDosNamorados(String destinatario) {
        super(destinatario);
    }
    
    @Override
    public void showMessage() {
        System.out.println(this.getDestinatario() + ", feliz dia dos namorados! Eu te amo muito! S2");
    }
}
