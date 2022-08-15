
public class Main {

	public static void main(String[] args) {
		Cliente daniel = new Cliente();
		daniel.setNome("Daniel");
		
		IConta cc = new ContaCorrente(daniel);
		IConta poupanca = new ContaPoupanca(daniel);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
