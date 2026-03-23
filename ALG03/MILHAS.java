import java.util.Scanner;

public class MILHAS {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double km;
        double milhas;

        System.out.println("Digite a distancia em km:");
        km = sc.nextDouble();

        milhas = km / 1.60934;

        System.out.printf("Distancia em milhas: " + milhas);

    }
}