import java.util.Scanner;

    public class IMPARES {

        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);

            int num1 = 100; int num2 = 200;

            for (int i = num1; i <= num2; i++)
                
                if (i % 2 !=0){

                    System.out.println("Numeros Impares:" + i);

                }

        }

}