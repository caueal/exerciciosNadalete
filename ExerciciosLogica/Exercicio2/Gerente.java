package Exercicio2;

public class Gerente extends Funcionario {

    String departamento;

    public void exibirInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
        System.out.println("Departamento: " + departamento);
    }

}
