import java.sql.SQLOutput;

public class Cliente {
    private String nome;
    private String cpf;
    private Conta conta;

    public boolean sacarDinheiro(double valor){
        System.out.println("Saldo antes do saque >> " + this.conta.getSaldo());
        double currentSaldo = this.conta.getSaldo();
        if(valor > currentSaldo) {
            System.out.println("Tentando sacar muito dinheiro");
            return false;
        }

        this.conta.setSaldo(currentSaldo - valor);
        System.out.println("Saldo apos o saque >> " + this.conta.getSaldo());

        return true;
    }

    public void depositarDinheiro(double valor){
        System.out.println("SAldo antes do deposito >> : " + this.conta.getSaldo());
        double currentSaldo = this.conta.getSaldo();
        this.conta.setSaldo(valor + currentSaldo);
        System.out.println("Saldo apos o deposito >> " + this.conta.getSaldo());
    }

    public boolean comprarComCredito(double valor){
        System.out.println("Saldo e limite antes da compra >> " + this.conta.getSaldo());
        System.out.println(" >> " + this.conta.getLimite());

        if(this.conta.getSaldo() + this.conta.getLimite() > valor){
            if(this.conta.getLimite() >= valor)
                this.conta.setLimite(this.conta.getLimite() - valor);
            else{
                this.conta.setLimite(0);
                // Se acabou o limite, pegar do saldo
                double valorATirarDoSaldo = valor - this.conta.getSaldo();
                this.conta.setSaldo(this.conta.getSaldo() - valorATirarDoSaldo);
            }
            double saldoELimite = this.conta.getSaldo() + this.conta.getLimite();
            System.out.println("Saldo e limite após da compra >> " + this.conta.getSaldo());
            System.out.println(" >> " + this.conta.getLimite());
            return true;
        }
        else {
            System.out.println("Não ha limite");
        }
        return false;
    }

    public boolean transferir(Conta contaParaReceber, double valor){
        if(this.conta.getSaldo() < valor){
            System.out.println("Saldo insuficiente");
            return false;
        }
        this.conta.setSaldo(this.conta.getSaldo() - valor);
        contaParaReceber.setSaldo(contaParaReceber.getSaldo() + valor);
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", conta=" + conta +
                '}';
    }



    public Cliente(String nome, String cpf, Conta conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.conta = conta;
    }

    public Conta getConta() {
        return conta;
    }

}
