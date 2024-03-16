package Banco;

public class Conta {

    public Integer numeroConta;
    public String titularConta;
    public double saldoConta;
    
    
    void sacar(double valor){
        
        if (this.saldoConta >= valor){
            this.saldoConta -= valor;
            System.out.println("Saque realizado com Sucesso! - " +valor);
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    
    void depositar(double valor){
        this.saldoConta += valor;
        System.out.println("Deposito realizado com Sucesso");
    }
    
    void mostrarSaldo( ){
        System.out.println("O saldo atual é: " + this.saldoConta);
    }
}
