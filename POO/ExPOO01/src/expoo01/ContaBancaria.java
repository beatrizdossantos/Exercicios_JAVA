package expoo01;
public class ContaBancaria {
    //ATRIBUTOS(Dados)
        private int numConta;
        private String nomeCliente;
        private double saldo;
    
    //MÉTODOS(Operações)
        //GETTER E SETTER
        public int getNumConta() {
            return numConta;
        }

        public void setNumConta(int numConta) {
            this.numConta = numConta;
        }

        public String getNomeCliente() {
            return nomeCliente;
        }

        public void setNomeCliente(String nomeCliente) {
            this.nomeCliente = nomeCliente;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
                this.saldo = saldo;
            }

        //OUTRAS OPERAÇÕES
        public void deposito(double depo){
            saldo = saldo + depo;
        }
        
        public void saque(double saq){
            saldo = saldo - saq;
        }
        
        public void verificar_saldo() {
            System.out.println("O seu saldo atual é " + this.saldo);
        }
}
