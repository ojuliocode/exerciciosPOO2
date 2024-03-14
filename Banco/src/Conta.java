public class Conta {
    private double saldo;
    private double limite;

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", limite=" + limite +
                '}';
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

    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }
}
