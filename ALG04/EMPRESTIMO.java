import java.util.Scanner;

public class EMPRESTIMO {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salario, emprestimo;

        System.out.println("Digite o valor do Salário:");
        salario = sc.nextDouble();

        System.out.println("Digite o valor do Empréstimo:");
        emprestimo = sc.nextDouble();

        if (emprestimo > salario * 0.2) {
            System.out.println("Empréstimo não concedido.");
        } else {
            System.out.println("Empréstimo concedido.");
        }

    }
}