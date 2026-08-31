import java.io.*;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        //inicializaçao da lista dos discentes
        ArrayList<Discente> discentes = new ArrayList<Discente>();
        //leitura do csv
        lerDiscentes(discentes);
        //após ler, salva os discentes no arquivo texto
        salvarDiscentes(discentes);
    }

    //metodo para ler o arquivo csv dos discentes
    private static void lerDiscentes(ArrayList<Discente> discentes){
        //inicializaçao do leitor, lendo especificamente o arquivo com o nome do csv dos discentes de 2026.
        try (BufferedReader br = new BufferedReader(new FileReader("dis-csv-discentes-de-graduacao-de-2026.csv"))) {
            String linha;
            // variavel do cabecalho nao é usada, é so pra separar dos dados dos discentes
            String cabecalho = br.readLine();

            /*enquanto ainda tiver linhas no csv, separa cada campo entre uma virgula e outra,
              , retira as aspas que tem nos campos do csv, salva cada campo em uma variavel e
              cria o registro do discente, depois adiciona esse registro a lista de discentes.*/
            while ((linha = br.readLine()) != null) {
                String partes[] = linha.split(",", -1);
                for (int i = 0; i < partes.length; i++) {
                    partes[i] = partes[i].replace("\"", "");
                }
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
            //captura de exceçao caso o arquivo nao possa ser lido, possivelmente por nao ter um com o nome correto.
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo (nome do arquivo deve ser [dis-csv-discentes-de-graduacao-de-2026.csv]): " + e.getMessage());
        }
    }

    /*metodo para salvar os dados formatados dos discentes em um arquivo texto*/
    private static void salvarDiscentes(ArrayList<Discente> discentes){
        //cria o objeto de escrita em arquivos.
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("discentes.txt"))) {
            /*percorre a lista de discentes, escrevendo os dados de cada discente no formato
              descrito no toString da classe Discente, e pulando uma linha pra escrever o proximo.*/
            for (Discente discente : discentes) {
                bw.write(discente.toString());
                bw.newLine();
            }
            //captura de exceçao para caso haja um problema ao salvar um arquivo.
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo: " + e.getMessage());
        }
    }



}
