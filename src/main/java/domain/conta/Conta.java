package domain.conta;

import java.math.BigDecimal;

import domain.cliente.Cliente;
import domain.funcionario.Funcionario;

public abstract class Conta {
	private final int digitoVerificador = 9;
	private final int agencia = 837;
	private int conta;
	protected BigDecimal saldo = BigDecimal.ZERO;
	private Cliente cliente;
	private Funcionario funcionario;

	private static int qtdContaCriada;

	public Conta(int conta) {
		Conta.qtdContaCriada++;
		this.conta = conta;
	}

	public int getDigitoVerificador() {
		return this.digitoVerificador;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public abstract void deposita(BigDecimal saldo);

	public abstract boolean saca(BigDecimal valor);

	public boolean transfere(BigDecimal valor, Conta destino) {
		if (this.saca(valor)) {
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

	public int totalDeContasCriadas() {
		return Conta.qtdContaCriada;
	}
}