package ex01d;

import javax.swing.JOptionPane;

public class Ex01d {
    public static void main(String[] args) {
        double c, k;
        c = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira a temperatura em graus celsius"));
        
        k = c+273.15;
        
        JOptionPane.showMessageDialog(null,"Temperatura em Graus Celsius: "+ c + ", \n" +
            "Temperatura em Graus Kelvin : " + k);
    }
    
}
