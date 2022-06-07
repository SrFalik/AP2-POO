package OCP;

public class Divisao extends OperacaoMat{

    public Divisao(Double a, Double b) {
        super(a, b);
    }

    public double Dividir() {
        return super.getA() / super.getB();
    }
}
