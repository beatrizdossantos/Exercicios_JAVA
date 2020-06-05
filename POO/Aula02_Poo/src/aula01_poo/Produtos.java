package aula01_poo;
public class Produtos {
    //CRIAR ENCAPSULAMENTOS - PROTEGER OS ATRIBUTOS
    //public,private,protected
    private int cod;
    private String nome;
    private double preco;
    private int estoque;

    public void retiradaEstoque(int qtde){
        if (qtde>this.estoque) {
            System.out.println("QUANT INSUFICIENTE EM ESTOQUE!");
        }
        else{
            this.estoque = this.estoque - qtde;
        }
    }
    
    
    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    
    //precisamos criar o "operador do caixa"
    
    //métodos - semana que vem

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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void aumentoPreco(double perc){ 
        //preco = preco + preco * perc/100
        this.preco = this.preco + (this.preco * perc/100);
        
    }
    
    
    
    
}
