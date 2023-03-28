package dao;
import domain.conta.Conta;

public class EnvioEmail implements AcaoPosCriacaoBanco {

	@Override
	public void executarAcao(Conta conta) {
		System.out.println("enviando email");
	}

}