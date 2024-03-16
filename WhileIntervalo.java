package poofatec;

import java.util.Scanner;

public class WhileIntervalo {

    public static void main(String[] args) {

        int numero, numero2;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero");
        numero = ler.nextInt();

        System.out.println("Digite o segundo numero:");
        numero2 = ler.nextInt();
        
        while (numero <= numero2) {
            System.out.println("" + numero);
            numero++;
        }

    }
}
