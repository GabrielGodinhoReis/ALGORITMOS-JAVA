import java.util.Scanner;

    public class TABUADA {

         public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int num1, i;

            System.out.println("Digite o valor que deseja consultar a Tabuada:");
                num1 = sc.nextInt();

            System.out.println("Tabuada do " + num1);

                for (i = 1; i <= 10; i++)

                    System.out.println(num1 + " x " + i + " = " + (num1 * i));

         }
            
}