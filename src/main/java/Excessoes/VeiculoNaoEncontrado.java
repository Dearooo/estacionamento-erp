package Excessoes;

public class VeiculoNaoEncontrado extends Exception {
    public VeiculoNaoEncontrado(String mensagemDeErro) {
        super(mensagemDeErro);
    }
}
