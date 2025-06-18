package midias;

public class Midia {
    private String titulo;
    private int anoLancamento;
    private int duracao; 

    public Midia(String titulo, int anoLancamento, int duracao) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Duração: " + duracao + " minutos");
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public int getDuracao() {
        return duracao;
    }
}
