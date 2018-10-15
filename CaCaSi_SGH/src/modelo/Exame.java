package modelo;

import java.util.Collection;
/**
 * 
 * @author Carlos Massavanhane
 */
public class Exame extends Servico {

	private TipoExame tipoExame;

	private Collection<MarcExame> examePaciente;

	public Exame() {

	}

    /**
     * @return the tipoExame
     */
    public TipoExame getTipoExame() {
        return tipoExame;
    }

    /**
     * @param tipoExame the tipoExame to set
     */
    public void setTipoExame(TipoExame tipoExame) {
        this.tipoExame = tipoExame;
    }

    /**
     * @return the examePaciente
     */
    public Collection<MarcExame> getExamePaciente() {
        return examePaciente;
    }

    /**
     * @param examePaciente the examePaciente to set
     */
    public void setExamePaciente(Collection<MarcExame> examePaciente) {
        this.examePaciente = examePaciente;
    }

        
}
