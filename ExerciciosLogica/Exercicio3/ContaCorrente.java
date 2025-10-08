package Exercicio3;

public class ContaCorrente extends ContaBancaria {

    double taxa = 15.0;

    @Override 
    public void sacar() {
        
        System.out.println("Saque em conta corrente realizado com sucesso, com a taxa de" + taxa);
    }

}