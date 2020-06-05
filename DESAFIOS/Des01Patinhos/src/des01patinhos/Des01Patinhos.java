package des01patinhos;

import javax.swing.JOptionPane;

public class Des01Patinhos {
    public static void main(String[] args) {
        int patinhosI = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantos Patinhos foram passear?"));
        int patinhos=patinhosI;
        
        if(patinhosI<=0){
           System.out.println("NÚMERO DE PATINHOS É INVÁLIDO!");
        }
        
        while(patinhos>0){
           System.out.println(patinhos +" patinhos foram passear");
           System.out.println("Além das montanhas");
           System.out.println("Para brincar");
           System.out.println("A mamãe gritou: Quá, quá, quá, quá");
           patinhos--;
           System.out.println("Mas só " + patinhos + " patinhos voltaram de lá. \n");
        }
        
         while(patinhos<patinhosI){
           System.out.println("A mamãe patinha foi procurar");
           System.out.println("Além das montanhas");
           System.out.println("Na beira do mar");
           System.out.println("A mamãe gritou: Quá, quá, quá, quá");
           patinhos++;
           System.out.println("E os " + patinhos + " patinhos voltaram de lá \n");
        }
        
    }
    
}
