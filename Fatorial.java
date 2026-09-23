import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = ler.nextInt();

        int fatorial = 1;
        int i = 1;

        if (num < 0) {
            System.out.println("Não existe fatorial para números negativos");
        } else {
           do {
                fatorial = fatorial * i;
                i++;    
            System.out.println("Fatorial: " + fatorial);
        } while (i <= num);

        ler.close();
        }
    }
}
