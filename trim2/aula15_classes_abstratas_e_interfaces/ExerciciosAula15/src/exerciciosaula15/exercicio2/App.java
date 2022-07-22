package exerciciosaula15.exercicio2;

import exerciciosaula15.exercicio2.cartoesWeb.Aniversario;
import exerciciosaula15.exercicio2.cartoesWeb.DiaDosNamorados;
import exerciciosaula15.exercicio2.cartoesWeb.Natal;
import java.util.ArrayList;

/**
 * 2 - Você foi contratado para fazer um sistema para mandar cartões virtuais,
 * por exemplo, de natal e de aniversário virtual.
 *
 * Escreva uma classe abstrata chamada CartaoWeb. Essa classe representa todos
 * os tipos de cartões web e conterá apenas um atributo: destinatario (tipo
 * String). Nessa classe você deverá também declarar o método public abstract
 * void showMessage(). Crie classes filhas da classe CartaoWeb: DiaDosNamorados,
 * Natal, Aniversario. Cada uma dessas classes deve conter um método construtor
 * que receba o nome do destinatário do cartão. Cada classe também deve
 * implementar o método showMessage(), mostrando uma mensagem ao usuário com seu
 * nome e que seja específica para a data comemorativa do cartão.
 *
 * Escreva um programa e no método main crie um array de CartaoWeb. Insira
 * instâncias dos 3 tipos de cartões neste array. Após, use um laço for in para
 * exibir as mensagens deste cartão chamando o método showMessage().
 *
 * Em que linha(s) acontece polimorfismo nesse código? Comente no código e chame
 * o professor para mostrar.
 *
 * Resposta: Acontece toda vez que criamos uma classe filha (subclasse) de
 * CartaoWeb e sobrescrevemos o método showMessage, o qual também pode ser
 * chamado de método polimórfico, tendo em vista que é abstrato na classe pai
 * (superclasse) e é implementado de várias formas de acordo com a data
 * comemorativa do cartão.
 */
public class App {

    public static void main(String[] args) {

        ArrayList<CartaoWeb> cartoesWeb = new ArrayList<CartaoWeb>();

        cartoesWeb.add(new DiaDosNamorados("Filipe"));
        cartoesWeb.add(new Natal("Filipe"));
        cartoesWeb.add(new Aniversario("Filipe"));

        for (CartaoWeb cartaoWeb : cartoesWeb) {
            cartaoWeb.showMessage();
        }
    }
}
