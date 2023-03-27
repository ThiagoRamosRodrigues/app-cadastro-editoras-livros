
public class Editora {
	
	private int idEditora;
	private String razaoSocial;
	private String contato;
	private String cidade;
	private String uf;
	
	public Editora(int idEditora, String razaoSocial, String contato, String cidade, String uf) {
		super();
		this.idEditora = idEditora;
		this.razaoSocial = razaoSocial;
		this.contato = contato;
		this.cidade = cidade;
		this.uf = uf;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public int getIdEditora() {
		return idEditora;
	}
	
	

}