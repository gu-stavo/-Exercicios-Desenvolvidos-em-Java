package exercicioaluno;

public class PrincipalAluno {

    public static void main(String[] args) {
        
       // Instanciar 3 novos objetos
       Aluno aluno1 = new Aluno();
       aluno1.nomeAluno = "Silvio";
       aluno1.raAluno = 123456;
       aluno1.enderecoAluno = "Rua das Margaridas, 120";
       
       Aluno aluno2 = new Aluno();
       aluno2.nomeAluno = "Joãozinho";
       aluno2.raAluno = 121212;
       aluno2.enderecoAluno = "Rua das Hortências";
       
       Aluno aluno3 = new Aluno();
       aluno3.nomeAluno = "Mariazinha";
       aluno3.raAluno = 313131;
       aluno3.enderecoAluno = "Rua das Papoulas";
       
       //Mostrar 
        System.out.println("**** Aluno1 ****");
        System.out.println("Nome: " +aluno1.nomeAluno);
        System.out.println("RA: " +aluno1.raAluno);
        System.out.println("Endereço: " +aluno1.enderecoAluno);
        System.out.println();

        System.out.println("**** Aluno2 ****");
        System.out.println("Nome: " +aluno2.nomeAluno);
        System.out.println("RA: " +aluno2.raAluno);
        System.out.println("Endereço: " +aluno2.enderecoAluno);
        System.out.println();

        System.out.println("**** Aluno3 ****");
        System.out.println("Nome: " +aluno3.nomeAluno);
        System.out.println("RA: " +aluno3.raAluno);
        System.out.println("Endereço: " +aluno3.enderecoAluno);
        System.out.println();
        
        //tudo que esta em cima são os estados
        
        // tudo que esta embaixo são os comportamentos
        
        //Matricular Joãozinho e Mariazinha e mudar o endreço do Silvio
        
        aluno2.matricular();
        aluno3.matricular();
        
        aluno1.mudarEndereco("Rua das Violetas, 200");
        
        System.out.println("\n**** Aluno1 ****");
        System.out.println("Nome: " +aluno1.nomeAluno);
        System.out.println("RA: " +aluno1.raAluno);
        System.out.println("Endereço: " +aluno1.enderecoAluno);
        System.out.println();
    }

}
