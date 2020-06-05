package exerciciobanco;

import javax.swing.JOptionPane;

class ContaBancaria {
    //ATRIBUTOS(Dados)
        public int numConta;
        public int agencia;
        public String nomeCliente;
        private boolean logado = false;
        private String senha;
        private double saldo;
        private double limite;
    
    //MÉTODOS(Operações)
    //GETTERS E SETTERS
    public int getNumConta() {
      return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public boolean isLogado() {
        return logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }
    
    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    //OUTROS MÉTODOS
        public boolean logar(int numConta, int agencia, String senha){
            if (agencia==4321 && numConta==1 && "senha123".equals(senha)) {
                this.logado = true;
                //System.out.println("Valor da variável logado " + this.isLogado());
                opcao(this.logado);
            } else {
                this.logado = false;
                JOptionPane.showMessageDialog(null,"DADOS INCORRETOS! VOCÊ NÃO ESTÁ LOGADO");
            }  
            return this.logado;
        }
        
        public void opcao(boolean logado){
            if (logado == true) {
                int op;
                op = Integer.parseInt(JOptionPane.showInputDialog("O que você quer fazer?\n"        
                   + "1 -> DEPÓSITO\n"
                   + "2 -> SAQUE\n"
                   + "3 -> VERIFICAR SALDO\n"
                   + "4 -> SAIR"));
                
                switch (op) {
                case 1:
                    deposito(Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR QUE QUER DEPOSITAR")), this.logado);
                    break;

                case 2:
                    saque(Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR QUE QUER SACAR")), this.logado);
                    break;

                case 3:
                    verificar_saldo(this.logado);
                    break;
                    
                case 4:
                    JOptionPane.showMessageDialog(null, "OBRIGADO!\n"
                    + "VOLTE SEMPRE!");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "NÃO HÁ ESSA OPÇÃO!");    
            }
        }
        }
        
        
        public void deposito(double depo, boolean logado){
            this.saldo = this.saldo + depo;
            String op;
            op = JOptionPane.showInputDialog ("Deseja realizar outra operação\n"
                    + "S - sim\n"
                    + "N - não");
            switch (op) {
                case "S":
                    opcao(this.logado);
                    break;
                    
                case "N":
                    JOptionPane.showMessageDialog (null, "OBRIGADO! VOLTE SEMPRE");
                    System.exit(0); //--> para encerrar o sistema
                    break;
                
                default:
                    JOptionPane.showMessageDialog (null, "OPÇÃO INVÁLIDA!");
            }
                
        }
        
        public void saque(double saq, boolean logado){
            if (saq<=this.saldo) {
                saldo = saldo - saq;  
            } else {
                JOptionPane.showMessageDialog(null,"SALDO INSUFICIENTE PARA SACAR!");
            }  
            
            JOptionPane.showMessageDialog(null, "O seu saldo atual é de R$" + getSaldo());
            String op;
            op = JOptionPane.showInputDialog ("Deseja realizar outra operação\n"
                    + "S - sim\n"
                    + "N - não");
            switch (op) {
                case "S":
                    opcao(this.logado);
                    break;
                    
                case "N":
                    JOptionPane.showMessageDialog (null, "OBRIGADO! VOLTE SEMPRE");
                    System.exit(0); //--> para encerrar o sistema
                    break;
                
                default:
                    JOptionPane.showMessageDialog (null, "OPÇÃO INVÁLIDA!");
            }
        }
        
        public void verificar_saldo(boolean logado) {
            JOptionPane.showMessageDialog(null, "O seu saldo atual é de R$" + getSaldo());
            String op;
            op = JOptionPane.showInputDialog ("Deseja realizar outra operação\n"
                    + "S - sim\n"
                    + "N - não");
            switch (op) {
                case "S":
                    opcao(this.logado);
                    break;
                    
                case "N":
                    JOptionPane.showMessageDialog (null, "OBRIGADO! VOLTE SEMPRE");
                    System.exit(0); //--> para encerrar o sistema
                    break;
                
                default:
                    JOptionPane.showMessageDialog (null, "OPÇÃO INVÁLIDA!");
            }

        }
}
