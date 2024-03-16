package herancajava;

public class HerancaJava {

    public static void main(String[] args) {

        FuncionarioSecretaria funSecretaria = new FuncionarioSecretaria();
        funSecretaria.cpf = "985.698.452-09";
        funSecretaria.formacao = "Administração de Empresas";
        funSecretaria.idade = 32;
        funSecretaria.linguas = "Ingles";
        funSecretaria.nome = "Joséfa";
        funSecretaria.salario = 5000;
        System.out.println("A Funcionaria "+funSecretaria.nome+" de idade "
                +funSecretaria.idade+" formada em "+funSecretaria.formacao);
        System.out.println("Secretaria");
        funSecretaria.PassarPontoEntrada();
        funSecretaria.sairAlmoco();
        funSecretaria.PassarPontoSaida();

        System.out.println("\n------------------------------\n");

        FuncionarioOperario funOperario = new FuncionarioOperario();
        funOperario.cpf = "727.898.877-99";
        funOperario.nome = "João da Silva";
        funOperario.especializacao = "Demolição";
        System.out.println("O Operário "+funOperario.nome+" de cpf "+funOperario.cpf+
                " especializado em "+funOperario.especializacao);
        System.out.println("Operário");
        funOperario.PassarPontoEntrada();
        funOperario.construirCasa();
        funOperario.PassarPontoSaida();

        System.out.println("");
    }

}
