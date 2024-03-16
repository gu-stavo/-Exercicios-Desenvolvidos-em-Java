package poofatec;

import java.util.Scanner;

public class lataOleo {


    public static void main(String[] args) {


        final double pi = 3.14159;
        double volume, raio, altura;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("-----------Calcular o volume da Lata de óleo-----------");
        System.out.println("Digite o valor do Raio");
        raio = ler.nextDouble();
        
        System.out.println("Digite o valor da Altura");
        altura = ler.nextDouble();
        
        volume = pi * Math.pow(raio, 2) * altura;
        
        System.out.println("O Volume da Lata de Óleo é: " +volume);
        
        
    }
    
}
