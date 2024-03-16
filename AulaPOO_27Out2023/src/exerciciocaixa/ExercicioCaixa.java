package exerciciocaixa;

import java.util.Scanner;

public class ExercicioCaixa {

    public static void main(String[] args) {

        float saldo, valor;
        int opcao = 1;
        Scanner ler = new Scanner(System.in);
        GerenciaContaCorrente contaCorrente = new GerenciaContaCorrente();
        GerenciaContaPouponca contaPoupanca = new GerenciaContaPouponca();
        
        while (opcao != 0) {
            System.out.println("Opções:");
            System.out.println("Deposito CC - digite 1");
            System.out.println("Saque CC - digite 2");
            System.out.println("Deposito CP - digite 3");
            System.out.println("Saque CP - digite 4");
            System.out.println("Sair, digite 0");
            opcao = ler.nextInt();

            if (opcao == 1) {
                System.out.println("Informe o valor de deposito na conta corrente:");
                valor = ler.nextFloat();
                saldo = contaCorrente.DepositoContaCorrente(valor);
                System.out.println("O saldo da conta corrente é :  " + saldo);
            }
            if (opcao == 2){
                System.out.println("Informe o valor do saque na conta corrente:");
                valor = ler.nextFloat();
                saldo = contaCorrente.SaqueContaCorrente(valor);
                System.out.println("O saldo da conta corrente é :  " + saldo);
            }
            if (opcao == 3) {
                System.out.println("Informe o valor de deposito na conta pouponça:");
                valor = ler.nextFloat();
                saldo = contaPoupanca.DepositoContaPouponca(valor);
                System.out.println("O saldo da conta pouponca é :  " + saldo);
            }
            if (opcao == 4){
                System.out.println("Informe o valor do saque na conta pouponça:");
                valor = ler.nextFloat();
                saldo = contaPoupanca.SaqueContaPouponca(valor);
                System.out.println("O saldo da conta pouponca é :  " + saldo);
            }
        }
    }

}
