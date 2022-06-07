package OCP;

public class Subtracao extends OperacaoMat{

    public Subtracao(Double a, Double b) {
        super(a, b);
    }
    public double Subtrair() {
        return super.getA() - super.getB();
    }
}
