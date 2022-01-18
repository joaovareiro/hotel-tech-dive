public enum QuartoEnum {
    SIMPLES("Simples",90,140,14),
    LUXO("Luxo",150,400,22),
    ;

    private String nomeQuarto;
    private int valorBaixa;
    private int valorAlta;
    private int numDisponiveis;

    QuartoEnum(String nomeQuarto, int valorBaixa, int valorAlta, int numDisponiveis) {
        this.nomeQuarto = nomeQuarto;
        this.valorBaixa = valorBaixa;
        this.valorAlta = valorAlta;
        this.numDisponiveis = numDisponiveis;
    }

    public int getNumDisponiveis() {
        return numDisponiveis;
    }
}