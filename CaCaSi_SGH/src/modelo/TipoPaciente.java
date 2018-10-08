package modelo;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "TipoPaciente")
public class TipoPaciente {

	private int id;

	private String designacao;

	private Collection<Paciente> paciente;

	public TipoPaciente() {

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
     * @return the paciente
     */
    public Collection<Paciente> getPaciente() {
        return paciente;
    }

    /**
     * @param paciente the paciente to set
     */
    public void setPaciente(Collection<Paciente> paciente) {
        this.paciente = paciente;
    }
        
        

}
