
public class Endereco {
	
	private String cep;
	private String logradouro;
	private String numero;
	private String complemento;
	private String cidade;
	private String estado;
	
	
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
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

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void exibirEndereco() {
		System.out.println("CEP = " + this.cep);	
		System.out.println("Endereço: " + this.logradouro);	
		System.out.println("Nº " + this.numero);	
		System.out.println("Complemento: " + this.complemento);
		System.out.println("Cidade: " + this.cidade);
		System.out.println("UF :" + this.estado);
	}
}