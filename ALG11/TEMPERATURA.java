import java.util.Scanner;

public class TEMPERATURA {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] temperatura = new double[10][3];

        for (int i = 0; i < 10; i++) {

            System.out.println("Dia " + (i + 1));

            System.out.print("Temperatura mínima: ");
            temperatura[i][0] = sc.nextDouble();

            System.out.print("Temperatura máxima: ");
            temperatura[i][1] = sc.nextDouble();

            temperatura[i][2] = (temperatura[i][0] + temperatura[i][1]) / 2;

        }

        int opcao;

        do {

            System.out.println("\nMENU");
            System.out.println("1 - Temperatura mínima de todos os dias");
            System.out.println("2 - Temperatura máxima de todos os dias");
            System.out.println("3 - Maior variação de temperatura");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("\nTemperaturas Mínimas:");
                    
                    for (int i = 0; i < 10; i++) {

                        System.out.println("Dia " + (i + 1) + ": " + temperatura[i][0]);
                    }

                    break;

                case 2:
                    System.out.println("\nTemperaturas Máximas:");

                    for (int i = 0; i < 10; i++) {

                        System.out.println("Dia " + (i + 1) + ": " + temperatura[i][1]);

                    }
                    
                    break;

                case 3:
                    double maiorVariacao = temperatura[0][1] - temperatura[0][0];
                    int dia = 1;

                    for (int i = 1; i < 10; i++) {

                        double variacao = temperatura[i][1] - temperatura[i][0];

                        if (variacao > maiorVariacao) {
                            maiorVariacao = variacao;
                            dia = i + 1;

                        }
                    }

                    System.out.println("Maior variação: " + maiorVariacao);
                    System.out.println("Dia: " + dia);

                    break;

                case 4:
                    System.out.println("Programa encerrado.");

                    break;

                default:
                    System.out.println("Opção inválida!");

            }

        } while (opcao != 4);

    }

}