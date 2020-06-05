package exemplo05;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Digite um número :");
        num = entrada.nextInt();
        
        if (num %2 == 0){
          System.out.println("O número " + num + " é par!");  
        } else {
          System.out.println("O número " + num + " é impar!");
        }
        
    }
    
}
