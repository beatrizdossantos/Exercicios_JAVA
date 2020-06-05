package aula01_poo;

public class Aula01_Poo {

    public static void main(String[] args) {
        
        Produtos lapis = new Produtos();
        //lapis.cod = 1025;
        //lapis.nome = "Lapis HB";
        //lapis.preco = 5.21;
        
        lapis.setCod(1025);
        lapis.setNome("Lapis HB");
        lapis.setPreco(10);
        lapis.setEstoque(50);
                
        System.out.println("INFORMAÇÕES DO OBJETO LAPIS");
        //System.out.println("Cod = " + lapis.cod);
        System.out.println("Cod = " + lapis.getCod());
        System.out.println("Nome = " + lapis.getNome());
        System.out.println("Preço = " + lapis.getPreco());
        System.out.println("Estoque = " + lapis.getEstoque());
        
        System.out.println("Aumento de 30% no preço");
        lapis.aumentoPreco(30);
        System.out.println("Preço = " + lapis.getPreco());
        
        System.out.println("EFETUANDO UMA RETIRADA DO ESTOQUE");
        lapis.retiradaEstoque(40);
        System.out.println("Estoque = " + lapis.getEstoque());
        
        
    }
    
}
