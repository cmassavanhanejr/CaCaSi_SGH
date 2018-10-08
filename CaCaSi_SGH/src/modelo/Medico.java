package modelo;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table (name="Medico")
public class Medico extends Funcionario {
        

	private Especialidade especialidade;

	private Collection<MarcConsulta> marcConsulta;

	private Collection<ProcessoClinico> processoClinico;

	public Medico() {

	}

 

  

    /**
     * @return the especialidade
     */
    public Especialidade getEspecialidade() {
        return especialidade;
    }

    /**
     * @param especialidade the especialidade to set
     */
    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
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
