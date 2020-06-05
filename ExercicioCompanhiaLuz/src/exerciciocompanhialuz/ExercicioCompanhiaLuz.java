package exerciciocompanhialuz;

import javax.swing.JOptionPane;

public class ExercicioCompanhiaLuz {
    public static void main(String[] args) {
      Conta contaLuz = new Conta();
      
      double l1 = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR DA LEITURA ANTERIOR"));
      int l2 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O VALOR DA LEITURA ATUAL"));
      
      contaLuz.calculo_sem_bandeira(l2,l1);
    }
    
}
