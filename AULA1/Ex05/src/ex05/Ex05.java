/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex05;

/**
 *
 * @author Alunos
 */
public class Ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int bia=0;
       // for(int bia=0; bia<5; bia++){
        while (bia<5){
             int danone = 1;
             int cont=0;
            while (danone<6){
                while (cont != danone){
                System.out.print("*");
                cont++;
                }
                System.out.println(" ");
                cont=0;
                danone++;
            }
            bia ++;
        }
    }
}
        
