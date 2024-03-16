package exemplo.polimorfismo.funcionario;

import java.util.Scanner;

public class Funcionario {

    String nome;
    int idade, qtdHoras;
    float salario, valorHora, bonus;
    
    Scanner ler = new Scanner(System.in);
    
    public void entrada(){
        System.out.println("O funcionario está começando o Expediente");
    }
    
    public void saida(){
        System.out.println("O funcionario está encerrando o Expediente");
    }
    
    public float horaExtra(float valorHoraExtra, int quantidadeHoraExtra){
        float valorSalarioExtra;
        valorSalarioExtra = valorHoraExtra * quantidadeHoraExtra;
        bonus = (valorSalarioExtra * 20) / 100;
        return (valorSalarioExtra + bonus);  
    }
    
    public float calcSalario(float salario, float valorHoraExtra){
        float salarioFinal;
        salarioFinal = salario + valorHoraExtra;
        return salarioFinal;
    }
}
