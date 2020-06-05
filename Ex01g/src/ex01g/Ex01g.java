package ex01g;

import javax.swing.JOptionPane;

public class Ex01g {
    public static void main(String[] args) {
        double f, k;
        k = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira a temperatura em graus Kelvin"));
        
        f = (9*(k-273.15)+160)/5;
        
        JOptionPane.showMessageDialog(null,"Temperatura em Graus Kelvin : "+ k + ", \n" +
            "Temperatura em Graus Fahrenheit : " + f);
    }
    
}
