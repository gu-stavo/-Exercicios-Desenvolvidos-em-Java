package exemplo.polimorfismo.funcionario;

public class Engenheiro extends Funcionario{

    String especializacao;
    float valorSalarioExtra;
    
    
    @Override
    public float horaExtra(float valorHoraExtra,int qtdHoraExtra){
        
        valorSalarioExtra = valorHoraExtra * qtdHoraExtra;
        bonus = (valorSalarioExtra * 30) / 100;
        return (valorSalarioExtra + bonus);  
    }

}
