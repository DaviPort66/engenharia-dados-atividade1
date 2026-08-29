public class Discente {

    private final String matricula;
    private final String nomeDiscente;
    private final int anoIngresso;
    private final int periodoIngresso;
    private final String tipoDiscente;
    private final String statusDiscente;
    private final String nivelEnsino;
    private final String nomeCurso;
    private final String modalidadeEducacao;
    private final String nomeUnidade;
    private final String unidadeGestora;

    public Discente(String matricula, String nomeDiscente, int anoIngresso, int periodoIngresso,
                    String tipoDiscente, String statusDiscente, String nivelEnsino,
                    String nomeCurso, String modalidadeEducacao, String nomeUnidade, String unidadeGestora
                    ){

        this.matricula = matricula;
        this.nomeDiscente = nomeDiscente;
        this.anoIngresso = anoIngresso;
        this.periodoIngresso = periodoIngresso;
        this.tipoDiscente = tipoDiscente;
        this.statusDiscente = statusDiscente;
        this.nivelEnsino = nivelEnsino;
        this.nomeCurso = nomeCurso;
        this.modalidadeEducacao = modalidadeEducacao;
        this.nomeUnidade = nomeUnidade;
        this.unidadeGestora = unidadeGestora;

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
