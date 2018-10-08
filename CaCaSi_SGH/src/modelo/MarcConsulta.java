package modelo;

import java.util.Date;
import java.util.Collection;

public class MarcConsulta {

	private int id;

	private Date data;

	private Date hora;

	private Paciente paciente;

	private Consulta consulta;

	private Medico medico;

	private Collection<ProcessoClinico> processoClinico;

	private Collection<Recepcionista> recepcionista;

	/**
	 *  
	 */
	public MarcConsulta() {

	}

}
