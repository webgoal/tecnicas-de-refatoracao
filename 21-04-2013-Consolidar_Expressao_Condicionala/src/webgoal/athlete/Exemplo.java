package webgoal.athlete;

class ExemploOR {

	private int antiguidade;
	private int mesesIncapacitacao;
	private boolean tempoParcial;

	public ExemploOR(int antiguidade, int mesesIncapacitacao, boolean tempoParcial) {
		this.antiguidade = antiguidade;
		this.mesesIncapacitacao = mesesIncapacitacao;
		this.tempoParcial = tempoParcial;
	}

	public int valorPorIncapacidade() {
		if (antiguidade < 2)
			return 0;
		if (mesesIncapacitacao > 12)
			return 0;
		if (tempoParcial)
			return 0;
		return antiguidade * mesesIncapacitacao;
	}

}

class ExemploAND {

	private int duracaoServico;
	private boolean emFerias;

	public ExemploAND(boolean emFerias, int duracaoServico) {
		this.emFerias = emFerias;
		this.duracaoServico = duracaoServico;
	}

	public int percentualDesconto() {
		if (emFerias)
			if (duracaoServico > 10)
				return 2;
		return 1;
	}

}


