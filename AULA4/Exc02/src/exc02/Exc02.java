package exc02;

import java.util.Random;
import javax.swing.JOptionPane;

public class Exc02 {
    public static void main(String[] args) {
        int sort;
        int i = 0;
        int acerto=0;
        int erro=0;
        int inv = 0;
        
        while (i<5) {
            Random s = new Random();
            sort = s.nextInt(11);
            int numUser = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o número inteiro de 0 a 10"));
            if (numUser<0 || numUser>10){
               System.out.println("NÚMERO INVÁLIDO!");    
               inv++;
            } if (numUser==sort) {
                 System.out.println("PARABÉNS, VOCÊ ACERTOU!, O NÚMERO SORTEADO FOI " + sort);
                 acerto++;
            } if (numUser!=sort & numUser>=0 & numUser<=10){
                System.out.println("VOCÊ ERROU!, O NÚMERO SORTEADO FOI " + sort);
                erro++;
            }
       i++;
                
        }
       System.out.println("O SEU NÚMERO DE ACERTOS FOI: " + acerto); 
       System.out.println("O SEU NÚMERO DE ERROS FOI: " + erro);
       System.out.println("VOCÊ DIGITOU " + inv + " NÚMEROS INVÁLIDOS!"); 
    }
    
}
