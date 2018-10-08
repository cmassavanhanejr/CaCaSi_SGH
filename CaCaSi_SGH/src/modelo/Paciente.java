package modelo;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="Paciente")
public class Paciente extends Pessoa {

	private String codigo;

	private TipoPaciente tipoPaciente;

	private Collection<MarcConsulta> marcConsulta;

	private Collection<MarcTratamento> marcTratamento;

	private Collection<ProcessoClinico> processoClinico;

	private Collection<Consulta> consulta;

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

    /**
     * @return the marcConsulta
     */
    public Collection<MarcConsulta> getMarcConsulta() {
        return marcConsulta;
    }

    /**
     * @param marcConsulta the marcConsulta to set
     */
    public void setMarcConsulta(Collection<MarcConsulta> marcConsulta) {
        this.marcConsulta = marcConsulta;
    }

    /**
     * @return the marcTratamento
     */
    public Collection<MarcTratamento> getMarcTratamento() {
        return marcTratamento;
    }

    /**
     * @param marcTratamento the marcTratamento to set
     */
    public void setMarcTratamento(Collection<MarcTratamento> marcTratamento) {
        this.marcTratamento = marcTratamento;
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
     * @return the consulta
     */
    public Collection<Consulta> getConsulta() {
        return consulta;
    }

    /**
     * @param consulta the consulta to set
     */
    public void setConsulta(Collection<Consulta> consulta) {
        this.consulta = consulta;
    }

        
}
