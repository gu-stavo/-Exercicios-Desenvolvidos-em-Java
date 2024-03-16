package ExercicioClienteConta;

public class Conta {

    public String titular;
    public String cpf;
    public double saldoCorrente;
    public double saldoPoupanca;
    public double valor;

    void mensagem(){
        System.out.println("Olá " +titular+ " do CPF: "+cpf+ ", Bem Vindo!!");
    }
    
    void saqueCC(double valor) {
        System.out.println("Conta Corrente");
        System.out.println("Saldo Atual: "+saldoCorrente);
        
        if(valor > saldoCorrente){
            System.out.println("Valor maior que o Saldo");
        }else{
            System.out.println("Sacar: " + valor);
            saldoCorrente = saldoCorrente - valor;
            System.out.println("Saque realizado com Sucesso!");
            System.out.println("O saldo atual é: " + saldoCorrente);
        }
    }

    void saqueCP(double valor) {
        System.out.println("Conta Pouponça");
        System.out.println("Saldo Atual: "+saldoPoupanca);
        
        if(valor > saldoPoupanca){
            System.out.println("Valor maior que o saldo");
        }else{
            System.out.println("Sacar: " + valor);
            saldoPoupanca = saldoPoupanca - valor;
            System.out.println("Saque realizado com Sucesso!");
            System.out.println("O saldo atual é: " + saldoPoupanca);
        }
    }

    void depositarCC(double valor) {
        System.out.println("Conta Corrente");
        System.out.println("Saldo Atual: "+saldoCorrente);
        System.out.println("Depositar: "+valor);
        saldoCorrente = saldoCorrente + valor;
        System.out.println("Novo Saldo: "+saldoCorrente);
    }
    
    void depositarCP(double valor){
        System.out.println("Conta Pouponça");
        System.out.println("Saldo Atual: "+saldoPoupanca);
        System.out.println("Depositar: "+valor);
        saldoPoupanca = saldoPoupanca + valor;
        System.out.println("Novo Saldo: "+saldoPoupanca);
    }
}
