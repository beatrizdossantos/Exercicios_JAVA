package ex02;

import java.util.Scanner;

public class Ex02 {
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
               somar(num1,num2);
               break;
               
           case 2 :
               subtrair(num1,num2);
               break;   
               
           case 3 :
               multiplicar(num1,num2);
               break; 
               
           case 4 :
               dividir(num1,num2);
               break; 
           
           case 5 :
               elevar(num1,num2);
               break;
               
           default: 
               System.out.println("OPÇÃO INVÁLIDA!!");
               break;
               
       }
       
    }

    private static void somar(double n1, double n2) {
       double soma = n1+n2;
       System.out.println("A SOMA DE "+ n1 + " e de " + n2 +" é:" + soma);
       
    }

    private static void subtrair(double n1, double n2) {
        double sub = n1-n2;
        System.out.println("A SUBTRAÇÃO DE "+ n1 + " e de " + n2 +" é:" + sub); 
    }

    private static void multiplicar(double n1, double n2) {
       double multi = n1*n2;
       System.out.println("A MULTIPLICAÇÃO DE "+ n1 + " e de " + n2 +" é:" + multi);
    }

    private static void dividir(double n1, double n2) {
       double div = n1/n2;
       System.out.println("A MULTIPLICAÇÃO DE "+ n1 + " e de " + n2 +" é:" + div);
    }

    private static void elevar(double n1, double n2) {
       double expo = Math.pow(n1, n2);
       System.out.println("O NÚMERO "+ n1 + " ELEVADO POR " + n2 +" RESULTA EM: " + expo);
    }
 }
    

