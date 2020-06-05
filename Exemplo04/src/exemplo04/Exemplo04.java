package exemplo04;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        int anoNasc,idade;
        
        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();
        
        System.out.println("Digite seu ano de nascimento :");
        anoNasc = entrada.nextInt();
        
        idade = 2020 - anoNasc;
        System.out.println ("Olá " + nome + " você tem: " + idade + " anos");
        
        
    }
    
}
