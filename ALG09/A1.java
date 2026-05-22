// 1A - Reescreva com WHILE

import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int i = 0, a, b, r;

        while(i < 20) {

            System.out.println("Digite o primeiro número:");
            a = teclado.nextInt();

            System.out.println("Digite o segundo número:");
            b = teclado.nextInt();

            r = a + b;

            System.out.println("resultado = " + r);

            i++;
        }

    }
    
}