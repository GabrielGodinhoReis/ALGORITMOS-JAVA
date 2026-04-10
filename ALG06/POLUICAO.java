import java.util.Scanner;

public class POLUICAO {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double indice; // usamos double para maior precisão

        System.out.println("Digite o índice de poluição:");
        indice = sc.nextDouble();

        if (indice >= 0.5) {
            System.out.println("Todos os grupos de indústrias devem paralisar suas atividades.");

        } else if (indice >= 0.4) {
            System.out.println("Indústrias do 1º e 2º grupo devem suspender suas atividades.");

        } else if (indice >= 0.3) {
            System.out.println("Indústrias do 1º grupo devem suspender suas atividades.");

        } else if (indice >= 0.05 && indice <= 0.25) {
            System.out.println("Índice de poluição aceitável.");

        } else {
            System.out.println("Poluição registrada é mínima, situação ambiental controlada.");
        }

    }

}