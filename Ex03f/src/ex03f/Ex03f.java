package ex03f;

import javax.swing.JOptionPane;

public class Ex03f {
    public static void main(String[] args) {
        int num,cont;

        num = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um número"));
        
        cont=num-1;
        while (cont>0) {
            num=num*cont; 
            cont--;
        }
        JOptionPane.showMessageDialog(null,"O FATORIAL DESSE NÚMERO É: " + num);
    }
    
}
