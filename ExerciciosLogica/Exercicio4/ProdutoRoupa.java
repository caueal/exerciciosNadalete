public class ProdutoRoupa extends Produto {

    
    @Override 
    public void calcularPrecoFinal() {
        double desconto = 0.10;
        double precoFinal = preco - (preco * desconto);
        System.out.println("Preço final da roupa " + nome + ": R$" + precoFinal);
    }

}
