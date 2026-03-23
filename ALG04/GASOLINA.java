/* Algoritmo para escolher o combustível mais vantajoso:
   - Informar dois valores reais: valor do litro da gasolina e valor do litro do álcool.
   - Calcular 70% do valor da gasolina.
   - Se o valor do álcool for menor que 70% da gasolina, o álcool é mais vantajoso.
   - Caso contrário, a gasolina é mais vantajosa. */

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