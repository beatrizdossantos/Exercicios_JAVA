package exemplo06;

import java.util.Scanner;

public class Exemplo06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Digite 1 ou 2 :");
        num = entrada.nextInt();
        
        switch(num){
            case 1:
                 System.out.println("Você digitou UM");
                break;
            case 2:
                 System.out.println("Você digitou DOIS");
                break;
            default:
                 System.out.println("Você digitou um NÚMERO INVÁLIDO");    
        }
    }
    
}
