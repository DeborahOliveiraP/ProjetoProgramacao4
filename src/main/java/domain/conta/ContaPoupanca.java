package domain.conta;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta implements Imposto {
	public ContaPoupanca(int conta) {
		super(conta);
	}

	@Override
	public void deposita(BigDecimal saldo) {
		super.saldo = saldo;
	}

	@Override
	public boolean saca(BigDecimal valor) {
		if (super.getSaldo().doubleValue() >= valor.doubleValue()) {
			BigDecimal impostoSaque = calcularImposto(valor);
			BigDecimal valorSacado = (super.getSaldo().subtract(valor)).subtract(impostoSaque);
			deposita(valorSacado);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public BigDecimal calcularImposto(BigDecimal saldo) {
		return saldo.multiply(new BigDecimal("0.06"));
	}

}