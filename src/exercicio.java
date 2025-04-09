import java.util.ArrayList;
import java.util.List;

/**
 * a classe mostra o uso do javadoc
 * Mostra também etapas de verificação da tarefa até ser concluida
 */

public class exercicio {
    private String titulo;
    private String descricao;
    private boolean concluida;

    /**
     * Construção das Strings
     * @param titulo
     * @param descricao
     */

    public exercicio(String titulo, String descricao) {
        this.titulo = titulo; // titulo da tarefa
        this.descricao = descricao; //descrição da tarefa
        this.concluida = false; //status concluído da tarefa
    }

    /**
     * Codigo a seguir conclui a tarefa, colocando a variavel concluida como true
     */
    public void concluir() {
        this.concluida = true;
    }

    /**
     * Aqui no código, está reabrindo a tarefa, colocando a variavel concluida como false
     */
    public void reabrir(){
        this.concluida = false;
    }

    /**
     *
     * @return Já aqui, é um status da variável
     */
    public boolean estaConcluida(){
        return concluida;
    }

    /**
     *
     * @return Usando getter para o Titulo
     */
    public String getTitulo(){
        return titulo;
    }

    /**
     *
     * @return Usando getter da descrição
     */
    public String getDescricao(){
        return descricao;
    }
}

