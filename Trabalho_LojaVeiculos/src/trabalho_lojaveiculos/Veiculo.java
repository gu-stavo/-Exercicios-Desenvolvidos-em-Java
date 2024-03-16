package trabalho_lojaveiculos;

public class Veiculo {

    String marca;
    String nome;
    String tipo;
    float valor;

    double calcularValorVenda(float valor) {
        double valorAcrescimo = 0, valorFinal = 0;

        valorAcrescimo = valor * 0.10;
        valorFinal = valor + valorAcrescimo;
        return valorFinal;
    }
}
