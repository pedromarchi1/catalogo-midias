package midias;

public class Main {
    public static void main(String[] args) {

        Filme filme = new Filme("Era uma Vez em... Hollywood", 2019, 160, "Quentin Tarantino");
        Musica musica = new Musica("Um Dia de Chuva Qualquer", 2016, 4, "BK");
        Podcast podcast = new Podcast("PodPah", 2020, 120, "Mitico e Igão");

        System.out.println("--- Filme ---");
        filme.exibirInformacoes();

        System.out.println("\n--- Música ---");
        musica.exibirInformacoes();

        System.out.println("\n--- Podcast ---");
        podcast.exibirInformacoes();
    }
}
