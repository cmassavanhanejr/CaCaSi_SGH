package modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 * 
 * @author Carlos Massavanhane
 */
@Entity
@Table(name="MarcTratamento")
public class MarcTratamento implements Serializable {
        @Id
	private int id;

        @Temporal(javax.persistence.TemporalType.DATE)
	private Date data;

        @ManyToOne
	private Tratamento tratamento;

        @ManyToOne
	private Paciente paciente;

        @ManyToOne
	private Enfermeiro enfermeiro;
        
        @ManyToOne
        private Recepcionista recepcionista;

	

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
     * @return the recepcionista
     */
    public Recepcionista getRecepcionista() {
        return recepcionista;
    }

    /**
     * @param recepcionista the recepcionista to set
     */
    public void setRecepcionista(Recepcionista recepcionista) {
        this.recepcionista = recepcionista;
    }
}
