package exercicio05;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        int num;
                
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro: ");
        num = dados.nextInt();
        
        int ant = num-1;
        int suc = num+1;
        
        System.out.println("O Antecessor é " + ant);
        System.out.println("O Sucessor é " + suc);
    }
    
}
