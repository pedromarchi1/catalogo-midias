package midias;

public class Filme extends Midia {
    private String diretor;

    public Filme(String titulo, int anoLancamento, int duracao, String diretor) {
        super(titulo, anoLancamento, duracao);
        this.diretor = diretor;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Diretor: " + diretor);
    }
}
