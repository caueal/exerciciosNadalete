public class ProdutoEletronico extends Produto {

    @Override 
    public void calcularPrecoFinal() {
        double desconto = 0.20;
        double precoFinal = preco - (preco * desconto);
        System.out.println("Preço final do produto eletronico " + nome + ": R$" + precoFinal);
    }

}
