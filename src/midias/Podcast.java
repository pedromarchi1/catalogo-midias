package midias;

public class Podcast extends Midia {
    private String host;

    public Podcast(String titulo, int anoLancamento, int duracao, String host) {
        super(titulo, anoLancamento, duracao);
        this.host = host;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Host: " + host);
    }
}
