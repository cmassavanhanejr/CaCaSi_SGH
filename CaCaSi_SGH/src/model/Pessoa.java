/**
 * 
 * @author Carlos Massavanhane
 */
public class Pessoa {

	private char nome;

	private int sexo;

	private int dataNascimento;

	private int celular;

	private char morada;

	private char nomePai;

	private char nomeMae;

	private int estadoCivil;

	private char nacionalidade;

	private char naturalidade;

	private int id;

    public Pessoa(char nome, int sexo, int dataNascimento, int celular, char morada, char nomePai, char nomeMae, int estadoCivil, char nacionalidade, char naturalidade, int id) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.celular = celular;
        this.morada = morada;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.estadoCivil = estadoCivil;
        this.nacionalidade = nacionalidade;
        this.naturalidade = naturalidade;
        this.id = id;
    }
        
    

    public char getNome() {
        return nome;
    }

    public void setNome(char nome) {
        this.nome = nome;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public char getMorada() {
        return morada;
    }

    public void setMorada(char morada) {
        this.morada = morada;
    }

    public char getNomePai() {
        return nomePai;
    }

    public void setNomePai(char nomePai) {
        this.nomePai = nomePai;
    }

    public char getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(char nomeMae) {
        this.nomeMae = nomeMae;
    }

    public int getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(int estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public char getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(char nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public char getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(char naturalidade) {
        this.naturalidade = naturalidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

        
        
	public void adicionar() {

	}

	public void remover() {

	}

	public void actualizar() {

	}

}
