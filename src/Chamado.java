import java.time.LocalDate;

/**
 * Classe que representa um chamado, com informações sobre sua identificação,
 * descrição, responsável, data de abertura e data de fechamento.
 */
public class Chamado {

    // Atributos privados da classe
    private int id;                         // Identificador único do chamado
    private String descricao;               // Descrição do problema ou solicitação
    private String responsavel;             // Nome da pessoa responsável pelo chamado
    private LocalDate dataAbertura;         // Data em que o chamado foi aberto
    private LocalDate dataFechamento;       // Data em que o chamado foi fechado (pode ser nula)

    /**
     * Construtor da classe Chamado
     *
     * @param id identificador único do chamado
     * @param descricao descrição do chamado
     * @param responsavel pessoa responsável pelo atendimento do chamado
     * @param dataAbertura data de abertura do chamado
     */
    public Chamado(int id, String descricao, String responsavel, LocalDate dataAbertura){
        this.id = id;
        this.descricao = descricao;
        this.responsavel = responsavel;
        this.dataAbertura = dataAbertura;
        this.dataFechamento = null; // Quando o chamado é criado, ele ainda não está fechado
    }

    /**
     * Método para fechar o chamado, definindo a data de fechamento.
     *
     * @param dataFechamento data em que o chamado foi encerrado
     */
    public void fecharChamado(LocalDate dataFechamento){
        this.dataFechamento = dataFechamento;
    }

    /**
     * Verifica se o chamado ainda está aberto.
     *
     * @return true se o chamado não foi fechado (dataFechamento é nula), false caso contrário
     */
    public boolean estaAberto(){
        return dataFechamento == null;
    }

    // Métodos getters para acessar os atributos

    /**
     * @return o ID do chamado
     */
    public int getId(){
        return id;
    }

    /**
     * @return a descrição do chamado
     */
    public String getDescricao(){
        return descricao;
    }

    /**
     * @return o nome do responsável pelo chamado
     */
    public String getResponsavel(){
        return responsavel;
    }

    /**
     * @return a data em que o chamado foi aberto
     */
    public LocalDate getDataAbertura(){
        return dataAbertura;
    }

    /**
     * @return a data em que o chamado foi fechado, ou null se ainda estiver aberto
     */
    public LocalDate getDataFechamento(){
        return dataFechamento;
    }
}
