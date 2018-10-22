package modelo;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
/**
 * 
 * @author Carlos Massavanhane
 */
@Entity
public class Exame extends Servico {

        @ManyToOne
	private TipoExame tipoExame;

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
}
