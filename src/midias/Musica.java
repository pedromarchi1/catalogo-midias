package midias;

public class Musica extends Midia {
    private String artista;

    public Musica(String titulo, int anoLancamento, int duracao, String artista) {
        super(titulo, anoLancamento, duracao);
        this.artista = artista;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Artista: " + artista);
    }
}
