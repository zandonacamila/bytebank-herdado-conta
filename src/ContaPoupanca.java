
public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public boolean deposita(double valor) {
		super.saldo += valor;
		return false;
	}
}
