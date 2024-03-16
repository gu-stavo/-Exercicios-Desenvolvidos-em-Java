package exercicio;
import java.util.Scanner;


public class Exercicio {

    public static void main(String[] args) {

        int idade1, idade2, idade3;

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a primeira idade (Entre 5 e 100):\n");
        idade1 = ler.nextInt();

        System.out.print("Digite a segunda idade (Entre 5 e 100):\n");
        idade2 = ler.nextInt();

        System.out.print("Digite a terceira idade (Entre 5 e 100):\n");
        idade3 = ler.nextInt();

        if (idade1 >= 5 && idade1 <= 100 &&
            idade2 >= 5 && idade2 <= 100 &&
            idade3 >= 5 && idade3 <= 100) {

            if (idade1 <= idade2 && idade3 >= idade2) {
                System.out.println("A idade de Camila é: " + idade2);
            } else if (idade1 >= idade2 && idade3 <= idade1) {
                System.out.println("A idade de Camila é: " + idade1);
            } else {
                System.out.println("A idade de Camila é: " + idade3);
            }
        } else {
            System.out.println("As idades devem estar entre 5 e 100.");
        }
    }

}
