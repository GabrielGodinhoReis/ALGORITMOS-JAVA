/* Programa para calcular a média ponderada de 3 números reais (A, B e C):
   - Receber os valores de A, B e C do usuário.
   - Aplicar os pesos: A = 2, B = 3, C = 5.
   - Calcular a média ponderada: media = (A*2 + B*3 + C*5) / (2+3+5).
   - Exibir o resultado da média ponderada. */

import java.util.Scanner;

public class MEDIA {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double A, B, C, media;

        System.out.println("Digite o valor de A:");
            A = sc.nextDouble();

        System.out.println("Digite o valor de B:");
            B = sc.nextDouble();

        System.out.println("Digite o valor de C:");
            C = sc.nextDouble();

        media = (A * 2 + B * 3 + C * 5) / 10;
        System.out.println("Media ponderada = " + media);
    }
}

