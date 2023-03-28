package dao;

import domain.conta.Conta;
import infra.Banco;

public class SalvarConta implements AcaoPosCriacaoBanco {

	@Override
	public void executarAcao(Conta conta) {
		Banco.adiciona(conta);
	}

}