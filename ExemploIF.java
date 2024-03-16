package poofatec;

import java.util.Scanner;

public class ExemploIF {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int idade;
        
        System.out.println("Digite a sua idade:");
        idade = ler.nextInt();
        
        if( idade >= 18){
            System.out.println("Você é maior de idade");
        }else{
            System.out.println("Você é menor de idade");
        }
        
    }

}
