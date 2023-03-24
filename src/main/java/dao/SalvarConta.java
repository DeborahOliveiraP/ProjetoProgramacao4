package dao;

import br.com.facol.domain.conta.Conta;
import br.com.facol.infra.Banco;

public class SalvarConta implements AcaoPosCriacaoBanco {

	@Override
	public void executarAcao(Conta conta) {
		Banco.adiciona(conta);
	}

}