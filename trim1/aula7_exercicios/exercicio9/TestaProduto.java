package exercicio9;

/**
 * 9. Transforme a classe produto para que possua setters fluentes.
 * Crie uma classe TestaProduto mostrando o funcionamento do setter fluente com desconto de 10% e 12 parcelas.
 */

public class TestaProduto
{
    private Produto produto;
    
    public TestaProduto(Produto produto) // método construtor
    {
        this.produto = produto;
        
        produto.setDesconto(10).setParcelas(12); // utilizando o setter fluente
    }
}