package atividade;

public class ContaCorrente extends Conta{
    private double limite = 0;
      @Override
    public double decSaldo(double valor){
        if(limite>valor){
            limite = limite - valor;
            return limite;
        }else{
            return limite;
        }
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
  
}
