
public abstract class Conta {
	Cliente cliente;
	private int numero;
	private int agencia;
	protected double saldo;
	private static int total;
	
	public static int getTotal() {
		return total;
	}
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public abstract boolean deposita(double valor);
	
	public boolean saca(double valor) {
		
		if(this.saldo < valor) {
			System.out.println("Operação impossibilitada.");
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
		
	}

	public boolean transfere(double valor, Conta conta) {
		if(this.saca(valor)) {
			conta.deposita(valor);
			return true;
		}
		return false;
		
	}
	
	
}
