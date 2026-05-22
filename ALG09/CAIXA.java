// 5 - Caixa eletrônico com faça enquanto

import java.util.Scanner;

public class CAIXA {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double saldo = 1000;
        double saque;
        int opcao;

        do {

            System.out.println("Saldo atual: " + saldo);

            System.out.println("Digite valor do saque:");

            saque = teclado.nextDouble();

            if(saque <= saldo) {

                saldo -= saque;

                System.out.println("Saque realizado!");

            } else {

                System.out.println("Saldo insuficiente!");
            }

            System.out.println("Deseja continuar?");

            System.out.println("1 - Sim");

            System.out.println("2 - Não");

            opcao = teclado.nextInt();

        } while(opcao == 1);

        System.out.println("Saldo final: " + saldo);

    }
    
}