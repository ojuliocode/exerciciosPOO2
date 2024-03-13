public class Arma {
    private int dano;

    public int getDano() {
        return dano;
    }


    public int getCustoDeEnergia() {
        return custoDeEnergia;
    }


    private int custoDeEnergia;

    public Arma (int dano, int custoDeEnergia){
        this.dano = dano;
        this.custoDeEnergia = custoDeEnergia;
    }

    @Override
    public String toString() {
        return "Arma{" +
                "dano=" + dano +
                ", custoDeEnergia=" + custoDeEnergia +
                '}';
    }
}