package modelo;

import java.util.Collection;

public class Recepcionista extends Funcionario {

	private Collection<MarcConsulta> marcConsulta;

	public Recepcionista() {

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

        
}
