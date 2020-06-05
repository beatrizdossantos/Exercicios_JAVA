/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex04;

/**
 *
 * @author Alunos
 */
public class Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int maca = 1;
        while (maca<101){
            if (maca%4==0){
                System.out.println("PIN");
                
            }
            else{
                System.out.println(maca);
            }
            maca++;
        }
    }
    
}
