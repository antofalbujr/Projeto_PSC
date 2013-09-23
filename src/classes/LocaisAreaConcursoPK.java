package classes;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class LocaisAreaConcursoPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne (fetch=FetchType.EAGER)
	@JoinColumn (name="id_areaconcurso")
	private AreaConcurso areaconcurso;
	
	@ManyToOne (fetch=FetchType.EAGER)
	@JoinColumn (name="id_local")
	private Local local;

	public AreaConcurso getAreaconcurso() {
		return areaconcurso;
	}

	public void setAreaconcurso(AreaConcurso areaconcurso) {
		this.areaconcurso = areaconcurso;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public LocaisAreaConcursoPK(AreaConcurso areaconcurso, Local local) {
		super();
		this.areaconcurso = areaconcurso;
		this.local = local;
	}

	public LocaisAreaConcursoPK() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
