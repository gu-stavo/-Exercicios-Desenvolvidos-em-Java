package poofatec;

import java.util.Scanner;

public class exeSomaVetor {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int vet1[] = new int[10];
        int i, soma;
        soma = 0;

        for (i = 0; i <= 9; i++) {
            System.out.println("Digite um valor");
            vet1[i] = ler.nextInt();
        }

        for (i = 0; i <= 9; i++) {
            soma = vet1[i] + soma;
        }

        System.out.println("-------------------------\n");
        System.out.println(soma);
    }

}
