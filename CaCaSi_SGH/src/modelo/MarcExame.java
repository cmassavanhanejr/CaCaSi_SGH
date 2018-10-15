package modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 * 
 * @author Carlos Massavanhane
 */
@Entity
@Table(name="MarcExame")
public class MarcExame implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

	private int resultado;

    public MarcExame(int id, int resultado, Date dataExame, Exame exame, Collection<ProcessoClinico> processoClinico) {
        this.id = id;
        this.resultado = resultado;
        this.dataExame = dataExame;
        this.exame = exame;
    }
       
        @Temporal(javax.persistence.TemporalType.DATE)
	private Date dataExame;

        @ManyToOne
	private Exame exame;
        
        @ManyToOne
        private Paciente paciente;
        
        @ManyToOne
        private Recepcionista recepcionista;
        
        

	public MarcExame() {

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
     * @return the resultado
     */
    public int getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    /**
     * @return the dataExame
     */
    public Date getDataExame() {
        return dataExame;
    }

    /**
     * @param dataExame the dataExame to set
     */
    public void setDataExame(Date dataExame) {
        this.dataExame = dataExame;
    }

    /**
     * @return the exame
     */
    public Exame getExame() {
        return exame;
    }

    /**
     * @param exame the exame to set
     */
    public void setExame(Exame exame) {
        this.exame = exame;
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
