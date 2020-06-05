package aulapoo01;

import java.util.Scanner;

public class AulaPoo01 {
    public static void main(String[] args) {
        //PRIMEIRO ARQUIVO QUE É EXECUTADO, ELE CHAMA A CLASSE PRODUTO
        
        //Scanner objeto = new Scanner();
          Produtos lapis = new Produtos();
          //Lapis.cod = 1025;
          //Lapis.nome = "Lápis BIC";
          //Lapis.preço = 5.21;
          lapis.setCod(1025);
          lapis.setNome("Lápis HB");
          lapis.setPreço(5.00);
          lapis.setEstoque(100);
   
          System.out.println("INFORMAÇÕES DO OBJETO LÁPIS");
          //System.out.println("Cod = " + lapis.cod);
          //System.out.println("Nome = " + lapis.nome);
          //System.out.println("Preço = " + lapis.preço);
          //System.out.println("Preço = " + lapis.estoque);
          System.out.println("Cod = " + lapis.getCod());
          System.out.println("Preço = " + lapis.getPreço());
          System.out.println("Nome = " + lapis.getNome());
          System.out.println("Estoque = " + lapis.getEstoque());
          
          Produtos caneta = new Produtos();
          //caneta.cod = 2525;
          //caneta.nome = "Caneta BIC";
          //caneta.preço = 2.35;
          Scanner dados = new Scanner(System.in);
          System.out.println("Digite o código");
          int codigo = dados.nextInt();
          caneta.setCod(codigo);
          caneta.setNome("Caneta BIC");
          caneta.setPreço(5.00);
          caneta.setEstoque(200);
          
          System.out.println("INFORMAÇÕES DO OBJETO CANETA");
          //System.out.println("Cod = " + caneta.cod);
          //System.out.println("Nome = " + caneta.nome);
          //System.out.println("Preço = " + caneta.preço);
          //System.out.println("Preço = " + caneta.estoque);
          System.out.println("Cod = " + caneta.getCod());
          System.out.println("Preço = " + caneta.getPreço());
          System.out.println("Nome = " + caneta.getNome());
          System.out.println("Estoque = " + caneta.getEstoque());
          
          System.out.println("FAZENDO UMA RETIRADA NO ESTOQUE");
          int quantidade = dados.nextInt();
          lapis.retirada(quantidade);
    }
    
}
