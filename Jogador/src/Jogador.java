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
        // Duvida: pq eu consigo acessar alvo.vida, mesmo que seja private?
        if (this.energia >= this.arma.getCustoDeEnergia()){
            // Duvida: pra acessar a energia (aqui dentro da classe) eu uso this.energia, ou tenho que usar this.getEnergia()?
            System.out.println("------------");
            System.out.println("Vida do alvo antes do hit: " + alvo.vida);
            System.out.println("Energia antes do hit: " + this.getEnergia());

            int newEnergia = this.getEnergia() - this.arma.getCustoDeEnergia();
            int newAlvoVida = alvo.getVida() - this.arma.getDano();
            this.setEnergia(newEnergia);
            alvo.setVida(newAlvoVida);

            System.out.println("Vida do alvo apos o hit: " + alvo.getVida());
            System.out.println("Energia apos o hit: " + this.getEnergia());
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