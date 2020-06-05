package ex02g;

import javax.swing.JOptionPane;

public class Ex02g {
    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um número inteiro entre 1 e 9"));   
        
        if(num>0 & num<10) {
            JOptionPane.showMessageDialog(null,"O valor está na faixa permitida");
            } else {
            JOptionPane.showMessageDialog(null,"O valor está fora da faixa permitida");   
            } 
    }
    
}
