package subircampo.exercicio.src;

public class ClienteBase {

	protected double saldo;
	
	protected double limiteTaxa;
	
	protected double taxa;

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double calculaTaxaMensal() {
		if (saldo >= limiteTaxa) return 0;
		return taxa;
	}

}
