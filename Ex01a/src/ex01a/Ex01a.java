package ex01a;

import javax.swing.JOptionPane;

public class Ex01a {
    public static void main(String[] args) {
        
        double tempo, veloM,dist,litros;
        tempo = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o tempo gasto"));
        veloM = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a velocidade média"));
        
        dist = tempo*veloM;
        
        litros = dist/12;
        
        JOptionPane.showMessageDialog(null,"Velocidade Média: "+ veloM + ", \n" +
            "Tempo Gasto: "+ tempo + ", \n" +
            "Distância: "+ dist + ", \n" +
            "Quantidade de litros: " + litros);
        
    }
    
}
