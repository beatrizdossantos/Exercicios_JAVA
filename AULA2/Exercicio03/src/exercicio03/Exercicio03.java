package exercicio03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        float ipi;
        
        int cod1;
        int qtde1;
        float valor1;
        
        int cod2;
        int qtde2;
        float valor2;
        
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Digite a percentagem do IPI: ");
        ipi = dados.nextFloat();
        
        System.out.println("Digite o código da peça 1: ");
        cod1 = dados.nextInt();
        
        System.out.println("Digite a quantidade de peças 1: ");
        qtde1 = dados.nextInt();
        
        System.out.println("Digite o valor unitário da peça 1: ");
        valor1 = dados.nextFloat();
        
        
        System.out.println("Digite o código da peça 2: ");
        cod2 = dados.nextInt();
        
        System.out.println("Digite a quantidade de peças 2: ");
        qtde2 = dados.nextInt();
        
        System.out.println("Digite o valor unitário da peça 2: ");
        valor2 = dados.nextFloat();
        
        float valorTotal = (valor1*qtde1 + valor2*qtde2)*(ipi/100+1);
        
        System.out.println("O valot total a ser pago é: " + valorTotal);
    }
    
}
