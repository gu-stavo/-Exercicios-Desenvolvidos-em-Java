package ExercicioClienteHeranca;

public class ClienteFisico extends Cliente{

    String cpf;
    String rg;
    
    public void comprarOnline(){
        System.out.println("Cliente fisico comprou online!\n");
    }
}
