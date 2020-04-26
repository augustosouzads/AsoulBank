

public class AsoulBank {

	public static void main(String[] args) {
		
		Conta contaDaJani = new Conta(110315,1908);
		
		Cliente jani = new Cliente();
		contaDaJani.setTitular(jani);
		jani.setNome("Janilza Ramos Evangelista");
		Conta contaDoAugusto = new Conta(0032,754681); //instanciando novo objeto Conta
		Cliente augusto = new Cliente();  //instanciando novo objeto Cliente
		Endereco endDoAugusto = new Endereco();	//instanciando novo objeto Endereço

		contaDoAugusto.setTitular(augusto); 
		augusto.setEndereco(endDoAugusto);
	
		augusto.setNome("Augusto de Souza");
		augusto.setCpf("322.975.498-06");
		augusto.setProfissao("Programador");
					
		
		contaDoAugusto.getTitular().setTelefone("94723-0796"); // acessando atributo telefone atraves da conta
		endDoAugusto.setLogradouro("Rua Enes silveira de Mello");
		endDoAugusto.setNumero("152");
		endDoAugusto.setComplemento("Casa");////
		endDoAugusto.setCidade("São Paulo");
		augusto.getEndereco().setCep("03974-000");//acessando atributo cep atraves do cliente.
		contaDoAugusto.getTitular().getEndereco().setEstado("SP");//acessando estado atraves de Conta>titular>Cliente>Endereço.
		
		System.out.println("===== Testes dos metodos do cliente e endereço =====||");

		augusto.exibirDados();
		augusto.getEndereco().exibirEndereco();	
		
		System.out.println("============ Testes dos metodos da conta ===========||");
		
		contaDaJani.getExtrato();
		contaDaJani.depositar(1500);
		contaDaJani.getExtrato();
		boolean opre = contaDaJani.sacar(500);
		contaDaJani.getExtrato();
        System.out.println(opre);
		contaDoAugusto.getExtrato();
		contaDaJani.transferir(500, contaDoAugusto);
		contaDoAugusto.getExtrato();

			
	}
}

