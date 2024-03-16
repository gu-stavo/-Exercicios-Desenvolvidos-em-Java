package poofatec;

import java.util.Scanner;

public class ForIntervalo2 {

    public static void main(String[] args) {

        int i, n1, n2, maior, menor;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero");
        n1 = ler.nextInt();

        System.out.println("Digite outro numero");
        n2 = ler.nextInt();

        maior = Math.max(n1, n2);
        menor = Math.min(n1, n2);

        for (i = menor; i <= maior; i++) {
            System.out.print(i + ", ");
        }

    }

}
