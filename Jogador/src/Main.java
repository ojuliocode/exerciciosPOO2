public class Main {
    public static void main(String[] args) {
        Arma arma = new Arma(5, 5);
        Jogador alvo = new Jogador();
        Jogador jogador = new Jogador(arma, 10, 10);
        System.out.println(jogador.toString());
        System.out.println(arma.toString());
        jogador.atacar(alvo);
        // Printar as infos do player
        jogador.atacar(alvo);
        jogador.atacar(alvo);

    }
}