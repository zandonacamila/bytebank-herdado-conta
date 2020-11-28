
public class ContaCorrente extends Conta {
	
	private double taxa;
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia,numero); //chamada do construtor da classe mãe
	}
		
	@Override
	public boolean saca(double valor) {
		
		return super.saca(valor + 0.02);
	}

	public double getTaxa() {
		return taxa;
	}

	@Override
	public boolean deposita(double valor) {
		if(valor >= 0) {
			super.saldo += valor;
			return true;
		}
		return false;
	}
}
