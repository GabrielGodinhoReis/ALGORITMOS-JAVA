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