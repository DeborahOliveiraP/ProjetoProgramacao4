package domain.conta;

import java.math.BigDecimal;

public interface Imposto {
	
	public BigDecimal calcularImposto(BigDecimal saldo);

}
