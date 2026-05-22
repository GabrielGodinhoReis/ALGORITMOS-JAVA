import java.util.Scanner;

public class SEQUENCIA {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num;
        int sequenciaAtual = 0;
        int maiorSequencia = 0;

        for(int i = 0; i < 10; i++) {

            System.out.println("Digite um número:");
            num = teclado.nextInt();

            if(num % 2 == 0) {

                sequenciaAtual++;

                if(sequenciaAtual > maiorSequencia) {
                    maiorSequencia = sequenciaAtual;
                }

            } else {

                sequenciaAtual = 0;
            }
            
        }

        System.out.println("Maior sequência de pares: " + maiorSequencia);

    }

}
