/* Informe as duas notas de um aluno (P1 e P2) e a quantidade de faltas no semestre.
Calcule a média das notas e o percentual de faltas sobre 20 aulas.
Caso o percentual de faltas seja maior que 30%, o aluno está automaticamente reprovado.
Caso contrário, verifique se a média é maior ou igual a 6.
Se afirmativo, o aluno está aprovado.
Senão, informe uma nota P3 para recalcular a média.
Se a nova média for maior ou igual a 6, escreva "aprovado no exame".
Caso negativo, exiba "reprovado por nota". */

import java.util.Scanner;

public class NOTAS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double p1, p2, media;
        double faltas, porcentagem;
        double p3, media2;

        System.out.println("Digite a nota da Primeira Prova");
        p1 = sc.nextDouble();

        System.out.println("Digite a nota da Segunda Prova:");
        p2 = sc.nextDouble();

        System.out.println("Digite número de faltas:");
        faltas = sc.nextDouble();

        media = (p1 + p2) / 2;

        porcentagem = (faltas / 20) * 100;

        if (porcentagem > 30) {
            System.out.println("Aluno Reprovado");
        } else {
            if (media >= 6) {
                System.out.println("Aluno Aprovado");
            } else {
                System.out.println("Digite a nota da Terceira Prova:");
                p3 = sc.nextDouble();

                media2 = (media + p3) / 2;

                if (media2 >= 6) {
                    System.out.println("Aluno aprovado no exame");
                } else {
                    System.out.println("Aluno reprovado por nota");
                }
            }
        }
    }
}