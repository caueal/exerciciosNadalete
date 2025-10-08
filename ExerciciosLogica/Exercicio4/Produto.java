public class Produto {

    String nome; 
    double preco;

    public void calcularPrecoFinal(){
        double precoFinal = preco + (preco * 0.1);
        System.out.println("Preço final do produto " + nome + ": R$" + precoFinal);
    }

    public static void main(String[] args) {
        ProdutoEletronico eletronico = new ProdutoEletronico();
        eletronico.nome = "Smartphone";
        eletronico.preco = 2000.00;
        eletronico.calcularPrecoFinal();

        ProdutoLivro livro = new ProdutoLivro();
        livro.nome = "Java Programming";
        livro.preco = 100.00;
        livro.calcularPrecoFinal();

        ProdutoRoupa roupa = new ProdutoRoupa();
        roupa.nome = "Camisa";
        roupa.preco = 150.00;
        roupa.calcularPrecoFinal();

    }

}
