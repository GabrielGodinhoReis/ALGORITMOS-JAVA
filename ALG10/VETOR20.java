import java.util.Scanner;

public class VETOR20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeros[] = new int[20];

        int soma = 0;

        for(int i = 0; i < 20; i++) {

            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();

        }

        int maior = numeros[0];
        int menor = numeros[0];

        for(int i = 0; i < 20; i++) {

            soma += numeros[i];

            if(numeros[i] > maior) {

                maior = numeros[i];

            }

            if(numeros[i] < menor) {

                menor = numeros[i];

            }
        }

        double media = soma / 20.0;

        System.out.println();//apenas para pular linha do print e ficar bunitin//

        System.out.println("Maior numero: " + maior);
        System.out.println("Menor numero: " + menor);
        System.out.println("Media: " + media);

    }

}