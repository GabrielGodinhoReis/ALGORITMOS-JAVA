import java.util.Scanner;

public class CALCULADORA {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        double num1, num2, resultado;
        int selecao;

        System.out.println("Digite o Primeiro Valor:");
        num1 = sc.nextDouble();

        System.out.println("Digite o Segundo Valor:");
        num2 = sc.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        selecao = sc.nextInt();

        if (selecao < 1 || selecao > 4) {
            System.out.println("Opção inválida");
        } else {
            if (selecao == 1) {
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
            } else if (selecao == 2) {
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
            } else if (selecao == 3) {
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
            } else {
                resultado = num1 / num2;
                System.out.println("Resultado: " + resultado);
            }
        }
    }
}