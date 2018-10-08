package modelo;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.Table;
/**
 * 
 * @author Carlos Massavanhane
 */
@Entity
@Table(name="TipoTratamento")
public class TipoTratamento {

	private int id;

	private String designacao;

	private Collection<Tratamento> tratamento;

	public TipoTratamento() {

	}

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the designacao
     */
    public String getDesignacao() {
        return designacao;
    }

    /**
     * @param designacao the designacao to set
     */
    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    /**
     * @return the tratamento
     */
    public Collection<Tratamento> getTratamento() {
        return tratamento;
    }

    /**
     * @param tratamento the tratamento to set
     */
    public void setTratamento(Collection<Tratamento> tratamento) {
        this.tratamento = tratamento;
    }

}
