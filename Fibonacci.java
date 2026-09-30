package prjWhileLista02;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Quantos termos deseja ver? ");
        int n = ler.nextInt();

        int a = 1;
        int b = 1;
        int proximo;
        int i = 0;

        do {
            System.out.print(a + " ");
            proximo = a + b;
            a = b;
            b = proximo;
            i++;
        } while (i < n);

        ler.close();
    }
}