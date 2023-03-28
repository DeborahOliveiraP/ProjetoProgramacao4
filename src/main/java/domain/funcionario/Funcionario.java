package domain.funcionario;

import java.math.BigDecimal;

public abstract class Funcionario {
    private String nome;
    private int id;
    private BigDecimal salario;
    private TipoFuncionario tipoFuncionario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public TipoFuncionario getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(TipoFuncionario tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }


    public abstract BigDecimal getBonificacao();

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", salario=" + salario +
                ", tipoFuncionario=" + tipoFuncionario +
                '}';
    }
}