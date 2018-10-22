package modelo;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Paciente extends Pessoa {

	private String codigo;

	@ManyToOne
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
