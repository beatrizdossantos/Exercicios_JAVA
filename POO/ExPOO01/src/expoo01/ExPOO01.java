package expoo01;

import java.util.Scanner;

public class ExPOO01 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        
        Scanner dados = new Scanner(System.in);
        System.out.println("Digite o seu nome");
        String nome = dados.nextLine();
        conta.setNomeCliente(nome);
        
        System.out.println("Digite o número da conta");
        int nConta = dados.nextInt();
        conta.setNumConta(nConta);
        
        conta.setSaldo(500);
        
        System.out.println("INFORMAÇÕES DA CONTA");
        System.out.println("Número da conta = " + conta.getNumConta());
        System.out.println("Nome do Cliente = " + conta.getNomeCliente());
        System.out.println("Saldo = " + conta.getSaldo());
        
        System.out.println("O que você quer fazer?");
        System.out.println("1-DEPÓSITO");
        System.out.println("2-SAQUE");
        System.out.println("3-VERIFICAR SALDO");
        int op = dados.nextInt();
        
        switch (op) {
        case 1:
            System.out.println("Digite o valor que você quer depositar");
            int valorDep = dados.nextInt();
            conta.deposito(valorDep);
            conta.verificar_saldo();
            break;
        
        case 2:
            System.out.println("Digite o valor que você quer sacar");
            int valorSaq = dados.nextInt();
            conta.saque(valorSaq);
            conta.verificar_saldo();
            break;
        
        case 3:
            conta.verificar_saldo();
            break;
    }
                
        
    }
    
}
