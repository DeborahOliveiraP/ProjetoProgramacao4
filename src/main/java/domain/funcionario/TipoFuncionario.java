package domain.funcionario;

public enum TipoFuncionario {
    DIRETOR(1),
    GERENTE(2);

    private int valor;

    TipoFuncionario(int tipoFuncionario) {
        this.valor = tipoFuncionario;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
