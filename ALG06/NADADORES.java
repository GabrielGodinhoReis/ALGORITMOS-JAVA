import java.util.Scanner;

public class NADADORES {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double idade;
        String classe;

        System.out.println("Digite a idade do Nadador:");
        idade = sc.nextDouble();

        if (idade < 5) {
            System.out.println("Opção inválida");

        } else if (idade >= 5 && idade <= 7) {
            classe = "Infantil A";
            System.out.println("Classe: " + classe);

        } else if (idade >= 8 && idade <= 11) {
            classe = "Infantil B";
            System.out.println("Classe: " + classe);

        } else if (idade >= 12 && idade <= 13) {
            classe = "Juvenil A";
            System.out.println("Classe: " + classe);

        } else if (idade >= 14 && idade <= 17) {
            classe = "Juvenil B";
            System.out.println("Classe: " + classe);

        } else {
            classe = "Adulto";
            System.out.println("Classe: " + classe);
        }

    }
    
}