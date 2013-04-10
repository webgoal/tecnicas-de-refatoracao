package substituirMetodoPorObjetoMetodo;

class Teste {
    public void x() {
        //method(2, 3);
        new Method(this, 2, 3).computar();
    }
    
    public void method(int x, int y) {
        int a=1;
        int b=2*x;
        int c=a+b+y;
        int d=a+b+c+x*y;
    }
}

class Method {
    final Teste teste;
    int x;
    int y;
    int a;
    int b;
    int c;
    int d;
    
    public Method(Teste teste, int x, int y) {
        this.teste = teste;
        this.x = x;
        this.y = y;
    }
    
    public void computar() {
        a=1;
        b=2*x;
        c=somaAcomB()+y;
        d=somaAcomB()+c+multiplicaXporY();
    }

    private int multiplicaXporY() {
        return x*y;
    }

    private int somaAcomB() {
        return a+b;
    }
    
}
