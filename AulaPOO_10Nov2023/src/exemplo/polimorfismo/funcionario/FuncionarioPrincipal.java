package exemplo.polimorfismo.funcionario;

import java.util.Scanner;

public class FuncionarioPrincipal {

    public static void main(String[] args) {

        int opcao = 0, qtdHoraExtra;
        float valorHoraExtra;
        Secretaria oSecretaria = new Secretaria();
        Scanner ler = new Scanner(System.in);
        
        Engenheiro oEngenheiro = new Engenheiro();
        
        
        System.out.println("Informe o funcionário: ");
        System.out.println("[1] - Secretária");
        System.out.println("[2] - Engenheiro");
        System.out.println("Informe a opção");
        opcao = ler.nextInt();
        
        if(opcao == 1){
            
            oSecretaria.entrada();
            System.out.println("Informe o Nome:");
            oSecretaria.nome = ler.next();
            System.out.println("Informe o Idade");
            oSecretaria.idade = ler.nextInt();
            System.out.println("Informe as Horas Trabalhadas:");
            oSecretaria.qtdHoras = ler.nextInt();
            System.out.println("Informe o Salario:");
            oSecretaria.salario = ler.nextFloat();
            System.out.println("Informe o Valor da Hora Trabalhada:");
            oSecretaria.valorHora = ler.nextFloat();
            System.out.println("Informe o Idioma(s):");
            oSecretaria.linguas = ler.next();
            System.out.println("Informe o Valor das Horas Extras:");
            valorHoraExtra = ler.nextFloat();
            System.out.println("Informe a quantidade das Horas Extras:");
            qtdHoraExtra = ler.nextInt();
            
            System.out.println("------------------------------------------------------------------------");
            
            System.out.println("O funcionario " +oSecretaria.nome+ " de idade "+oSecretaria.idade+
                    " anos. Receberá:");
           
            
            
            System.out.println("O valor em horas extras é R$ " 
                    +oSecretaria.horaExtra(valorHoraExtra,qtdHoraExtra));
            
            System.out.println("O valor do salario é R$ " +oSecretaria.calcSalario(oSecretaria.salario,oSecretaria.horaExtra(valorHoraExtra, qtdHoraExtra)));

            System.out.println("As linguas faladas pela secretária são " +oSecretaria.linguas);
            
            oSecretaria.saida();
        }
        if(opcao == 2){
            oEngenheiro.entrada();
            System.out.println("Informe o Nome:");
            oEngenheiro.nome = ler.next();
            System.out.println("Informe o Idade");
            oEngenheiro.idade = ler.nextInt();
            System.out.println("Informe a Especialização do Engenheiro");
            oEngenheiro.especializacao = ler.next();
            System.out.println("Informe as Horas Trabalhadas:");
            oEngenheiro.qtdHoras = ler.nextInt();
            System.out.println("Informe o Salario:");
            oEngenheiro.salario = ler.nextFloat();
            System.out.println("Informe o Valor da Hora Trabalhada:");
            oEngenheiro.valorHora = ler.nextFloat();
            System.out.println("Informe a quantidade de Horas Extras");
            qtdHoraExtra = ler.nextInt();
            System.out.println("Informe o valor da Horas Extras");
            valorHoraExtra = ler.nextFloat();

            System.out.println("------------------------------------------------------------------------");
            
            System.out.println("O funcionario " +oEngenheiro.nome+ " de idade "+oEngenheiro.idade+
                    " anos. Receberá:");
            
            System.out.println("O valor em horas extras é R$ " 
                    +oEngenheiro.horaExtra(valorHoraExtra,qtdHoraExtra));
            
            System.out.println("O valor do salario é R$ " +oEngenheiro.calcSalario(oEngenheiro.salario,oEngenheiro.horaExtra(valorHoraExtra, qtdHoraExtra)));
            
            
            System.out.println("A Especialização do Engenheiro é: " +oEngenheiro.especializacao);
            
            oEngenheiro.saida();
        }
        
        
        
    }

}
