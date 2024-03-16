package poofatec;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        int tabuada;
        int i, n = 0, valor;
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o numero da tabuada");
        tabuada = ler.nextInt();
        
        
        for(i=0; i <=10; i++){
            valor = tabuada * n;
            //System.out.println(n + " X " + i + .......................);

            System.out.println(" "+tabuada+ " X "+n+" = "+valor);
            n++;
    
        }             
    }

}
