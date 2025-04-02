
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente("213516484651");
		venilton.setNome("venilton");
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.depositar(100);
		cc.depositar(100);
		cc.transferir(100, poupanca, "213516484651");
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
