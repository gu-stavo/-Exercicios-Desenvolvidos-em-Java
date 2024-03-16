package trabalho_lojaveiculos;

public class Caminhao extends Veiculo{

    String chassi;
    int qtdCarretas;
    double tara;

    @Override
    double calcularValorVenda(float valor) {
        double valorAcrescimo = 0, valorFinal = 0;

        valorAcrescimo = valor * 0.50;
        valorFinal = valor + valorAcrescimo;
        return valorFinal;
    }

    
    
}
