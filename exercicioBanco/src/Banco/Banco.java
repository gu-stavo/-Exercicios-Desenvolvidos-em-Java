package Banco;

public class Banco {

    public static void main(String[] args) {

       Conta conta1 = new Conta();
       conta1.numeroConta = 0001;
       conta1.titularConta = "Bill Gates";
       conta1.saldoConta = 100.00;
       
       
       System.out.println("Saldo: "+conta1.saldoConta);
       System.out.println();
       
       conta1.sacar(10.00);
       conta1.mostrarSaldo();
       
       System.out.println();
       conta1.depositar(50.00);
       conta1.mostrarSaldo();
       
    }

}
