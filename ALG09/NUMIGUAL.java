import java.util.Scanner;

public class NUMIGUAL {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int inicial;
        int atual;
        int tentativas = 0;

        System.out.println("Digite o número inicial:");
        inicial = teclado.nextInt();

        do {

            System.out.println("Digite outro número:");
            atual = teclado.nextInt();

            tentativas++;

            if(atual > inicial) {

                System.out.println("O número atual é MAIOR");

            } else if(atual < inicial) {

                System.out.println("O número atual é MENOR");
            }

        } while(atual != inicial);

        System.out.println("Número descoberto!");

        System.out.println("Tentativas: " + tentativas);

    }
    
}