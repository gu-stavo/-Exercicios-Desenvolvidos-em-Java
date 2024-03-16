package poofatec;

import java.util.Scanner;

public class ExemploSwitch {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int opcao;
        
        System.out.println("Digite uma opção");
        System.out.println("1 - Agronegócio");
        System.out.println("2 - Gestão Empresarial");
        System.out.println("3 - Análise e Desenvolvimento de Sistemas");
        System.out.println("4 - Sistemas para Internet");
        opcao = ler.nextInt();
        
        switch(opcao){
            case 1:{
                System.out.println("Você escolheu Agro");
                break;
            }
            case 2:{
                System.out.println("Você escolheu Gestão");
                break;
            }
            case 3:{
                System.out.println("Você escolheu ADS");
                break;
            }
            case 4:{
                System.out.println("Você escolheu Sistemas");
                break;
            }
            default:{
                System.out.println("Cê tá louco veio... é de 1 a 4. Opção inválida");
            }
        }
    }

}

