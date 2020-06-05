package ex02d;

import javax.swing.JOptionPane;

public class Ex02d {
    public static void main(String[] args) {
        int a, b, c;
        a = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um valor para a"));
        b = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um valor para b"));
        c = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um valor para c"));
        
     
         if(a>b & b>c) {
            JOptionPane.showMessageDialog(null,c + " (c)," + b + " (b)," + a + " (a)");
         } if(a>c & c>b) {
            JOptionPane.showMessageDialog(null,b + " (b)," + c + " (c)," + a + " (a)");
           } if(b>a & a>c) {
            JOptionPane.showMessageDialog(null,c + " (c)," + a + " (a)," + b + " (b)");
           } if(b>c & c>a) {
            JOptionPane.showMessageDialog(null,a + " (a)," + c + " (c)," + b + " (b)");
           } if(c>b & b>a) {
            JOptionPane.showMessageDialog(null,a + " (a)," + b + " (b)," + c + " (c)");
           } if(c>a & a>b) {
            JOptionPane.showMessageDialog(null,b + " (b)," + a + " (a)," + c + " (c)");
           } if(a==b & c!=a) {
            JOptionPane.showMessageDialog(null,"A E B SÃO IGUAIS");
           } if (a==c & b!=a) {
            JOptionPane.showMessageDialog(null,"A E C SÃO IGUAIS");
           } if (b==c & b!=a) {
            JOptionPane.showMessageDialog(null,"B E C SÃO IGUAIS ");
           } if (a==c & b==c) {
            JOptionPane.showMessageDialog(null,"TODOS OS NÚMEROS SÃO IGUAIS");
           }
    }
    
}
