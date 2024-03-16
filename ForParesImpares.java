package poofatec;

import java.util.Scanner;

public class ForParesImpares {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int i, n, soma = 0;
        double media, pares = 0, impares = 0;

        for (i = 1; i <= 15; i++) {
            System.out.print("Digite um numero");
            n = ler.nextInt();
            
            //soma +=n;
            
            soma = soma + n;

            if (n % 2 == 0) {
                pares++;
            }else{
                impares++;
            }

        }
        
        media = soma / 15; 
        System.out.println("a media é " + media);
        System.out.println("A quantidade de numeros impares é:  " + impares);
        System.out.println("A quantidade de numeros pares é: " + pares);
    }
}
