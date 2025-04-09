import java.time.LocalDate;


public class Chamado {

    private int id;
    private String descricao;
    private String responsavel;
    private LocalDate dataAbertura;
    private LocalDate dataFechamento;

    /**
     *
     * @param id atributo como identificador do chamado
     * @param descricao é a descrição do chamado
     * @param responsavel é responsavel pelo chamado
     * @param dataAbertura é a data de abertura do chamado
     */

    public Chamado(int id, String descricao, String responsavel, LocalDate dataAbertura){
        this.id = id;
        this.descricao = descricao;
        this.responsavel = responsavel;
        this.dataAbertura = dataAbertura;
        this.dataFechamento = null;
        /**
         * construtor do chamado
         */
    }
    public void fecharChamado(LocalDate dataFechamento){
        this.dataFechamento = dataFechamento;
    }
    public boolean estaAberto(){
        return dataFechamento == null;
    }

    /**
     *
     * @return
     */
    public int getId(){
        return id;
    }

    /**
     *
     * @return Aqui está usando o getter do Id
     */
    public String getDescricao(){
        return descricao;
    }

    /**
     *
     * @return usando getter da descrição
     */
    public String getResponsavel(){
        return responsavel;
    }

    /**
     *
     * @return usando o getter de responsável
     */
    public LocalDate getDataAbertura(){
        return dataAbertura;
    }

    /**
     *
     * @return
     */
    public LocalDate getDataFechamento(){
        return dataFechamento;
    }
    /**
     *
     */
}
