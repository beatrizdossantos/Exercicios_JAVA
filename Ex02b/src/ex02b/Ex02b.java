package ex02b;

import javax.swing.JOptionPane;

public class Ex02b {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um número inteiro"));   
        
        if(numero>0) {
            JOptionPane.showMessageDialog(null,numero);
            } else {
            JOptionPane.showMessageDialog(null,(numero*-1));   
            } 
    }
    
}
