import java.util.Scanner;

public class PERCENTUAL {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeros[] = new int[20];

        int pares = 0;
        int impares = 0;

        for(int i = 0; i < 20; i++) {

            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();

            // Verifica se é par
            if(numeros[i] % 2 == 0) {

                pares++;

            } else {

                impares++;
                
            }

        }

        double percPares = (pares * 100.0) / 20;
        double percImpares = (impares * 100.0) / 20;

        System.out.println(); //apenas para pular linha do print e ficar bunitin//

        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Percentual de pares: " + percPares + "%");

        System.out.println(); //apenas para pular linha do print e ficar bunitin//

        System.out.println("Quantidade de impares: " + impares);
        System.out.println("Percentual de impares: " + percImpares + "%");
    
    }
    
}