package poofatec;

import java.util.Scanner;

public class exeProva1 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int i;        
        Integer maior = Integer.MIN_VALUE;
        Integer menor = Integer.MAX_VALUE;
        
        System.out.println("Qual o tamanho do vetor: ");
        i = ler.nextInt();
        int vet1[] = new int[i];
                
                
        for (i = 0; i <= 4; i++) {
            System.out.println("Digite um valor");
            vet1[i] = ler.nextInt();

            if(vet1[i] > maior){
                maior = vet1[i];
        
            }
            
            if(vet1[i] < menor){
                menor = vet1[i];
            }
        }
        System.out.println("O maior é " +maior );
        System.out.println("O menor é " +menor);
    }
}
