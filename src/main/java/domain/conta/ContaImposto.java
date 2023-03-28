package domain.conta;

import java.math.BigDecimal;

public class ContaImposto extends Conta {

	private Imposto imposto;

	public ContaImposto(int conta) {
		super(conta);
	}

	@Override
	public boolean saca(BigDecimal valor) {
		if (super.getSaldo().doubleValue() >= valor.doubleValue()) {
			BigDecimal impostoSaque = calcularImposto(super.getSaldo(), imposto);
			BigDecimal valorSacado = (super.getSaldo().subtract(valor)).subtract(impostoSaque);
			this.saldo = valorSacado;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void deposita(BigDecimal saldo) {
		super.saldo = super.saldo.add(saldo);
	}

	private BigDecimal calcularImposto(BigDecimal saldo, Imposto imposto) {
		return imposto.calcularImposto(saldo);
	}

	public Imposto getImposto() {
		return imposto;
	}

	public void setImposto(Imposto imposto) {
		this.imposto = imposto;
	}

}