package aulapoo01;
public class Produtos {

    //ENCAPSULAMENTO
    //criar os atriutos (variáveis)
    
    private int cod;
    private String nome;
    private double preço;
    private int estoque;
    
    //private: só métodos dentro da classe conseguem acessar o produto
    //protect: só as classes do mesmo pacote conseguem acessar o produto
    
    //o "operador de caixa" precisa ser criado:
    //MÉTODOS
    //getter ("pega o valor") e setter ("colocar/seta o valor")
     public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public int getEstoque() {
        return estoque;
    }
    
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
   
    public void retirada(int qtde){
        if (qtde>this.estoque) {
            System.out.println("QUANTIDADE INSUFICIENTE NO ESTOQUE!!");
        } else {
            this.estoque = this.estoque - qtde;
            System.out.println("Estoque Atual; " + this.estoque);
        }
    }
    
}
