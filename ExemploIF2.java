package poofatec;

import java.util.Scanner;

public class ExemploIF2 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int idade; 
        System.out.println("Digite a sua idade:");
        idade = ler.nextInt();
        
        if(idade <= 4){
            System.out.println("Você é um bebê");
            
        }else if(idade <=11){
            System.out.println("Você é uma criança");
        }else if(idade <=17){
            System.out.println("Você é um aborrescente");
        }else if(idade <= 64){
            System.out.println("Você é um adulto");
        }else{
            System.out.println("Você é o Boerrrrr!!!!");
        }
                
    }
    
}
