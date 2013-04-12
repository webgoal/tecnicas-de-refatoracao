package rafa;

public class Empregado {
	private TipoEmpregado _tipo;
	
	static final int _salarioMensal= 1000;
	static final int _comissao = 200;
	static final int _bonus = 100;
	
	Empregado(int tipo) {
		gravarTipo(tipo);
	}

	public void gravarTipo(int arg) {
		_tipo = TipoEmpregado.novoTipo(arg);
	}
	
	public int lerTipo() {
		return _tipo.lerCodigo();
	}	
	
	int quantiaAPagar() {
		switch (lerTipo()) {
			case TipoEmpregado.ENGENHEIRO:
				return _salarioMensal;
			case TipoEmpregado.VENDEDOR:
				return _salarioMensal + _comissao;
			case TipoEmpregado.GERENTE:
				return _salarioMensal + _bonus;
			default:
				throw new RuntimeException("Tipo incorreto de empregado");
		}
	}
}
