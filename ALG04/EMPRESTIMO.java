/* Algoritmo para verificar concessão de empréstimo:
   - Ler o salário do trabalhador e o valor da prestação do empréstimo.
   - Se a prestação for maior que 20% do salário: imprimir "Empréstimo não concedido".
   - Caso contrário: imprimir "Empréstimo concedido". */

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