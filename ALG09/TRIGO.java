public class TRIGO {
    public static void main(String[] args) {

        double graos = 1;
        double total = 0;

        for(int i = 1; i <= 64; i++) {

            total += graos;

            graos = graos * 2;
        }

        double kg = total / 100000;

        System.out.println("Total de grãos: " + total);
        System.out.println("Peso em KG: " + kg);
        
    }

}