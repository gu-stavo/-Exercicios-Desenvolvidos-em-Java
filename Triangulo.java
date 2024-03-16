package poofatec;

import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {

        double area, base, altura;

        Scanner ler = new Scanner(System.in);

        System.out.println("Diigte o valor da base");
        base = ler.nextDouble();

        //double base = ler.nextDouble(); CRIA A VARIAVEL NO ESCOPO.
        
        
        System.out.println("Digite o valor da altura");
        altura = ler.nextDouble();

        area = (base * altura) / 2;

        System.out.println("o valor da area é: " + area);
    }

}
