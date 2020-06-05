package ex01c;

import javax.swing.JOptionPane;

public class Ex01c {
    public static void main(String[] args) {
        double c, f;
        f = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira a temperatura em graus fahrenheit"));
        
        c = ((f - 32) *5)/9;
        
        JOptionPane.showMessageDialog(null,"Temperatura em Graus Fahrenheit: "+ f + ", \n" +
            "Temperatura em Graus Celsius : " + c);
    }
    
}
