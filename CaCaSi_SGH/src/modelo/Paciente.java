package modelo;

import java.util.Collection;

public class Paciente extends Pessoa {

	private String codigo;

	private TipoPaciente tipoPaciente;

	private Collection<MarcConsulta> marcConsulta;

	private Collection<MarcTratamento> marcTratamento;

	private Collection<ProcessoClinico> processoClinico;

	private Collection<Consulta> consulta;

	public Paciente() {

	}

}
