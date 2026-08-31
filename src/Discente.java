public class Discente {

    // Campos dos discentes do csv.
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

    /* metodo construtor. quando discente for criado no main,
       os dados dos campos sao passados direto pra esse metodo e armazenados.*/
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

    //metodo que define a formataçao do texto para armazenar no arquivo texto.
    @Override
    public String toString() {
        return "Matricula: "+ matricula +
                " || Nome: "+ nomeDiscente +
                " || Ano de ingresso: "+ anoIngresso +
                " || Periodo de ingresso: "+ periodoIngresso +
                " || Tipo de discente: "+ tipoDiscente +
                " || Status do discente: "+ statusDiscente +
                " || Nivel de ensino: "+ nivelEnsino +
                " || Nome do Curso: "+ nomeCurso +
                " || Modalidade Educacional: "+ modalidadeEducacao +
                " || Unidade: "+ nomeUnidade +
                " || Unidade Gestora: "+ unidadeGestora;
    }
}
