package classes;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class Fase {

	@Id
	@GeneratedValue
	private int id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_areaconcurso")
	@Fetch (FetchMode.JOIN)
	@Cascade (CascadeType.SAVE_UPDATE)
	private AreaConcurso areaconcurso;

	private Calendar datainicial;

	private Calendar datafinal;

	
	public Fase(int id, AreaConcurso areaconcurso, Calendar datainicial,
			Calendar datafinal) {
		super();
		this.id = id;
		this.areaconcurso = areaconcurso;
		this.datainicial = datainicial;
		this.datafinal = datafinal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AreaConcurso getAreaconcurso() {
		return areaconcurso;
	}

	public void setAreaconcurso(AreaConcurso areaconcurso) {
		this.areaconcurso = areaconcurso;
	}

	public Calendar getDatainicial() {
		return datainicial;
	}

	public void setDatainicial(Calendar datainicial) {
		this.datainicial = datainicial;
	}

	public Calendar getDatafinal() {
		return datafinal;
	}

	public void setDatafinal(Calendar datafinal) {
		this.datafinal = datafinal;
	}

	public Fase() {
		// TODO Auto-generated constructor stub
	}

}
