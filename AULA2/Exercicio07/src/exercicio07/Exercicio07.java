package exercicio07;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        int num;
                
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro maior que 0: ");
        num = dados.nextInt();
            
        if (num<1) {
            System.out.println("NÚMERO INVÁLIDO!");
        }   else{
                   while (num>=0)  {
                        System.out.println(num);  
                        num--;
                    }
            }
        
        
    }
    
}
