package polimorfismo;

public class Polimorfismo {

    public static void main(String[] args) {

        Animal cao = new Animal();
        cao = new Cachorro();
        cao.fazerSom();
        
        Animal gato;
        gato = new Gato();
        gato.fazerSom();
    }

}
