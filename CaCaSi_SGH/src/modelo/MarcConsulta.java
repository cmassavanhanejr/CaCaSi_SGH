package modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * @author Carlos Massavanhane
 */
@Entity
@Table(name="MarcConsulta")
public class MarcConsulta implements Serializable {
        @Id
	private int id;
        @Temporal (TemporalType.DATE)
	private Date data;
        @Temporal (TemporalType.TIME)
	private Date hora;

	private Paciente paciente;

	private Consulta consulta;

	private Medico medico;

	private Collection<ProcessoClinico> processoClinico;

	private Collection<Recepcionista> recepcionista;

	/**
	 *  
	 */
	public MarcConsulta() {

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
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the hora
     */
    public Date getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(Date hora) {
        this.hora = hora;
    }

    /**
     * @return the paciente
     */
    public Paciente getPaciente() {
        return paciente;
    }

    /**
     * @param paciente the paciente to set
     */
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    /**
     * @return the consulta
     */
    public Consulta getConsulta() {
        return consulta;
    }

    /**
     * @param consulta the consulta to set
     */
    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    /**
     * @return the medico
     */
    public Medico getMedico() {
        return medico;
    }

    /**
     * @param medico the medico to set
     */
    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    /**
     * @return the processoClinico
     */
    public Collection<ProcessoClinico> getProcessoClinico() {
        return processoClinico;
    }

    /**
     * @param processoClinico the processoClinico to set
     */
    public void setProcessoClinico(Collection<ProcessoClinico> processoClinico) {
        this.processoClinico = processoClinico;
    }

    /**
     * @return the recepcionista
     */
    public Collection<Recepcionista> getRecepcionista() {
        return recepcionista;
    }

    /**
     * @param recepcionista the recepcionista to set
     */
    public void setRecepcionista(Collection<Recepcionista> recepcionista) {
        this.recepcionista = recepcionista;
    }

        
}
