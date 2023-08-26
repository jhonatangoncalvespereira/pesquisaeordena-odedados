package atividade;

public class Conta {
    private String numConta;
    private double saldo;

    public String getNumConta() {
        return numConta;
    }
    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double setSaldo(double valor){
        saldo =  saldo + valor;
        return saldo;
    }
    public double getSaldo(){
        return saldo;        
    }

    public double decSaldo(double valor){
        if(getSaldo()>0){     
            saldo = saldo - valor;
            return saldo;
        }else{
            return 0;
        }
    }


    public void transferir(double valor, String conta){
        if(getSaldo()>0){
            setSaldo(valor);
        }else{
            getSaldo();
        }
    }
}


