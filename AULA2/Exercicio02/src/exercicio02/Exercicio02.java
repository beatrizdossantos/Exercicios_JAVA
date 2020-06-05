package exercicio02;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        double saldo;
                
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Digite o saldo inicial: ");
        saldo = dados.nextDouble();
        
        double saldoR = (saldo*0.01)+saldo;
        
        System.out.println("O saldo com reajuste é: " + saldoR);
    }
    
}
