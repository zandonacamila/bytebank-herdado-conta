
public class TesteTributaveis {
	
	public static void main(String[] args) {
	
		CalculadorDeImposto imposto = new CalculadorDeImposto();
		ContaCorrente cc = new ContaCorrente(556, 236);
		cc.deposita(500);
		System.out.println(cc.getSaldo());
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		
		imposto.registra(cc);
		System.out.println(imposto.getTotalImposto());
		imposto.registra(seguro);
		
		System.out.println(imposto.getTotalImposto());
	}
	
}
