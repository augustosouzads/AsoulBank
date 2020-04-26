
import javax.swing.JOptionPane;

public class Conta {
			// Atribútos da classe
	
	private double saldo;
	private double limite = -500;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
			// CONSTRUTOR
	public Conta(int numero,int agencia) {
		this.numero = numero;
		this.agencia = agencia;
		Conta.total++;
		System.out.println(total+"ª referencia a objeto Conta instanciada");
	}
			// Métodos da classe
	
	public void depositoMsg() {
		JOptionPane.showMessageDialog(null,
		"Depósito efetuado com sucesso !\n" + "Favorecido: "
		+ this.titular.getNome() + "\n" + "c/c: " + this.numero + "\nAgência: "
		+ this.agencia);
	}
	
	public void depositar(double valor) {
		this.saldo += valor;	
		depositoMsg();
	}
	
	public double getExtrato() {
		System.out.println(this.titular.getNome() + "-> Saldo total = " + this.saldo);
		return this.saldo;
		}
	
	
	public boolean sacar(double valor) {
		if((this.saldo - valor) >= this.limite) {
			double saldoAnterior = this.saldo;
			double saldoAtual = this.saldo -= valor;
			JOptionPane.showMessageDialog(null,"Saque efetuado com sucesso !\n"
					+ "Solicitante: " +this.titular.getNome() + "\nC/c" + this.numero
					+ "\nSaldo Anterior = R$ " + 	saldoAnterior + "\nSaldo Atual = R$"
					+ saldoAtual);
			return true;
		   }else {
			JOptionPane.showMessageDialog(null, " Saldo insuficiente.");
			return false;
		   }
	}
	
	public boolean transferir(double valor, Conta favorecido) {
		if((saldo - valor) >= limite) {
			this.saldo -= valor;
			favorecido.saldo += valor;
			JOptionPane.showMessageDialog(null, "Transferência efetuada com sucesso !\n" 
			+ "De:\nC/c: " + this.numero + " - Titular: " + this.titular.getNome() + "\nPara:\nC/c: "
			+ favorecido.numero + " - Titular: " + favorecido.titular.getNome() + "\nValor: R$ " + valor);		
			return true;
		}else {
			JOptionPane.showMessageDialog(null, "Saldo insulficiente.");
			return false;
		}
	}

	public int getAgencia() {
		return agencia;
	}

	
	public int getNumero() {
		return numero;
	}

		
	public double getLimite() {
		return limite;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
    
	public static int getTotal() {
		return Conta.total;
	}
}