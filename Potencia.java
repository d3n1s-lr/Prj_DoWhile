import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int baseNum = ler.nextInt();

        System.out.print("Digite o expoente: ");
        int expoente = ler.nextInt();

        int resultado = 1;
        int i = 0;

        if (expoente == 0) {
            resultado = 1;
        } else {
            do {
                resultado = resultado * baseNum;
                i++;
            } while (i < expoente);
        }
        System.out.println("Resultado: " + resultado);

        ler.close();
    }
}
