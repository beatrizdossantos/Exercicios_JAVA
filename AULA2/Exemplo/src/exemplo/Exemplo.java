package exemplo;

import java.util.Scanner;

public class Exemplo {

    public static void main(String[] args) {
        int numero;
        String nome;
        
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Digite o nome: ");
        nome = dados.nextLine();
        
        
        System.out.println("Digite o número: ");
        numero = dados.nextInt();
        
        System.out.println("Nome: " + nome);
        System.out.println("Número: " + numero);
        
    }
    
}
