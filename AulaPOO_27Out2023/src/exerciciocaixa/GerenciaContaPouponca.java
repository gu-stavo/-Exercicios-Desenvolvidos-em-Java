package exerciciocaixa;

public class GerenciaContaPouponca {

    float saldo = 0;

    public float DepositoContaPouponca(float valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito invalido");
        }
        return saldo;
    }

    public float SaqueContaPouponca(float valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
        } else {
            System.out.println("Valor de saque invalido");
        }
        return saldo;
    }
}
