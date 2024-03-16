package poofatec;

import javax.swing.JOptionPane;

public class Triangulo1 {

    public static void main(String[] args) {
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite seu numero"));
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        double base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
        JOptionPane.showMessageDialog(null, "Seu numero é: " + numero);
        JOptionPane.showMessageDialog(null, "Seu nome é: " + nome );
        JOptionPane.showMessageDialog(null, "A área é: " + ((base*altura)/2));
    }
     //Class JOptionPane = criar uma caixinha de dialogo pedindo os valor.
     //Double.parseDouble = converte o valor em double pq o valor digitado é texto. showInputDialog: entende que os valores digitados é texto e não numero.





}
