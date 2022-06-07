package OCP;

public class Soma extends OperacaoMat{
    public Soma(Double a, Double b) {
        super(a, b);
    }

    public double Somar() {
        return super.getA() + super.getB();
    }
}
