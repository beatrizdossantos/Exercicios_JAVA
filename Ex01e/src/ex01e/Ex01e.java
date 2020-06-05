package ex01e;

import javax.swing.JOptionPane;

public class Ex01e {
    public static void main(String[] args) {
        double c, k;
        k = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira a temperatura em graus kelvin"));
        
        c = k - 273.15;
        
        JOptionPane.showMessageDialog(null,"Temperatura em Graus Kelvin: "+ k + ", \n" +
            "Temperatura em Graus Celsius : " + c);
    }
    
}
