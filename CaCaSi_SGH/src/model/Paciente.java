/**
 * Classe paciente que extende da pessoa
 * @author Carlos Massavanhane
 */
public class Paciente extends Pessoa {

	private int id;

	private char tipo;

	private int codigo;

	private Servico servico;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    
    public Paciente(char nome, int sexo, int dataNascimento, int celular, char morada, char nomePai, char nomeMae, int estadoCivil, char nacionalidade, char naturalidade, int id) {
        super(nome, sexo, dataNascimento, celular, morada, nomePai, nomeMae, estadoCivil, nacionalidade, naturalidade, id);
    }

	public void adicionar() {

	}

	public void remover() {

	}

	/**
	 *  
	 */
	public void actualizar() {

	}

}
