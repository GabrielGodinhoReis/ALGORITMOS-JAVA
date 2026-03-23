import java.util.Scanner;

public class GASOLINA {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double gasolina, alcool;
        double vantagem;

        System.out.println("Digite o valor da Gasolina:");
        gasolina = sc.nextDouble();

        System.out.println("Digite o valor do Álcool:");
        alcool = sc.nextDouble();

        vantagem = gasolina * 0.7;

            if (alcool < vantagem) {
                System.out.println("Álcool é mais vantajoso");
            } else {
                System.out.println("Gasolina é mais vantajosa");
            }

    }
    
}