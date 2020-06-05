package exercicioestacionamento;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class Carro {
    //ATRIBUTOS(Dados)
        public String cor;
        public String placa;
        public String marca;
        public String modelo; 
        private int HoraEntrada;
        private int MinEntrada;
        private int HoraSaida;
        private int MinSaida;
        private int horas;
        private int min;
        private double preco;
        
    //GETTER E SETTER

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getHoraEntrada() {
        return HoraEntrada;
    }

    public void setHoraEntrada(int Horaentrada) {
        this.HoraEntrada = Horaentrada;
    }

    public int getMinEntrada() {
        return MinEntrada;
    }

    public void setMinEntrada(int MinEntrada) {
        this.MinEntrada = MinEntrada;
    }

    public int getHoraSaida() {
        return HoraSaida;
    }

    public void setHoraSaida(int HoraSaida) {
        this.HoraSaida = HoraSaida;
    }

    public int getMinSaida() {
        return MinSaida;
    }

    public void setMinSaida(int MinSaida) {
        this.MinSaida = MinSaida;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

   
    //MÉTODOS(Operações)
        public void cadastrarCarro(String cor, String placa, String marca, String modelo){
            setCor(cor);
            setPlaca(placa);
            setMarca(marca);
            setModelo(modelo);
        }
        
        public void mostrarCarro(String cor, String placa, String marca, String modelo){
            JOptionPane.showMessageDialog(null,"A COR DO CARRO É: " + getCor() + "\n" +
            "A PLACA DO CARRO É: " + getPlaca() + "\n" +
            "A MARCA DO CARRO É: " + getMarca() + "\n" +
            "A MODELO DO CARRO É: " + getModelo() + "\n");
        }
        
        public void registrarEntrada(int auxH, int auxM){ 
            if (auxH<=24 && auxH>0){
               setHoraEntrada(auxH);
           } else {
               JOptionPane.showMessageDialog(null,"HORA INVÁLIDA");
               System.exit(0);
           }
           
           if (auxM<60 && auxM>=0){
               setMinEntrada(auxM);
           } else {
               JOptionPane.showMessageDialog(null,"MINUTO INVÁLIDO");
               System.exit(0);
           }  
        }
        
        
        public void registrarSaida(int auxH, int auxM){
            if (auxH<=24 && auxH>0 && auxH>=HoraEntrada){
               setHoraSaida(auxH);
           } else {
               JOptionPane.showMessageDialog(null,"HORA INVÁLIDA");
               System.exit(0);
           }
           
           if (auxM<60 && auxM>=0){
               setMinSaida(auxM);
           } else {
               JOptionPane.showMessageDialog(null,"MINUTO INVÁLIDO");
               System.exit(0);
           }  
        }
        
        public void calcularPreco(int HoraEntrada, int MinEntrada, int HoraSaida, int MinSaida){
           horas = HoraSaida - HoraEntrada;
           min = MinSaida - MinEntrada;
            if(min>0) {
              horas = horas+1;  
            }
          preco = horas*4;
          JOptionPane.showMessageDialog(null,"O VALOR A PAGAR É: " + preco);
        }
}
