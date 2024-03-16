package poofatec;

import java.util.Scanner;

public class doWhileDuzentos {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double soma, n;
        soma = 0;

       do {
            System.out.println("Digite um valor = ");
            n = ler.nextDouble();
            soma += n;
        }while(soma <= 200); 
       
        System.out.println("A soma dos números é: " + soma);

    }

}
