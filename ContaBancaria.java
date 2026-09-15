class Conta {
    private String titular;
    private int numero;
    private double saldo;

    public Conta(String titular, int numero){
        this.titular = titular;
        this.numero = numero;
        this.saldo = 1000;
    }
    public String getTitular(){
        return titular;
    }
    public double getSaldo(){
        return saldo;
    }
    public int getNumero(){
        return numero;
    }
    public void exibirDados(){
        System.out.println("Titular: %s" + getTitular()
         + " | Numero da conta:" + getNumero()
          + " | Saldo atual:" + getSaldo());
    }
    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
            System.out.println("Deposito no valor de : R$ " + valor + " realizado com sucesso");
            System.out.println("Saldo atual: R$ " + getSaldo());
        } else {
            System.out.println("O valor do deposito deve ser maior que 0");
        } 
    }
    public void sacar(double valor){
        if (valor <= saldo && valor > 0){
            this.saldo -= valor;
            System.out.println("Saque no valor de: R$ " + valor + " realizado com sucesso");
            System.out.println("Saldo atual: R$ " + getSaldo());
        } else {
            System.out.println("O valor do saque não pode exceder o saldo em conta e não pode ser negativo");
            System.out.println("Saldo atual: R$ " + getSaldo());
        }
    }
}
public class ContaBancaria {
    public static void main(String[] args){

        Conta c1 = new Conta("Lorena", 1234);
            System.out.println(c1.getSaldo());
            c1.depositar(500);
            c1.sacar(200);
            c1.sacar(2000);
            c1.depositar(-100);
            c1.exibirDados();
    }
}