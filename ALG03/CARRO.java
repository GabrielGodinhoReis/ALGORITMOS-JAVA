/* Programa para calcular tempo de viagem e consumo de combustível:
   - Ler três valores do usuário:
       * Distância em km
       * Velocidade média em km/h
       * Consumo de combustível em km/l
   - Calcular o tempo de viagem: tempo = distancia / velocidade
   - Calcular quantos litros serão necessários: litros = distancia / consumo
   - Exibir o tempo de viagem e o total de litros necessários */

import java.util.Scanner;

public class CARRO {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double distancia, velocidade, consumo;
        double tempo, litros;

        System.out.println("Digite a distancia (km):");
        distancia = sc.nextDouble();

        System.out.println("Digite a velocidade media (km/h):");
        velocidade = sc.nextDouble();

        System.out.println("Digite o consumo (km por litro):");
        consumo = sc.nextDouble();

        tempo = distancia / velocidade;
        litros = distancia / consumo;

        System.out.printf("Tempo de viagem: %.2f horas\n", tempo);
        System.out.printf("Combustivel necessario: %.2f litros\n", litros);

    }
}