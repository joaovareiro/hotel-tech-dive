import java.time.LocalDate;

public class Hospede {
    private String nome;
    private String documentoIdentificacao;
    private LocalDate dataNascimento;

    public Hospede(String nome, String documentoIdentificacao, String dataNascimento) {
        this.nome = nome;
        this.documentoIdentificacao = documentoIdentificacao;
        this.dataNascimento = DataFixed.arrumaData(dataNascimento);
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Hospede{" +
                "nome='" + nome + '\'' +
                ", documentoIdentificacao='" + documentoIdentificacao + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
