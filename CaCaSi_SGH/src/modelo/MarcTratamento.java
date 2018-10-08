package modelo;

import java.util.Date;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 * 
 * @author Carlos Massavanhane
 */
@Entity
@Table(name="MarcTratamento")
public class MarcTratamento {
        @Id
	private int id;

        @Temporal(javax.persistence.TemporalType.DATE)
	private Date data;

	private Tratamento tratamento;

	private Paciente paciente;

	private Enfermeiro enfermeiro;

	private Collection<ProcessoClinico> processoClinico;

	

	public MarcTratamento() {

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
     * @return the tratamento
     */
    public Tratamento getTratamento() {
        return tratamento;
    }

    /**
     * @param tratamento the tratamento to set
     */
    public void setTratamento(Tratamento tratamento) {
        this.tratamento = tratamento;
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
     * @return the enfermeiro
     */
    public Enfermeiro getEnfermeiro() {
        return enfermeiro;
    }

    /**
     * @param enfermeiro the enfermeiro to set
     */
    public void setEnfermeiro(Enfermeiro enfermeiro) {
        this.enfermeiro = enfermeiro;
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
        
        

}
