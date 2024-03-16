package exercicioinstrumento;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        
        
        Violao oViolao = new Violao();
        Guitarra oGuitarra = new Guitarra();
        
        System.out.println("Digite a marca do violao: ");
        oViolao.marca = ler.next();
        System.out.println(oViolao.marca);
        
        System.out.println("Digite o valor: ");
        oViolao.valor = ler.nextFloat();
        System.out.println(oViolao.vender(oViolao.valor));
        
        System.out.println("Digite o ano: ");
        oViolao.ano_fabricacao = ler.next();
        System.out.println(oViolao.ano_fabricacao);
        
        System.out.println("Digite a qtd de cordas: ");
        oViolao.qtd_cordas = ler.nextInt();
        System.out.println(oViolao.qtd_cordas);
        
        System.out.println("Digite a marca da guitarra: ");
        oGuitarra.marca = ler.next();
        System.out.println(oGuitarra.marca);
        
        System.out.println("Digite o valor da guitarra: ");
        oGuitarra.valor = ler.nextFloat();
        System.out.println(oGuitarra.vender(oGuitarra.valor));
        
        System.out.println("Digite o ano: ");
        oGuitarra.ano_fabricacao = ler.next();
        System.out.println(oGuitarra.ano_fabricacao);
        
        System.out.println("Digite quantidade de casas: ");
        oGuitarra.qtd_casas = ler.nextInt();
        System.out.println(oGuitarra.qtd_casas);
        
        System.out.println("Digite o tipo de captação guitarra ");
        oGuitarra.tipo_captacao = ler.next();
        System.out.println(oGuitarra.tipo_captacao);
        
        
        
    }

}
