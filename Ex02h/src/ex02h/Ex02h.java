package ex02h;

import javax.swing.JOptionPane;

public class Ex02h {
    public static void main(String[] args) {
        int v1, v2, v3, v4, v5, maior, menor;
        v1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o primeiro valor"));
        v2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o segundo valor"));
        v3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o terceiro valor"));
        v4 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o quarto valor"));
        v5 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o quinto valor"));
        maior = -1000000000;
        menor = 1000000000;
        
        if (v1>maior) { 
           maior=v1;
        } if (v2>maior) { 
           maior=v2;
        }if (v3>maior) { 
           maior=v3;
        } if (v4>maior) { 
           maior=v4;
        } if (v5>maior) { 
           maior=v5;
        }
        
        if (v1<menor) { 
           menor=v1;
        } if (v2<menor) { 
           menor=v2;
        }if (v3<menor) { 
           menor=v3;
        } if (v4<menor) { 
           menor=v4;
        } if (v5<menor) { 
           menor=v5;
        }
        
        JOptionPane.showMessageDialog(null,"O MAIOR VALOR INSERIDO FOI: " + maior);
        JOptionPane.showMessageDialog(null,"O MENOR VALOR INSERIDO FOI: " + menor);
    }
    
}
