package exercicio04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        float sMin;
        float seuS;
        
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Digite o salário mínimo: ");
        sMin = dados.nextFloat();
        
        System.out.println("Digite o seu salário: ");
        seuS = dados.nextFloat();
        
        float qtdeS = seuS/sMin;
        
        System.out.println("Você ganha: " + qtdeS + " Salários Mínimos");

    }
    
}
