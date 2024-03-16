package poofatec;

import java.util.Scanner;

public class temperatura {

    public static void main(String[] args) {
       
        double f, c;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        c = ler.nextDouble();
        
        f = (9 * c + 160) / 5;
        
        System.out.println("A temperatura em Celsius: " +c+ "  em Fahrenheit é: " +f);
        
    }
    
}
