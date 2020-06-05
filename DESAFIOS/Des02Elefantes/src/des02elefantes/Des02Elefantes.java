package des02elefantes;

import javax.swing.JOptionPane;

public class Des02Elefantes {
    public static void main(String[] args) {
       int elefantesI = Integer.parseInt(JOptionPane.showInputDialog(null,"Entre com o número de Elefantes"));
       int elefantes=1;
       int cont=0;
        
       if(elefantesI<=0){
           System.out.println("NÚMERO DE ELEFANTES É INVÁLIDO!");
        }
        
        while(elefantes<=elefantesI){
           System.out.println(elefantes +" elefante incomoda muita gente....");
           System.out.println(elefantes +" elefante"); 
           while (cont<elefantes){
            System.out.println("incomoda");
            cont++;
           }
           System.out.println("muito mais. \n");
           elefantes++;
           cont = 0;
        }
        
    }
    
}
