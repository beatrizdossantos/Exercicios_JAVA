package ex01j;

import javax.swing.JOptionPane;

public class Ex01j {
    public static void main(String[] args) {
         int a,b,auxiliar;
        a = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um valor para a"));
        b = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um valor para b"));   
        
        auxiliar=a;
        a=b;
        b=auxiliar;
        
        JOptionPane.showMessageDialog(null,"O valor atual de a é : "+ a + ", \n" +
            "O valor atual de b é : " + b);
    }
    
}
