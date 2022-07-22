package exerciciosaula15.exercicio1;

/**
 * 1 - Explique os resultados da execução do método main abaixo e quais são os conceitos fundamentais de orientação
 * a objetos que são aplicados. Além das classes apresentadas crie as classes AtorFeliz e AtorTriste e coloque
 * mensagens diferentes para os atos.
 * 
 * Resposta: Ao criarmos um objeto palco, um objeto AtorFeliz é criado e atribuído ao ator que está no Palco.
 * 
 * Vale lembrar que a classe Ator é abstrata, tendo dois métodos abstratos também. Isso faz com que, quando
 * criamos uma classe herdeira de Ator, como AtorFeliz e AtorTriste, devemos sobrescrever os métodos abstratos.
 * Sobre o método ato, que é um dos métodos abstratos de Ator, dizemos que ele é um método polimórfico, pois
 * para cada classe herdeira de Ator, uma nova forma de implementar esse método é criada. Além disso, colocar
 * uma classe como abstrata faz com que não seja possível instanciar um objeto a partir dela.
 * 
 * Continuando na execução da main, quando dizemos para o palco atuar, ele dirá para que o método atuar do ator
 * que está no palco (AtorFeliz) seja executado. Então, dizemos para que palco altere o ator que está no palco,
 * criando assim um objeto que instacia a classe AtorTriste e atribui ele ao ator que está no palco. Dessa forma,
 * quando dizemos para o palco atuar novamente, ele dirá agora para que o método atuar do ator que está no palco
 * (AtorTriste) seja executado.
 */

public class App {

    public static void main(String[] args) {
        Palco palco = new Palco();
        palco.atuar();
        palco.altera();
        palco.atuar();
    }

}
