package exercicioinstrumento;

public class Guitarra extends Instrumento{

    int qtd_casas;
    String tipo_captacao;

    @Override
    double vender(float valor){
        double valorAcrescimo = valor * 0.10;
        double valorFinal = 0;
        
        valorFinal = valor + valorAcrescimo;
        return valorFinal;
    }
    
    
}
