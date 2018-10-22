package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Usuario")
public class Usuario implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String nome;

	private String pathImagem;

	private String palavraPasse;

	private Date dataRegisto;

	private TipoUsuario tipoUsuario;

	private Funcionario funcionario;
        
        private boolean removido;

    public boolean isRemovido() {
        return removido;
    }

    public void setRemovido(boolean removido) {
        this.removido = removido;
    }

	public Usuario() {

	}


    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the pathImagem
     */
    public String getPathImagem() {
        return pathImagem;
    }

    /**
     * @param pathImagem the pathImagem to set
     */
    public void setPathImagem(String pathImagem) {
        this.pathImagem = pathImagem;
    }

    /**
     * @return the palavraPasse
     */
    public String getPalavraPasse() {
        return palavraPasse;
    }

    /**
     * @param palavraPasse the palavraPasse to set
     */
    public void setPalavraPasse(String palavraPasse) {
        this.palavraPasse = palavraPasse;
    }

    /**
     * @return the dataRegisto
     */
    public Date getDataRegisto() {
        return dataRegisto;
    }

    /**
     * @param dataRegisto the dataRegisto to set
     */
    public void setDataRegisto(Date dataRegisto) {
        this.dataRegisto = dataRegisto;
    }

    /**
     * @return the tipoUsuario
     */
    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * @param tipoUsuario the tipoUsuario to set
     */
    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    /**
     * @return the funcionario
     */
    public Funcionario getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
}
