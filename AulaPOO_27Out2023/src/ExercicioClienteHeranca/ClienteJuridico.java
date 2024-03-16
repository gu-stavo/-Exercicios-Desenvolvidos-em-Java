package ExercicioClienteHeranca;

public class ClienteJuridico extends Cliente{

    String cnpj;
    String nomeFantasia;
    
    public void comprarAtacado(){
        System.out.println("Cliente juridico comprou em atacado");
    }
}
