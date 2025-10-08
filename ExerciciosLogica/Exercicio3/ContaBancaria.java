package Exercicio3;

public class ContaBancaria {

    public void sacar() {
        System.out.println("Saque realizado com sucesso!");
    }

    public void depositar() {
        System.out.println("Depósito realizado com sucesso!");
    }

    public static void main(String[] args) {

        ContaBancaria[] contas = new ContaBancaria[2];

        contas[0] = new ContaCorrente();
        contas[1] = new ContaPoupanca();

        for (int i = 0; i < contas.length; i++) {
            contas[i].sacar();
        };
        
    }

}
