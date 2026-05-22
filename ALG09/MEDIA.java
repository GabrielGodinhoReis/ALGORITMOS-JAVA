import java.util.Scanner;

public class MEDIA {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;
        int soma = 0;
        int quantidade = 0;

        System.out.println("Digite os números (0 para sair):");

        numero = teclado.nextInt();

        while(numero != 0) {

            soma += numero;
            quantidade++;

            numero = teclado.nextInt();
        }

        if(quantidade > 0) {

            double media = (double)soma / quantidade;

            System.out.println("Média = " + media);

        } else {

            System.out.println("Nenhum número informado");
        }

    }
    
}