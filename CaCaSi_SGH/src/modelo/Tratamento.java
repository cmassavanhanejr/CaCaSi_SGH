package modelo;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
@Entity
public class Tratamento extends Servico {
        @ManyToOne
	private TipoTratamento tipoTratamento;

	public Tratamento() {

	}

    /**
     * @return the tipoTratamento
     */
    public TipoTratamento getTipoTratamento() {
        return tipoTratamento;
    }

    /**
     * @param tipoTratamento the tipoTratamento to set
     */
    public void setTipoTratamento(TipoTratamento tipoTratamento) {
        this.tipoTratamento = tipoTratamento;
    }

    

        
}
