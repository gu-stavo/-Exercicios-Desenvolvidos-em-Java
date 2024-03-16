package poofatec;

import java.util.Scanner;

public class exeDuzentos {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double soma, n;
        soma = 0;

        while (soma <= 200) {
            System.out.println("Digite um valor = ");
            n = ler.nextDouble();
            soma = soma + n;
        }
        System.out.println("A soma dos números é: "+soma);
    }
}
