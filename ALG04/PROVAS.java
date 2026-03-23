/* Algoritmo para calcular a média ponderada de 3 provas:
   - Primeira e segunda prova com peso 1, terceira prova com peso 2.
   - Calcular a média ponderada: media = (P1*1 + P2*1 + P3*2)/4
   - Mostrar a média do aluno.
   - Se a média for maior ou igual a 60, o aluno está aprovado.
   - Caso contrário, o aluno está reprovado. */

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