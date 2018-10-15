package modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author Carlos Massavanhane
 */
@Entity
@Table(name="TipoTratamento")
public class TipoTratamento implements Serializable {
        
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String designacao;

	

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

}
