package ExercicioClienteHeranca;

public class ClientePrincipal {

    public static void main(String[] args) {

        ClienteFisico clienteF = new ClienteFisico();
        ClienteJuridico clienteJ = new ClienteJuridico();
        
        System.out.println("***Cliente Fisico***");
        clienteF.nome = "Joao";
        clienteF.email = "joao@gmail.com";
        clienteF.endereco = "Rua reta";
        clienteF.cpf = "123.456.789-10";
        clienteF.rg = "45.789.478-98";
        System.out.println("O cliente fisico do nome "+clienteF.nome+ " do email "
                +clienteF.email+" mora na "+clienteF.endereco);
        System.out.println("Cliente possui CPF "+clienteF.cpf+ " e o RG "+clienteF.rg);
        clienteF.comprarOnline();
        
        
        System.out.println("***Cliente Jurídico***");
        clienteJ.nome = "Amanda";
        clienteJ.nomeFantasia = "Construção e Demostrução MEI";
        clienteJ.email = "construcao@gmail.com";
        clienteJ.endereco = "Rua Torta";
        clienteJ.comprarAtacado();
    }

}
