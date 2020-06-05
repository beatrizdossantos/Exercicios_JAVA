package ex01i;

import javax.swing.JOptionPane;

public class Ex01i {
    public static void main(String[] args) {
        double p, d, r;
        r = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o raio da esfera"));
        d = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira a densidade da esfera"));
        
        p = d*4*3.141592653589793*r*r*r/3;
        
        JOptionPane.showMessageDialog(null,"O Peso dessa esfera é: "+ p);
    }
    
}
