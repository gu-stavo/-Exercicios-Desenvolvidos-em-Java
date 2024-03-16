package poofatec;

import java.util.Scanner;

public class ExemploFor {

    public static void main(String[] args) {

        String nome;
        int i;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um nome");
        nome = ler.next();
        System.out.println("------------------------");

//incrementar de 2 em dois = i =+2, ou i++3;
//descrementar i--;

        for (i = 0; i <= 9; i++) {
            System.out.println(nome);
        }
    }
}
