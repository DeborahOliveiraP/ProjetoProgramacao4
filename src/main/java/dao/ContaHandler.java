package dao;

import br.com.facol.domain.conta.Conta;
import br.com.facol.domain.conta.ContaImposto;

public class ContaHandler {
	
	private Integer numeroConta;
	
	
	public ContaHandler(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public Conta execute() {
		ContaImposto ci = new ContaImposto(Integer.valueOf(this.numeroConta));
		return ci;
	}

}