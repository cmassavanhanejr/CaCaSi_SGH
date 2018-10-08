package modelo;

import java.util.Date;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 
 * @author Carlos Massavanhane
 */
@Entity
@Table(name="ExamePaciente")
public class ExamePaciente {

	private int id;

	private int resultado;

	private Date dataExame;

	private Exame exame;

	private Collection<ProcessoClinico> processoClinico;

	public ExamePaciente() {

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
