public class ProdutoLivro extends Produto {

    @Override 
    public void calcularPrecoFinal() {
        double precoFinal = preco;
        System.out.println("Preço final do livro " + nome + ": R$" + precoFinal);
    }

}
