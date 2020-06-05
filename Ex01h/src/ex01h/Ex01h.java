package ex01h;

import javax.swing.JOptionPane;

public class Ex01h {
    public static void main(String[] args) {
        double r, a, v;
        r = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o raio do galão"));
        a = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira a altura do galão"));
        
        v = 3.141592653589793 *r*r*a ;
        
        JOptionPane.showMessageDialog(null,"O Volume desse galão é: "+ v);
    }
    
}
