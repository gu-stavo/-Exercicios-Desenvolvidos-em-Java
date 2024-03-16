package exercicio;

import java.util.Scanner;

public class exercicio4fatec {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int n = scanner.nextInt();

        int totalPecas = 0;
        
        for (int i = 0; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                totalPecas++;
            }
        }

        System.out.println("Quantidade total de peças de dominó: " + totalPecas);

        scanner.close();   
    }
}