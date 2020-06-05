package ex02c;

import javax.swing.JOptionPane;

public class Ex02c {
    public static void main(String[] args) {
        double nota1, nota2, nota3, nota4, media;
        nota1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira a primeira nota do aluno"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira a segunda nota do aluno"));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira a terceira nota do aluno"));
        nota4 = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira a quarta nota do aluno"));
       
        media =(nota1+nota2+nota3+nota4)/4;
         if(media>=5) {
            JOptionPane.showMessageDialog(null,"Este aluno foi APROVADO, a sua média foi: "+ media);
         } else {
            JOptionPane.showMessageDialog(null,"Este aluno foi REPROVADO, a sua média foi: "+ media); 
         }
         }
    }
    
