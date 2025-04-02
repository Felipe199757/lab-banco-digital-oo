
public interface IConta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void pagarBoleto(double valor);
	
	void transferir(double valor, IConta contaDestino, String cpf);
	
	void imprimirExtrato();
}
