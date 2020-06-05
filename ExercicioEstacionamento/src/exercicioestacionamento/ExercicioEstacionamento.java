package exercicioestacionamento;

import java.time.LocalTime;
import javax.swing.JOptionPane;

public class ExercicioEstacionamento {
    public static void main(String[] args) {
      Carro car = new Carro();
       
      //CADASTRO
      String corCarro = JOptionPane.showInputDialog("DIGITE A COR DO CARRO");
      String placaCarro = JOptionPane.showInputDialog("DIGITE A PLACA DO CARRO");
      String marcaCarro = JOptionPane.showInputDialog("DIGITE A MARCA DO CARRO");
      String modeloCarro = JOptionPane.showInputDialog("DIGITE O MODELO DO CARRO");
 
      car.cadastrarCarro(corCarro, placaCarro, marcaCarro, modeloCarro);
      
      //MOSTRAR
      car.mostrarCarro(corCarro, placaCarro, marcaCarro, modeloCarro);
      
      
      //REGISTRAR ENTRADA
      int horaE = Integer.parseInt(JOptionPane.showInputDialog("DIGITE A HORA DE ENTRADA"));
      int minE = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O MINUTO DE ENTRADA"));
      car.registrarEntrada(horaE, minE);
      
      //REGISTRAR SAÍDA
      int horaS = Integer.parseInt(JOptionPane.showInputDialog("DIGITE A HORA DE SAÍDA"));
      int minS = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O MINUTO DE SAÍDA"));
      car.registrarSaida(horaS, minS);
      
      //CALCULAR PREÇO
      car.calcularPreco(horaE, minE, horaS, minS);

    }

    
}
