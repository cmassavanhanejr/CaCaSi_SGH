package modelo;

/**
 * 
 * @author Carlos Massavanhane
 */
public class Funcionario extends Pessoa {

	private Usuario usuario;

	public Funcionario() {

	}

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
        
        

}
