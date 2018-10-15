package modelo;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="Paciente")
public class Paciente extends Pessoa {

	private String codigo;

	@ManyToMany
        private TipoPaciente tipoPaciente;

	

	public Paciente() {

	}

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the tipoPaciente
     */
    public TipoPaciente getTipoPaciente() {
        return tipoPaciente;
    }

    /**
     * @param tipoPaciente the tipoPaciente to set
     */
    public void setTipoPaciente(TipoPaciente tipoPaciente) {
        this.tipoPaciente = tipoPaciente;
    }
        
}
