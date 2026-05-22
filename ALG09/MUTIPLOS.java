import java.util.Scanner;

public class MUTIPLOS {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num;
        int cont2 = 0;
        int cont3 = 0;
        int i = 0;

        do {

            System.out.println("Digite um número:");

            num = teclado.nextInt();

            if(num % 2 == 0) {
                cont2++;
            }

            if(num % 3 == 0) {
                cont3++;
            }

            i++;

        } while(i < 10);

        System.out.println("Múltiplos de 2: " + cont2);

        System.out.println("Múltiplos de 3: " + cont3);
    }

}