package ex03;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner numero1 = new Scanner (System.in);
       System.out.println("INSIRA O 1° NÚMERO");
       double num1 = numero1.nextDouble();
       
       Scanner numero2 = new Scanner (System.in);
       System.out.println("INSIRA O 2° NÚMERO");
       double num2 = numero2.nextDouble();
        
        Scanner num = new Scanner (System.in);
        System.out.println("DIGITE 1 PARA ADIÇÃO; 2 PARA SUBTRAÇÃO; 3 PARA MULTIPLICAÇÃO; 4 PARA DIVISÃO E 5 PARA EXPONENCIAÇÃO");
        int opcao = num.nextInt();
       
       switch (opcao) {
           case 1 :
               System.out.println("A SOMA DE "+ num1 + " e de " + num2 +" é:" + somar(num1,num2));
               break;
               
           case 2 :
               System.out.println("A SUBTRAÇÃO DE "+ num1 + " e de " + num2 +" é:" + subtrair(num1,num2));
               break;   
               
           case 3 :
               System.out.println("A MULTIPLICAÇÃO DE "+ num1 + " e de " + num2 +" é:" + multiplicar(num1,num2));
               break; 
               
           case 4 :
               System.out.println("A DIVISÃO DE "+ num1 + " e de " + num2 +" é:" + dividir(num1,num2));
               break; 
           
           case 5 :
               System.out.println("O NÚMERO "+ num1 + " ELEVADO POR " + num2 +" RESULTA EM: " + elevar(num1,num2));
               break;
               
           default: 
               System.out.println("OPÇÃO INVÁLIDA!!");
               break;
               
       }
       
    }

    private static double somar(double n1, double n2) {
       return(n1+n2);
    }

    private static double subtrair(double n1, double n2) {
        return(n1-n2); 
    }

    private static double multiplicar(double n1, double n2) {
        return(n1*n2);
    }

    private static double dividir(double n1, double n2) {
       return(n1/n2);
    }

    private static double elevar(double n1, double n2) {
        return(Math.pow(n1, n2));
    }
    }
    

