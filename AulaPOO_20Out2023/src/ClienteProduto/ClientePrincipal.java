package ClienteProduto;

public class ClientePrincipal {

    public static void main(String[] args) {

        Cliente pedro = new Cliente();
        pedro.nome = "João";
        pedro.cpf = "872.987.625-33";
        pedro.email = "pedrao@gmail.com";
        pedro.valorTotal = 885.72;
        pedro.comprar();
    }

}
