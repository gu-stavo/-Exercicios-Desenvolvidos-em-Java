package poofatec;

import java.util.Scanner;

public class ForMaiorMenor {

    public static void main(String[] args) {
        int i, n, maior = 0, menor = 10000000;
        
        Scanner ler = new Scanner(System.in);

        for (i = 0; i <= 9; i++) {
            
            System.out.print("Digite um numero: ");
            n = ler.nextInt();
            
            if(n > maior){
                maior = n;
        
            }
            
            if(n < menor){
                menor = n;
            }
        }
        
        System.out.println("O maior é " +maior );
        System.out.println("O menor é " +menor);
    }
}
