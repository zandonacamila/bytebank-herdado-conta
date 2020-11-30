
public class ContaCorrente extends Conta implements Tributavel {

	private int agencia;
	private Cliente cliente;
	private int numero;
	private double saldo;
	
	
	public ContaCorrente(int numero, int agencia) {
		super(numero, agencia);
	}
	
	public boolean deposita(double valor) {
		if(valor >= 0) {
			this.saldo += valor;
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
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

	@Override
	public double getValorImposto() {

		return this.saldo * 10;
	}

}
