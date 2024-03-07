public class Jogador {
    private int energia;
    private int vida;
    private Arma arma;

    public Jogador(){
        this.vida = 15;
    }

    public Jogador(Arma arma, int energia, int vida){
        this.energia = energia;
        this.vida = vida;
        this.arma = arma;
    }

    public void atacar(Jogador alvo){
        if (this.energia >= this.arma.getCustoDeEnergia()){
            this.energia = this.energia - this.arma.getCustoDeEnergia();
            alvo.vida = alvo.vida - this.arma.getDano();
            System.out.println("Hit no alvo");
        }
        else {
            System.out.println("Sem energia");
        }
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "energia=" + energia +
                ", vida=" + vida +
                ", arma=" + arma +
                '}';
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}