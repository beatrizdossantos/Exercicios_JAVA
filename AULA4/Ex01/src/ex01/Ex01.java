package ex01;

import java.util.Random;
import javax.swing.JOptionPane;

public class Ex01 {

    public static void main(String[] args) {
        int numUser;
        numUser = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o número inteiro de 0 a 10"));
        Random s = new Random();
        int sort = s.nextInt(11);
        
        if (numUser<0 || numUser>10){
           JOptionPane.showMessageDialog(null,"NÚMERO INVÁLIDO!");    
        } if (numUser==sort) {
             JOptionPane.showMessageDialog(null,"PARABÉNS, VOCÊ ACERTOU!, O NÚMERO SORTEADO FOI " + sort);
        } if (numUser!=sort & numUser>=0 & numUser<=10){
            JOptionPane.showMessageDialog(null,"VOCÊ ERROU!, O NÚMERO SORTEADO FOI " + sort);
        }
        
    }
}
    

