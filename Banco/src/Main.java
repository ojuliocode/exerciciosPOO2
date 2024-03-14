public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Maicon Kuster", "455345", new Conta(100, 2000));
        Cliente cliente2 = new Cliente("Kotaka", "455345", new Conta(100, 2000));

        cliente.comprarComCredito(120);
        cliente.comprarComCredito(2000000);
        cliente.depositarDinheiro(1200);
        cliente.sacarDinheiro(10);

        System.out.println(cliente2.toString());

        cliente.transferir(cliente2.getConta(),12);

        System.out.println(cliente2.toString());

    }
}