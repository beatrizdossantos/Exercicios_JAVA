package ex01b;

import javax.swing.JOptionPane;

public class Ex01b {
    public static void main(String[] args) {
        double c, f;
        c = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira a temperatura em graus celsius"));
        
        f = (9*c + 160)/5;
        
        JOptionPane.showMessageDialog(null,"Temperatura em Graus Celsius: "+ c + ", \n" +
            "Temperatura em Graus Fahrenheit: " + f);
    }
    
}
