package modelo;

import java.util.Collection;

public class Tratamento extends Servico {

	private TipoTratamento tipoTratamento;

	private Collection<MarcTratamento> marcTratamento;

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

        
}
