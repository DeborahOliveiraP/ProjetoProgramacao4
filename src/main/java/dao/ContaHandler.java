package dao;

import domain.conta.Conta;
import domain.conta.ContaImposto;

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