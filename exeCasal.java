package poofatec;

import java.util.Scanner;

public class exeCasal {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        
        String mat[][] = new String[5][2];
        
        int i, j;
        
        for(i = 0; i <= 4; i++){
            for(j = 0; j <= 1; j++){
                System.out.println("Digite o nome do casal  " + i + " e " + j + ": ");
                mat[i][j] = ler.next();
            }
        }
        System.out.println("--------------------------\n");
        for(i = 0; i <= 4; i++){
            for(j = 0; j <= 1; j++){
                System.out.print(mat[i][j] + ", ");
            } 
            System.out.println("\n------------");
        }
    }
}
