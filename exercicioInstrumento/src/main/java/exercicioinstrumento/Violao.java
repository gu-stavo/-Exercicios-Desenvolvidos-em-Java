package exercicioinstrumento;

public class Violao extends Instrumento{

    int qtd_cordas;

    @Override
    double vender(float valor){
        double valorAcrescimo = valor * 0.05;
        double valorFinal = 0;
        
        valorFinal = valor + valorAcrescimo;
        return valorFinal;
    }
}
