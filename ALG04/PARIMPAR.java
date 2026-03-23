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