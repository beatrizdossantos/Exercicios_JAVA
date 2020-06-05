package ex01f;

import javax.swing.JOptionPane;

public class Ex01f {
    public static void main(String[] args) {
        double f, k;
        f = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira a temperatura em graus fahrenheit"));
        
        k = (f-32)*5 / 9 + 273.15 ;
        
        JOptionPane.showMessageDialog(null,"Temperatura em Graus Fahrenheit: "+ f + ", \n" +
            "Temperatura em Graus Kelvin : " + k);
    }
    
}
