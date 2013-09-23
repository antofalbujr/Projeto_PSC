package classes;

import java.util.Calendar;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "locais_areaconcurso")
public class LocaisAreaConcurso {

	@EmbeddedId
	private LocaisAreaConcursoPK chaveComposta;
	
	private Calendar data;
	
	public LocaisAreaConcursoPK getChaveComposta() {
		return chaveComposta;
	}

	public void setChaveComposta(LocaisAreaConcursoPK chaveComposta) {
		this.chaveComposta = chaveComposta;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public LocaisAreaConcurso(LocaisAreaConcursoPK chaveComposta, Calendar data) {
		super();
		//this.chaveComposta = chaveComposta;
		this.data = data;
	}

	public LocaisAreaConcurso() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
