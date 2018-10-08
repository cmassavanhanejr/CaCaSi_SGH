package modelo;

import java.util.Date;
import java.util.Collection;

public class MarcTratamento {

	private int id;

	private Date data;

	private Tratamento tratamento;

	private Paciente paciente;

	private Enfermeiro enfermeiro;

	private Collection<ProcessoClinico> processoClinico;

	

	public MarcTratamento() {

	}

}
