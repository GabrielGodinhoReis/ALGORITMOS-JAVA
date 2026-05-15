import java.util.Scanner;

public class NUM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;
        int quantidade = 0;

        while (true) {

            System.out.print("Digite um número inteiro (0 para parar): ");
            numero = sc.nextInt();

            if (numero == 0) {
                break;
            }

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }

            soma += numero;
            quantidade++;
        }

        
        if (quantidade > 0) {

            double media = (double) soma / quantidade;

            System.out.println("\nMaior número: " + maior);
            System.out.println("Menor número: " + menor);
            System.out.println("Média: " + media);

        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }

        sc.close();
    }
}