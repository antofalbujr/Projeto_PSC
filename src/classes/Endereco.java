package classes;


import javax.persistence.Embeddable;
import javax.persistence.Table;


@Embeddable
@Table (name="Endereco")
public class Endereco {
	/*private String pais;*/
	private String cep;

	private String cidade;

	private String logradouro;

	private String uf;

	private String bairro;

	private String numero;

	private String complemento;
	
	
	public Endereco(String cep, String cidade, String logradouro, String uf, String bairro, String numero, String complemento) {
		super();
		this.cep = cep;
		this.cidade = cidade;
		this.logradouro = logradouro;
		this.uf = uf;
		this.bairro = bairro;
		this.numero = numero;
		this.complemento = complemento;
	}


	public String getCep() {
		return cep;
	}



	public void setCep(String cep) {
		this.cep = cep;
	}



	public String getCidade() {
		return cidade;
	}



	public void setCidade(String cidade) {
		this.cidade = cidade;
	}



	public String getLogradouro() {
		return logradouro;
	}



	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}



	public String getUf() {
		return uf;
	}



	public void setUf(String uf) {
		this.uf = uf;
	}



	public String getBairro() {
		return bairro;
	}



	public void setBairro(String bairro) {
		this.bairro = bairro;
	}



	public String getNumero() {
		return numero;
	}



	public void setNumero(String numero) {
		this.numero = numero;
	}



	public String getComplemento() {
		return complemento;
	}



	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}



	public Endereco() {
		// TODO Auto-generated constructor stub
	}

}
