package trabalho_lojaveiculos;

public class Moto extends Veiculo{

    int cilindradas;

    @Override
    double calcularValorVenda(float valor) {
        double valorAcrescimo = 0, valorFinal = 0;

        valorAcrescimo = valor * 0.10;
        valorFinal = valor + valorAcrescimo;
        return valorFinal;
    }
    
    
}
