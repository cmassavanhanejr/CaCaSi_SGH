package modelo;

import java.util.Collection;

public class Medico extends Funcionario {

	private int id;

	private Especialidade especialidade;

	private Collection<MarcConsulta> marcConsulta;

	private Collection<ProcessoClinico> processoClinico;

	public Medico() {

	}

}
