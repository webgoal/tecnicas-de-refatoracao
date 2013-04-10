
public class Produto {
	
	private Double precoDeCusto;
	private Double margemDeLucro;
	
	public Produto(Double precoDeCusto, Double margemDeLucro) {
		this.precoDeCusto = precoDeCusto;
		this.margemDeLucro = margemDeLucro;
	}

	public Double getPrecoVenda() {
		return precoDeCusto + precoDeCusto * margemDeLucro;
	}

	public Double getPrecoVendaComDesconto(){
		return getPrecoVenda() - getPrecoVenda() * nivelDeDesconto();
	}
	
	public Double getPrecoVendaComAcrescimo(){
		return getPrecoVenda() + getPrecoVenda() * nivelDeAcrescimo();
	}
	
	public Double nivelDeDesconto(){
		if (getPrecoVenda() > 5.0)
			return new Double(0.2);
		return new Double(0.1);
	}
	
	public Double nivelDeAcrescimo(){
		if (getPrecoVenda() > 5.0)
			return new Double(0.1);
		return new Double(0.05);
	}

}
