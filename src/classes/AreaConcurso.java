package classes;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class AreaConcurso {

	@Id
	@GeneratedValue
	private long id;

	private String nome;

	private int vagas;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_concurso")
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.SAVE_UPDATE)
	private Concurso concurso;

	@OneToMany (mappedBy="areaconcurso", fetch = FetchType.LAZY)
	@Cascade (CascadeType.ALL)
	private List<Fase> fases;
	
	@OneToMany (mappedBy="areaconcurso", fetch = FetchType.LAZY)
	@Cascade (CascadeType.ALL)
	private List<Concursando> concursando;
	
	/*@OneToMany (mappedBy="areaconcurso", fetch=FetchType.LAZY)
	@Cascade (CascadeType.ALL)
	private List<LocaisAreaConcurso> locais_AreaConcurso;*/
	
	public AreaConcurso(long id, String nome, int vagas, Concurso concurso) {
		super();
		this.id = id;
		this.nome = nome;
		this.vagas = vagas;
		this.concurso = concurso;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVagas() {
		return vagas;
	}

	public void setVagas(int vagas) {
		this.vagas = vagas;
	}

	public Concurso getConcurso() {
		return concurso;
	}

	public void setConcurso(Concurso concurso) {
		this.concurso = concurso;
	}

	public AreaConcurso() {
		// TODO Auto-generated constructor stub
	}

	public List<Fase> getFases() {
		return fases;
	}

	public void setFases(List<Fase> fases) {
		this.fases = fases;
	}

	public List<Concursando> getConcursando() {
		return concursando;
	}

	public void setConcursando(List<Concursando> concursando) {
		this.concursando = concursando;
	}

	/*public List<LocaisAreaConcurso> getLocais_AreaConcurso() {
		return locais_AreaConcurso;
	}

	public void setLocais_AreaConcurso(List<LocaisAreaConcurso> locais_AreaConcurso) {
		this.locais_AreaConcurso = locais_AreaConcurso;
	}*/
	

}
