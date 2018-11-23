package banco;

public class Conta {
    private double saldo;
    String usuario, senha;
    
    public void depositar(double valor){
        this.saldo = this.saldo + valor;
        System.out.println("Saldo atual: " + this.saldo);
    }
    
    public void sacar(double valor){
        if(this.saldo > valor){
            this.saldo = this.saldo - valor;
            System.out.println("Operação realizada com sucesso!");
        }
    }
    
    public double visualizar(){
        return this.saldo;
    }
}
