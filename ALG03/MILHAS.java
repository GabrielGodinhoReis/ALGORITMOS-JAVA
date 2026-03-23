/* Programa para converter distância em km para milhas:
   - Ler uma distância em km do usuário
   - Converter para milhas usando a relação: 1 milha = 1,60934 km
       * milhas = km / 1,60934
   - Exibir o valor da distância em milhas. */

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