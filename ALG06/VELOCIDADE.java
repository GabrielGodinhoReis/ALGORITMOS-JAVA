import java.util.Scanner;

public class VELOCIDADE {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int velomax, velomotorista, excesso, multa;

        System.out.print("Digite a velocidade máxima da avenida (km/h): ");
        velomax = sc.nextInt();

        System.out.print("Digite a velocidade do motorista (km/h): ");
        velomotorista = sc.nextInt();

        excesso = velomotorista - velomax;

        if (excesso <= 0) {
            System.out.println("Velocidade dentro do limite (" + velomax + " km/h). Sem multa.");
        } else if (excesso <= 10) {
            multa = 50;
            System.out.println("Você excedeu o limite em " + excesso + " km/h.");
            System.out.println("Multa: R$ " + multa);
        } else if (excesso <= 30) {
            multa = 100;
            System.out.println("Você excedeu o limite em " + excesso + " km/h.");
            System.out.println("Multa: R$ " + multa);
        } else {
            multa = 200;
            System.out.println("Você excedeu o limite em " + excesso + " km/h!");
            System.out.println("Multa: R$ " + multa);
        }

    }

}