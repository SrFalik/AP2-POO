package OCP;

public class Multiplicacao extends  OperacaoMat{
    public Multiplicacao(Double a, Double b) {
        super(a, b);
    }

    public double Multiplicar() {
        return super.getA() * super.getB();
    }
}
