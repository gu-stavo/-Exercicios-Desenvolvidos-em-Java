package ClienteProduto;

import java.util.Scanner;

public class CatalogoProduto {

    //variaveis do tipo global
    public int opcao;
    public double somaValor;
    public int quantidade;

    public double somaCompras() {
        
        opcao = 1;
        somaValor = 0;

        Scanner ler = new Scanner(System.in);

        while (opcao != 0) {
            System.out.println("Informe a opcao do Produto:");
            System.out.println("[1] - Coxinha - R$6.00");
            System.out.println("[2] - Pastel - R$7.50");
            System.out.println("[3] - Calda de cana - R$10.00");
            System.out.println("[0]Sair");
            opcao = ler.nextInt();

            if (opcao == 1) {
                System.out.println("Informe a Quantidade: ");
                quantidade = ler.nextInt();
                somaValor = somaValor + (6 * quantidade);
            }

            if (opcao == 2) {
                System.out.println("Informe a Quantidade: ");
                quantidade = ler.nextInt();
                somaValor = somaValor + (7.50 * quantidade);
            }

            if (opcao == 3) {
                System.out.println("Informe a Quantidade: ");
                quantidade = ler.nextInt();
                somaValor = somaValor + (10.00 * quantidade);
            }

        }
        return somaValor;
    }
}
