package exerciciobanco;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ExercicioBanco {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        
        JOptionPane.showMessageDialog(null, "Banco ETEC MCM\n"
         + "A Seguir preencha seus dados");
        //DADOS LOGIN--> NUMCONTA: 1, AGENCIA: 4321, SENHA: senha123
        conta.setAgencia(Integer.parseInt(JOptionPane.showInputDialog("DIGITE SUA AGÊNCIA")));
        conta.setNumConta(Integer.parseInt(JOptionPane.showInputDialog("DIGITE SUA CONTA")));        
        conta.setSenha((JOptionPane.showInputDialog("DIGITE SUA SENHA")));
 
        conta.logar(conta.getNumConta(), conta.getAgencia(),  conta.getSenha());
        
        
        
    }
    
}
