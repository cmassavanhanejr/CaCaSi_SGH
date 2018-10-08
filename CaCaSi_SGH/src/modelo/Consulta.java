package modelo;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.Table;
/**
 * 
 * @author Carlos Massavanhane
 */
@Entity
@Table(name="Consulta")
public class Consulta extends Servico {

	private Collection<MarcConsulta> marcConsulta;

	private Collection<Paciente> paciente;

	public Consulta() {

	}

    public Collection<MarcConsulta> getMarcConsulta() {
        return marcConsulta;
    }

    public void setMarcConsulta(Collection<MarcConsulta> marcConsulta) {
        this.marcConsulta = marcConsulta;
    }

    public Collection<Paciente> getPaciente() {
        return paciente;
    }

    public void setPaciente(Collection<Paciente> paciente) {
        this.paciente = paciente;
    }
    
}
