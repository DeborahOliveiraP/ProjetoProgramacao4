package domain.conta;

import java.math.BigDecimal;

public class ContaCorrente implements Imposto {

	@Override
	public BigDecimal calcularImposto(BigDecimal saldo) {
		return saldo.multiply(new BigDecimal("0.1"));
	}

}