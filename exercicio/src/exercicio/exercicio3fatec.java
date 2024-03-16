package exercicio;

import java.util.Scanner;

public class exercicio3fatec {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da soma dos digitos:");
        int S = scanner.nextInt();

        System.out.println("Digite o começo do intervalo:");
        int A = scanner.nextInt();

        System.out.println("Digite o final do intervalo:");
        int B = scanner.nextInt();

        int contador = 0;

        for (int num = A; num <= B; num++) {
            int temp = num, soma = 0;

            while (temp > 0) {
                soma += temp % 10;
                temp /= 10;
            }

            if (soma == S) contador++;
        }

        System.out.println("Quantidade: " + contador);

        scanner.close();
    }

}
