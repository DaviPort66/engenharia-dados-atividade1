import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<Discente> discentes = new ArrayList<Discente>();
        lerDiscentes(discentes);


    }

    private static void lerDiscentes(ArrayList<Discente> discentes){
        try (BufferedReader br = new BufferedReader(new FileReader("dis-csv-discentes-de-graduacao-de-2026.csv"))) {
            String linha;
            String cabecalho = br.readLine();
            while ((linha = br.readLine()) != null) {
                String partes[] = linha.split(",");
                String matricula = partes[0];
                String nomeDiscente = partes[1];
                int anoIngresso = Integer.parseInt(partes[2]);
                int periodoIngresso = Integer.parseInt(partes[3]);
                String tipoDiscente = partes[4];
                String statusDiscente = partes[5];
                String nivelEnsino = partes[6];
                String nomeCurso = partes[7];
                String modalidadeEducacao = partes[8];
                String nomeUnidade = partes[9];
                String unidadeGestora = partes[10];

                Discente discente = new Discente(matricula, nomeDiscente, anoIngresso, periodoIngresso,
                                                 tipoDiscente, statusDiscente, nivelEnsino, nomeCurso,
                                                  modalidadeEducacao, nomeUnidade, unidadeGestora
                                                 );
                discentes.add(discente);

            }
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo (nome do arquivo deve ser [dis-csv-discentes-de-graduacao-de-2026.csv]): " + e.getMessage());
        }
    }
}
