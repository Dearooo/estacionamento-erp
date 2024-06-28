package enums;

public enum EOperacao {
    ESTACIONAR(1, "Estacionar um veículo"),
    RETIRAR_VEICULO(2, "Retirar um veículo"),
    PRINTAR_ESTACIONAMENTO(3, "Mostrar o estacionamento"),
    PRINTAR_REGISTROS_DO_DIA(4, "Ver os registros de hoje"),
    PRINTAR_RELATORIO(5, "Imprimir relatório em pdf"),
    ENCERRAR_PROGRAMA(6, "Parar o programa");

    private final int codigo;
    private final String nome;

    EOperacao(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
