/* Algoritmo para identificar se um número inteiro é par ou ímpar:
   - Receber um número inteiro.
   - Calcular o resto da divisão por 2 usando: resto = numero % 2;
   - Se o resto for 0, o número é par.
   - Se o resto for 1, o número é ímpar. */

import java.util.Scanner;

public class PARIMPAR {

    public static void main(String[] args) {

        int numero, resto;

        System.out.println("Digite um número inteiro:");
        numero = new Scanner(System.in).nextInt();

        resto = numero % 2;

        if (resto == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

    }
}