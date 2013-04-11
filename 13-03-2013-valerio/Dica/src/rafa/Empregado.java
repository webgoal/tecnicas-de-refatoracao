package rafa;

public class Empregado {
	private int _tipo;
	static final int ENGENHEIRO = 0;
	static final int VENDEDOR = 1;
	static final int GERENTE = 2;
	
	static final int _salarioMensal= 1000;
	static final int _comissao = 200;
	static final int _bonus = 100;
	
	Empregado(int tipo) {
		_tipo = tipo;
	}
	
	int quantiaAPagar() {
		switch (_tipo) {
			case ENGENHEIRO:
				return _salarioMensal;
			case VENDEDOR:
				return _salarioMensal + _comissao;
			case GERENTE:
				return _salarioMensal + _bonus;
			default:
				throw new RuntimeException("Tipo incorreto de empregado");
		}
	}
}
