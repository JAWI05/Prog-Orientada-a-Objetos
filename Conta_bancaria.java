public class Conta_bancaria {
    private String numero_da_conta;
    private double Saldo;

    public Conta_bancaria(String numero_da_conta, double saldo) {
        this.numero_da_conta = numero_da_conta;
        Saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta_bancaria{" +
                "numero_da_conta='" + numero_da_conta + '\'' +
                ", Saldo=" + Saldo +
                '}';
    }

    public String getNumero_da_conta() {
        return numero_da_conta;
    }

    public void setNumero_da_conta(String numero_da_conta) {
        this.numero_da_conta = numero_da_conta;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    public void depositar(double valor){
        Saldo = Saldo + valor;
    }
}