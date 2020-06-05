package ex02e;

import javax.swing.JOptionPane;

public class Ex02e {
    public static void main(String[] args) {
       int n1, n2, n3, n4;
        n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o primeiro valor"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o segundo valor"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o terceiro valor"));
        n4 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o quarto valor"));
     
         if(n1%2 ==0 & n1%3 ==0) {
            JOptionPane.showMessageDialog(null,n1);
         } if(n2%2 ==0 & n2%3 ==0) {
            JOptionPane.showMessageDialog(null,n2); 
         } if(n3%2 ==0 & n3%3 ==0) {
            JOptionPane.showMessageDialog(null,n3);
         } if(n4%2 ==0 & n4%3 ==0) {
            JOptionPane.showMessageDialog(null,n4);
         }
    }
    
}
