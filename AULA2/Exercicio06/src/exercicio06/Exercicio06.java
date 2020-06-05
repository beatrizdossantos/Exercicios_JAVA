package exercicio06;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        int nota;
                
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Digite uma nota de 0 a 10: ");
        nota= dados.nextInt();
        
        if (nota<0 || nota>10){
            System.out.println("Nota Inválida!");
        }else{
            if(nota>=6){
            System.out.println("APROVADO");   
                }  else{
                        if(nota<6 && nota>=4){
                            System.out.println("RECUPERAÇÃO");
                }  else{
                            System.out.println("REPROVADO");
                        }
                }  
                }
    }
    
}
