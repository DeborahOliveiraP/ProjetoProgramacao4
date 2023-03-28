package dao;

import java.util.List;

import domain.conta.Conta;
import infra.Banco;

public class ContaDao {

	private List<AcaoPosCriacaoBanco> acoes;

	
	public ContaDao(List<AcaoPosCriacaoBanco> acoes) {
		this.acoes = acoes;
	}
	
	public ContaDao() {
		
	}

	public void execute(Conta conta) {
		acoes.forEach(acao -> acao.executarAcao(conta));
	}

	public List<Conta> listarContas() {
		return Banco.getContasImposto();
	}

}

