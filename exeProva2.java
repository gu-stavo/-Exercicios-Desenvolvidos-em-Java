package poofatec;

import java.util.Scanner;

public class exeProva2 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int vet1[] = new int[10];
        int i, somaImpar, somaPar, par;
        somaImpar = 0;
        somaPar = 0;
        i = 0;
        par = 0;
        float media = 0;
        

        while (i <= 9) {
            System.out.println("Digite um valor");
            vet1[i] = ler.nextInt();

            if (vet1[i] % 2 == 0) {
                somaPar += vet1[i];
                par++;
            } else {
                somaImpar += vet1[i];
            }
           i++; 
        }

        media = somaPar / par;
        System.out.println("A soma dos numeros impares é:   " + somaImpar);
        System.out.println("A media dos numeros pares é:    " + media);
    }
}
