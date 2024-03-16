package exercicioaluno;

public class Aluno {

    Integer raAluno;
    String nomeAluno;
    String enderecoAluno;
    
    void matricular(){
        System.out.println("Aluno matriculado com sucesso!");
    }
    
    void mudarEndereco(String novoEndereco){
        this.enderecoAluno = novoEndereco;
        
    }
}
