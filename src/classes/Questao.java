package classes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Type;

@Entity
public class Questao {

	@Id	@GeneratedValue
	@Column (name="id_questao")
	private long id;
	@Type(type="text")
	private String texto;

	private String referencia;

	private String genero;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_elaborador", updatable = true, insertable = true)
	@Cascade(CascadeType.SAVE_UPDATE)
	private Elaborador elaborador;
	
	@OneToMany (mappedBy = "questao" ,fetch = FetchType.LAZY) 
	@Cascade (CascadeType.ALL)
	private List<Alternativa> alternativas;

	public Questao(long id, String texto, String referencia, String genero,
			Elaborador elaborador) {
		super();
		this.id = id;
		this.texto = texto;
		this.referencia = referencia;
		this.genero = genero;
		//this.elaborador = elaborador;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Elaborador getElaborador() {
		return elaborador;
	}

	public void setElaborador(Elaborador elaborador) {
		this.elaborador = elaborador;
	}

	public Questao() {
		// TODO Auto-generated constructor stub
	}

}
