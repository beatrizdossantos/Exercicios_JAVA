package ex01calculadora;

import java.util.Scanner;

public class Ex01Calculadora {
    public static void main(String[] args) {
       Scanner num = new Scanner (System.in);
       System.out.println("DIGITE 1 PARA ADIÇÃO; 2 PARA SUBTRAÇÃO; 3 PARA MULTIPLICAÇÃO; 4 PARA DIVISÃO E 5 PARA EXPONENCIAÇÃO");
       int opcao = num.nextInt();
       
       switch (opcao) {
           case 1 :
               somar();
               break;
               
           case 2 :
               subtrair();
               break;   
               
           case 3 :
               multiplicar();
               break; 
               
           case 4 :
               dividir();
               break; 
           
           case 5 :
               elevar();
               break;
               
           default: 
               System.out.println("OPÇÃO INVÁLIDA!!");
               break;
               
       }
       
    }

    private static void somar() {
       Scanner num1 = new Scanner (System.in);
       System.out.println("INSIRA O 1° NÚMERO");
       double n1 = num1.nextDouble();
       
       Scanner num2 = new Scanner (System.in);
       System.out.println("INSIRA O 2° NÚMERO");
       double n2 = num2.nextDouble();
       
       double soma = n1+n2;
       System.out.println("A SOMA DE "+ n1 + " e de " + n2 +" é:" + soma);
       
    }

    private static void subtrair() {
       Scanner num1 = new Scanner (System.in);
       System.out.println("INSIRA O 1° NÚMERO");
       double n1 = num1.nextDouble();
       
       Scanner num2 = new Scanner (System.in);
       System.out.println("INSIRA O 2° NÚMERO");
       double n2 = num2.nextDouble();
       
       double sub = n1-n2;
       System.out.println("A SUBTRAÇÃO DE "+ n1 + " e de " + n2 +" é:" + sub); 
    }

    private static void multiplicar() {
       Scanner num1 = new Scanner (System.in);
       System.out.println("INSIRA O 1° NÚMERO");
       double n1 = num1.nextDouble();
       
       Scanner num2 = new Scanner (System.in);
       System.out.println("INSIRA O 2° NÚMERO");
       double n2 = num2.nextDouble();
       
       double multi = n1*n2;
       System.out.println("A MULTIPLICAÇÃO DE "+ n1 + " e de " + n2 +" é:" + multi);
    }

    private static void dividir() {
       Scanner num1 = new Scanner (System.in);
       System.out.println("INSIRA O 1° NÚMERO");
       double n1 = num1.nextDouble();
       
       Scanner num2 = new Scanner (System.in);
       System.out.println("INSIRA O 2° NÚMERO");
       double n2 = num2.nextDouble();
       
       double div = n1/n2;
       System.out.println("A MULTIPLICAÇÃO DE "+ n1 + " e de " + n2 +" é:" + div);
    }

    private static void elevar() {
        Scanner num1 = new Scanner (System.in);
       System.out.println("INSIRA O 1° NÚMERO");
       double n1 = num1.nextDouble();
       
       Scanner num2 = new Scanner (System.in);
       System.out.println("INSIRA O 2° NÚMERO");
       double n2 = num2.nextDouble();
       
       double expo = Math.pow(n1, n2);
       System.out.println("O NÚMERO "+ n1 + " ELEVADO POR " + n2 +" RESULTA EM: " + expo);
    }
    
}
