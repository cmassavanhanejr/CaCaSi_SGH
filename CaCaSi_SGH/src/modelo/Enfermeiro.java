package modelo;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.Table;
/**
 * 
 * @author Carlos Massavanhane
 */
@Entity
@Table(name="Enfermeiro")
public class Enfermeiro extends Funcionario {

	private Collection<MarcTratamento> marcTratamento;

	public Enfermeiro() {

	}

    /**
     * 
     * @return 
     */
    public Collection<MarcTratamento> getMarcTratamento() {
        return marcTratamento;
    }

    /**
     * 
     * @param marcTratamento 
     */
    public void setMarcTratamento(Collection<MarcTratamento> marcTratamento) {
        this.marcTratamento = marcTratamento;
    }

        
}
