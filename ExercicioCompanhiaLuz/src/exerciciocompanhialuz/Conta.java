package exerciciocompanhialuz;

import javax.swing.JOptionPane;

public class Conta {
    

    //ATRIBUTOS(Dados)
        public double leituraAtual;
        public double leituraAnterior;
        private double valor;
        private double sub;
        private double valorFinal;
        
    //GETTER E SETTER
    public double getLeituraAtual() {
        return leituraAtual; 
    }

    public void setLeituraAtual(double leituraAtual) {
        this.leituraAtual = leituraAtual;
    }

    public double getLeituraAnterior() {
        return leituraAnterior;
    }

    public void setLeituraAnterior(double leituraAnterior) {
        this.leituraAnterior = leituraAnterior;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public double getValorFinal() {
        return valorFinal;
    }
    
    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }
    
    //MÉTODOS (OPERAÇÕES)
        public void calculo_sem_bandeira(double leituraAtual,double leituraAnterior) {
        this.sub = leituraAtual - leituraAnterior;  
        //calcular a taxa TUSD
        double v1 = this.sub*0.30;
        //calcular a taxa TE
        double v2 = this.sub*0.29;
        //somar as taxas
        double v3 = v1+v2;
        //calcular a taxa ICMS
        this.valor = (v3*0.25)+v3;
        verificar_bandeira(this.sub);
    }
       
    public void verificar_bandeira(double sub) {
        if (sub<=100) {
            JOptionPane.showMessageDialog(null,"VOCÊ ESTÁ NA BANDEIRA VERDE");
            calculo_verde(this.valor);
        }
        
        if (sub>=101 && sub<=150) {
            JOptionPane.showMessageDialog(null,"VOCÊ ESTÁ NA BANDEIRA AMARELA");
            calculo_amarelo(this.valor);
        }
        
        if (sub>150 && sub<=200) {
            JOptionPane.showMessageDialog(null,"VOCÊ ESTÁ NA BANDEIRA VERMELHA PATAMAR 1");
            calculo_vermelho1(this.valor);
        }
        
        if (sub>200) {
            JOptionPane.showMessageDialog(null,"VOCÊ ESTÁ NA BANDEIRA VERMELHA PATAMAR 2");
            calculo_vermelho2(this.valor);
        }
            
    }
       
       
    public void calculo_verde(double valor) {
        valorFinal = valor;
        JOptionPane.showMessageDialog(null,"Valor a pagar: " + valorFinal);
    }

    public void calculo_amarelo(double valor) {
        double v1 = (sub*0.013); //CÁLCULO ACRÉSCIMO
        double v2 = (v1*0.25)+v1; //CÁLCULO ICMS
        valorFinal = valor+v2;
        JOptionPane.showMessageDialog(null,"Valor a pagar: " + valorFinal);
    }

    public void calculo_vermelho1(double valor) {
        double v1 = (sub*0.042); //CÁLCULO ACRÉSCIMO
        double v2 = (v1*0.25)+v1; //CÁLCULO ICMS
        valorFinal = valor+v2;
        JOptionPane.showMessageDialog(null,"Valor a pagar: " + valorFinal);
    }

    public void calculo_vermelho2(double valor) {
        double v1 = (sub*0.062); //CÁLCULO ACRÉSCIMO
        double v2 = (v1*0.25)+v1; //CÁLCULO ICMS
        valorFinal = valor+v2;
        JOptionPane.showMessageDialog(null,"Valor a pagar: " + valorFinal);
    }
}
