

public class Cliente {
	
	private String nome;
	private String cpf;
	private String profissao;
	private Endereco endereco;
	private String telefone;
	


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void exibirDados() {
		 System.out.println("Nome: " + this.nome);	
		 System.out.println("CPF: " + this.cpf);	
		 System.out.println("Profissão: " + this.profissao);	
		 System.out.println("Tel: " + this.telefone);	
	}
}
