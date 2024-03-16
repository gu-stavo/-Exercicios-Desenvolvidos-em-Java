package poofatec;

import java.util.Scanner;

public class PooFatec {

    public static void main(String[] args) {

        int n1, n2, result;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número");
        n1 = ler.nextInt();

        System.out.println("Digite outro numero");
        n2 = ler.nextInt();

        result = n1 * n2;
        System.out.println("O resultado da multiplicaação é: " + result);
        
        
    }

}
