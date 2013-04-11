package rafa;

abstract class TipoEmpregado {
	abstract int lerCodigo();
	
	static final int ENGENHEIRO = 0;
	static final int VENDEDOR = 1;
	static final int GERENTE = 2;	

	public static TipoEmpregado novoTipo(int arg) {
		switch (arg) {
			case ENGENHEIRO:
				return new Engenheiro();
			case VENDEDOR:
				return new Vendedor();
			case GERENTE:
				return new Gerente();
			default:
				throw new RuntimeException("Valor inv‡lido de c—digo");	
		}
	}
}
