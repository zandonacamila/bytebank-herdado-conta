
public class TestaContas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(500);
		
		//cc.transfere(50, cp);
		//System.out.println("CC" + cc.getSaldo());
		//System.out.println("CP" + cp.getSaldo());
		//System.out.println(cc.getSaldo());
		System.out.println("CC " + cc.getSaldo());
		cc.saca(10);
		System.out.println("CC " + cc.getSaldo());
		System.out.println(cc.getTaxa());
	}
	
}
