package ClienteProduto;

public class Cliente {

    CatalogoProduto catolgo = new CatalogoProduto();
    public String nome;
    public int idade;
    public String email;
    public String cpf;
    public double valorTotal;

    void comprar() {
        valorTotal = catolgo.somaCompras();
        System.out.println("O cliente " + nome + " está comprando");
        System.out.println("A soma dos valores do produto é: " + valorTotal);
        System.out.println("A nota deve sair no CPF: " + cpf);
        System.out.println("E deve ser enviada no email: " + email);
    }

    void cancelar() {
        System.out.println("O cliente " + nome + " está cancelando");
    }

    void sair() {
        System.out.println("O cliente " + nome + " está saindo");
    }
}
