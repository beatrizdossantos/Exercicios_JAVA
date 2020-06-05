package ex03b;

import javax.swing.JOptionPane;

public class Ex03b {
    public static void main(String[] args) {
      int soma, cont;
      soma=0;
      cont=1;
      while (cont < 101) {
           soma = soma+cont;
            cont++;
        }
      
      JOptionPane.showMessageDialog(null,"O RESULTADO DA SOMA É: " + soma);
    }
    
}
