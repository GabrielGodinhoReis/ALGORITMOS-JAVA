import java.util.Scanner;

public class PROVAS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double p1, p2, p3;
        double media;

        System.out.println("Digite a nota da Primeira Prova");
        p1 = sc.nextDouble();

        System.out.println("Digite a nota da Segunda Prova:");
        p2 = sc.nextDouble();

        System.out.println("Digite a nota da Terceira Prova:");
        p3 = sc.nextDouble();

        media = (p1 * 1 + p2 * 1 + p3 * 2) / 3;

        if (media > 60) {
                System.out.println("Aluno Aprovado");
            } else {
                System.out.println("Aluno Reprovado");
            }

    }

}