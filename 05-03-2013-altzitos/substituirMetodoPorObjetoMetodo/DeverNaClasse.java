package substituirMetodoPorObjetoMetodo;


class DeverNaClasse {
    int gamma(int valorEntrada, int quantidade, int anoCorrente) {
        int valorImportante1 = (valorEntrada * quantidade) + delta();
        int valorImportante2 = (valorEntrada * anoCorrente) + 100;
        if ((anoCorrente - valorImportante1) > 100)
        valorImportante2 -= 20;
        int valorImportante3 = valorImportante2 * 7;
        // e assim por diante
        return valorImportante3 - 2 * valorImportante1;
    }

    public int delta() {
        return 24;
    }
}

class Gamma {
    final DeverNaClasse dever;
    
    int valorEntrada;
    int quantidade;
    int anoCorrente;
    int valorImportante1;
    int valorImportante2;
    int valorImportante3;
    
    public Gamma(DeverNaClasse dever, int valorEntrada, int quantidade, int anoCorrente) {
        this.dever = dever;
        this.valorEntrada = valorEntrada;
        this.quantidade = quantidade;
        this.anoCorrente = anoCorrente;
    }
    
    public int computar() {
        valorImportante1 = (valorEntrada * quantidade) + dever.delta();
        
        calulaValorImportante2();
        
        valorImportante3 = valorImportante2 * 7;

        return valorImportante3 - 2 * valorImportante1;
    }

    private void calulaValorImportante2() {
        valorImportante2 = (valorEntrada * anoCorrente) + 100;
        
        if ((anoCorrente - valorImportante1) > 100)
            valorImportante2 -= 20;
    }
}

