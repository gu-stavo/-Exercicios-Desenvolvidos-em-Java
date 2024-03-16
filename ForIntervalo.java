
package poofatec;

import java.util.Scanner;

public class ForIntervalo {

    public static void main(String[] args) {
       
        int i, n1, n2;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um numero");
        n1 = ler.nextInt();
        
        System.out.println("Digite outro numero");
        n2 = ler.nextInt();
        
        if(n1<n2){
           for(i=n1; i<=n2; i++){
               System.out.println(i + ", ");
           }
        }else if(n2 < n1){
            for(i=n2; i<=n1; i++){
                System.out.println(i + ", ");
            }
        }else{
            System.out.println("Os números são iguais");
        }
    }
    
}
