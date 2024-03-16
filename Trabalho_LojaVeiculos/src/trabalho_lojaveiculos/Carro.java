package trabalho_lojaveiculos;

public class Carro extends Veiculo {

    int qtdLugares;
    int numPortas;
    double potencia;

    @Override
    double calcularValorVenda(float valor) {
        double valorAcrescimo = 0, valorFinal = 0;

        valorAcrescimo = valor * 0.30;
        valorFinal = valor + valorAcrescimo;
        return valorFinal;
    }
    

}
