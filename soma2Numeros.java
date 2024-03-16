package poojava;

import java.util.Scanner;

public class POOJAVA {

    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
        int num1, num2, soma;
        
        System.out.println("Digite um numero");
        num1 = ler.nextInt();
        System.out.println("Digite outro numero");
        num2 = ler.nextInt();
        
        soma = num1+ num2;
        System.out.println("A soma e: " + soma);
    }
    
}
