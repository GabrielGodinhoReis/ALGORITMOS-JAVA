import java.util.Scanner;

public class CALCULADORASWITCH {

     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2, op;

        System.out.println("Digite o Primeiro valor:");
        num1 = sc.nextInt();

        System.out.println("Digite o Segundo valor:");
        num2 = sc.nextInt();

        System.out.println("Escolha a Operação Matematica:\n1 | +\n2 | -\n3 | *\n4 | /");
        op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("Resultado = " + (num1 + num2));
            break;

            case 2:
                System.out.println("Resultado = " + (num1 - num2));
            break;

            case 3:
                System.out.println("Resultado = " + (num1 * num2));
            break;

            case 4:
                System.out.println("Resultado = " + (num1 / num2));
            break;
            
            default:
                System.out.println("Opção Inválida");

        }
    }
}