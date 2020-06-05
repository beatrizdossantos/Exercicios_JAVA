package ex02i;

import javax.swing.JOptionPane;

public class Ex02i {
    public static void main(String[] args) {
        int valor;
        valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um número inteiro"));   
        
        if(valor%2==0) {
            JOptionPane.showMessageDialog(null,"O Valor é PAR");
            } else {
            JOptionPane.showMessageDialog(null,"O Valor é IMPAR");   
            } 
    }
    
}
