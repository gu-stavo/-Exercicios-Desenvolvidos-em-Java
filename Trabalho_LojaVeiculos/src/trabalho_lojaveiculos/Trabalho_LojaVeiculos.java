package trabalho_lojaveiculos;

import java.util.Scanner;

public class Trabalho_LojaVeiculos {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int opcao = 0;

        Carro oCarro = new Carro();
        Moto oMoto = new Moto();
        Caminhao oCaminhao = new Caminhao();

        System.out.println("*******Menu*******");
        System.out.println("* [1] Carro      *");
        System.out.println("* [2] Moto       *");
        System.out.println("* [3] Caminhao   *");
        System.out.println("* [0] Sair       *");
        System.out.println("******************");
        System.out.print("Digite a opção: ");
        opcao = ler.nextInt();

        if (opcao == 1) {
            System.out.println("Opcao escolhida = [Carro]");
            System.out.println("-----------------------------------------\n");
            System.out.println("Digite a marca do Carro: ");
            oCarro.marca = ler.next();
            System.out.println("Digite o nome do Carro: ");
            oCarro.nome = ler.next();
            System.out.println("Digite o tipo do Carro: ");
            oCarro.tipo = ler.next();
            System.out.println("Digite a Quantidade de lugares que o Carro possui:");
            oCarro.qtdLugares = ler.nextInt();
            System.out.println("Digite o numero de portas que o Carro possui:");
            oCarro.numPortas = ler.nextInt();
            System.out.println("Digite a potência do Carro:");
            oCarro.potencia = ler.nextDouble();
            System.out.println("Digite o valor inicial do Carro: ");
            oCarro.valor = ler.nextFloat();
            System.out.println("------------------------------------");
            System.out.println("******** Tabela de Informações do Carro ********");
            System.out.println("Marca do Carro: " + oCarro.marca);
            System.out.println("Nome do Carro: " + oCarro.nome);
            System.out.println("Tipo de Carro: " + oCarro.tipo);
            System.out.println("Quantidade de Lugares: " + oCarro.qtdLugares);
            System.out.println("Número de Portas: " + oCarro.numPortas);
            System.out.println("Potência do Carro: " + oCarro.potencia);
            System.out.println("Valor Inicial: " + oCarro.valor);
            System.out.println("Valor Final(+acrescimo de 30%): " + oCarro.calcularValorVenda(oCarro.valor));
            System.out.println("**************************************************");
        }
        if (opcao == 2) {
            System.out.println("Opcao escolhida = [Moto]");
            System.out.println("-----------------------------------------\n");
            System.out.println("Digite a marca da Moto: ");
            oMoto.marca = ler.next();
            System.out.println("Digite o nome da Moto: ");
            oMoto.nome = ler.next();
            System.out.println("Digite o tipo da Moto: ");
            oMoto.tipo = ler.next();
            System.out.println("Digite as Cilindradas da Moto: ");
            oMoto.cilindradas = ler.nextInt();
            System.out.println("Digite o valor inicial da Moto: ");
            oMoto.valor = ler.nextFloat();
            System.out.println("------------------------------------");
            System.out.println("******** Tabela de Informações da Moto ********");
            System.out.println("Marca da Moto: " + oMoto.marca);
            System.out.println("Nome da Moto: " + oMoto.nome);
            System.out.println("Tipo de Moto: " + oMoto.tipo);
            System.out.println("Cilindradas: " + oMoto.cilindradas);
            System.out.println("Valor Inicial: " + oMoto.valor);
            System.out.println("Valor Final(+acrescimo de 10%): " + oMoto.calcularValorVenda(oMoto.valor));
            System.out.println("**************************************************");
        }
                
        if (opcao == 3) {
            System.out.println("Opcao escolhida = [Caminhao]");
            System.out.println("-----------------------------------------\n");
            System.out.println("Digite a marca do Caminhao: ");
            oCaminhao.marca = ler.next();
            System.out.println("Digite o nome do Caminhao: ");
            oCaminhao.nome = ler.next();
            System.out.println("Digite o tipo do Caminhao: ");
            oCaminhao.tipo = ler.next();
            System.out.println("Digite o chassi do Caminhao: ");
            oCaminhao.chassi = ler.next();
            System.out.println("Digite a quantidade de carretas que o Caminhao possui: ");
            oCaminhao.qtdCarretas = ler.nextInt();
            System.out.println("Digite o peso total que o Caminhao suporta carregar(Tara): ");
            oCaminhao.tara = ler.nextDouble();
            System.out.println("Digite o valor inicial do Caminhao: ");
            oCaminhao.valor = ler.nextFloat();
            System.out.println("------------------------------------");
            System.out.println("******** Tabela de Informações do Caminhao ********");
            System.out.println("Marca do Caminhao: " + oCaminhao.marca);
            System.out.println("Nome do Caminhao: " + oCaminhao.nome);
            System.out.println("Tipo de Caminhao: " + oCaminhao.tipo);
            System.out.println("Chassi: " + oCaminhao.chassi);
            System.out.println("Quantidade de Carretas: " + oCaminhao.qtdCarretas);
            System.out.println("Tara: " + oCaminhao.tara);
            System.out.println("Valor Inicial: " + oCaminhao.valor);
            System.out.println("Valor Final(+acrescimo de 50%): " + oCaminhao.calcularValorVenda(oCaminhao.valor));
            System.out.println("**************************************************");
        }
    }

}
