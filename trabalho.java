package poofatec;

import java.util.Scanner;

public class trabalho {

    
    public static void main(String[] args) {

        //HT = horas trabalhadas; VH = valor hora trabalhada; PD = percentual de desconto //
       
        double HT, VH, PD, SB, TD, SL;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite as suas horas trabalhadas no mês: ");
        HT = ler.nextDouble();
        
        System.out.println("Digite o valor da hora trabalhada: ");
        VH = ler.nextDouble();
        
        System.out.println("Digite o valor do percetual de desconto:");
        PD = ler.nextDouble();
        
        SB = HT * VH;
        TD = (PD/100)*SB;
        SL = SB - TD;
        
        System.out.println("As suas Horas Trabalhadas são: "+HT+" horas");    
        System.out.println("O seu Salário Bruto é: "+SB);
        System.out.println("O seu Desconto é: "+TD);
        System.out.println("O seu Salário Liquido é: "+SL);
                
    }
    
}
