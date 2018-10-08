package modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author Carlos Massavanhane
 */
@Entity
@Table (name="Especialidade")
public class Especialidade implements Serializable {

	
        @Id
	private int id;
        
        private int designacao;
	private Collection<Medico> medico;

	public Especialidade() {

	}

    /**
     * @return the designacao
     */
    public int getDesignacao() {
        return designacao;
    }

    /**
     * @param designacao the designacao to set
     */
    public void setDesignacao(int designacao) {
        this.designacao = designacao;
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
     * @return the medico
     */
    public Collection<Medico> getMedico() {
        return medico;
    }

    /**
     * @param medico the medico to set
     */
    public void setMedico(Collection<Medico> medico) {
        this.medico = medico;
    }
        
        
}
