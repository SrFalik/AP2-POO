package DIP;

public class Empregado {
    private Endereco endereco;
    public Empregado (Endereco endereco) {
        this.endereco = endereco;
    }
    public Endereco getEndereco() {
        return endereco;
    }
}
