import java.util.Scanner;

public class XPTO {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float salario, bonus, percentualBonus; 
        int tempoServico; 

        System.out.print("Digite o salário do funcionário: ");
        salario = sc.nextFloat();

        System.out.print("Digite o tempo de serviço (em anos): ");
        tempoServico = sc.nextInt();

        if (tempoServico >= 5) {
            percentualBonus = 0.2f;
        } else {
            percentualBonus = 0.1f;
        }

        bonus = salario * percentualBonus;

        System.out.println("O bônus do funcionário é: R$ " + bonus);

    }

}