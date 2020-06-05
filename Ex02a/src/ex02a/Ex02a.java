package ex02a;

import javax.swing.JOptionPane;

public class Ex02a {
    public static void main(String[] args) {
        int num1,num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um número inteiro"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um segundo valor inteiro"));   
        
        if(num1>num2) {
            JOptionPane.showMessageDialog(null,"O resultado é : "+ (num1-num2));
            } if(num2>num1) {
            JOptionPane.showMessageDialog(null,"O resultado é : "+ (num2-num1));   
            } if(num1==num2) {
            JOptionPane.showMessageDialog(null,"Ambos os números são iguais, portanto,o resultado é "+ (num1-num2));    
            }
        
    }
    
}
