package ex03e;

import javax.swing.JOptionPane;

public class Ex03e {
    public static void main(String[] args) {
        int i=1;
         int soma=0;
        while (i < 51) {
            if (i%2==0){
                soma= soma+i;
        }
            i++;
    }
        JOptionPane.showMessageDialog(null,"O RESULTADO DA SOMA É: " + soma);
    
    }
    
}
