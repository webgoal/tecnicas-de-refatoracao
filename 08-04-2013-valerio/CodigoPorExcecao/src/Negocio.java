public class Negocio {
	
	private double total;

	public int verificaNegocio(double preco, boolean especial) {
		if(especial) {
			total = (preco * 0.95);
		} else {
			total = (preco * 0.98);
		}
		return enviar();
	}

	private int enviar() {
		// verifica tipo do negocio
		return 0;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}	
}
