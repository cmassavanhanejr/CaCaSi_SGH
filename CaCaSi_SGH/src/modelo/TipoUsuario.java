package modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author Carlos Massavanhane
 */
@Entity
@Table(name = "TipoUsuario")
public class TipoUsuario implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String designacao;

	private Collection<Usuario> usuario;
        
        private boolean removido;

    public boolean isRemovido() {
        return removido;
    }

    public void setRemovido(boolean removido) {
        this.removido = removido;
    }

	public TipoUsuario() {

	}

   

    

    /**
     * @return the designacao
     */
    public String getDesignacao() {
        return designacao;
    }

    /**
     * @param designacao the designacao to set
     */
    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    /**
     * @return the usuario
     */
    public Collection<Usuario> getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Collection<Usuario> usuario) {
        this.usuario = usuario;
    }

}
