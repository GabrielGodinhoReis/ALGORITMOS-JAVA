import java.util.Scanner;

public class TRIANGULO {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] triangulo = new double[10][3];

        int equilatero = 0;
        int isosceles = 0;
        int escaleno = 0;

        for (int i = 0; i < 10; i++) {

            System.out.println("\nTriângulo " + (i + 1));

            System.out.print("Lado 1: ");
            triangulo[i][0] = sc.nextDouble();

            System.out.print("Lado 2: ");
            triangulo[i][1] = sc.nextDouble();

            System.out.print("Lado 3: ");
            triangulo[i][2] = sc.nextDouble();

            double a = triangulo[i][0];
            double b = triangulo[i][1];
            double c = triangulo[i][2];

            if (a == b && b == c) {
                equilatero++;
            } else if (a == b || a == c || b == c) {
                isosceles++;
            } else {
                escaleno++;
            }
        }

        double percEquilatero = (equilatero * 100.0) / 10;
        double percIsosceles = (isosceles * 100.0) / 10;
        double percEscaleno = (escaleno * 100.0) / 10;

        System.out.println("\nRESULTADOS");
        System.out.printf("Percentual de Equiláteros: %.2f%%\n", percEquilatero);
        System.out.printf("Percentual de Isósceles: %.2f%%\n", percIsosceles);
        System.out.printf("Percentual de Escalenos: %.2f%%\n", percEscaleno);

    }

}