package modelo;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="TipoExame")
public class TipoExame {

	private int id;

	private String designacao;

	private Collection<Exame> exame;

	public TipoExame() {

	}

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the exame
     */
    public Collection<Exame> getExame() {
        return exame;
    }

    /**
     * @param exame the exame to set
     */
    public void setExame(Collection<Exame> exame) {
        this.exame = exame;
    }

}
