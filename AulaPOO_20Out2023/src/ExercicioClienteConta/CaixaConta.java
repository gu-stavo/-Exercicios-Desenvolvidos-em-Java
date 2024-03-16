package ExercicioClienteConta;

import java.util.Scanner;

public class CaixaConta {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        Conta oConta = new Conta();
        oConta.cpf = "598.758.741-12";
        oConta.saldoCorrente = 1000.00;
        oConta.saldoPoupanca = 1000.00;
        
        double valor;
        System.out.println("Informe o Nome do Proprietário da Conta:");
        oConta.titular = ler.next();
        System.out.println("*****Buscando os dados do Proprietário*****");
        oConta.mensagem();
        System.out.println("Operações no CAIXA Disponiveis");
        System.out.println("[1] Sacar Conta Corrente");
        System.out.println("[2] Sacar Conta Pouponça");
        System.out.println("[3] Depositar Conta Corrente");
        System.out.println("[4] Depositar Conta Pouponça");
        System.out.print("Qual Operação vc quer realizar: ");
        int opcao = ler.nextInt();
        System.out.println("---------------------------------------");
        
        if (opcao == 1){
            System.out.println("Digite o valor para SACAR:");
            valor = ler.nextInt();
            oConta.saqueCC(valor);
            System.out.println("---------------------------------------");
        }
        
        if (opcao == 2){
            System.out.println("Digite o valor para SACAR:");
            valor = ler.nextInt();
            oConta.saqueCP(valor);
            System.out.println("---------------------------------------");
        }
        
        if (opcao == 3){
            System.out.println("Digite o valor:");
            valor = ler.nextInt();
            oConta.depositarCC(valor);
            System.out.println("---------------------------------------");
        }
        
        if (opcao == 4){
            System.out.println("Digite o valor:");
            valor = ler.nextInt();
            oConta.depositarCP(valor);
            System.out.println("---------------------------------------");
        }
    }

}
