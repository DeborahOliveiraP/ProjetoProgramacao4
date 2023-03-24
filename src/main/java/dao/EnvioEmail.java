package dao;
import br.com.facol.domain.conta.Conta;

public class EnvioEmail implements AcaoPosCriacaoBanco {

	@Override
	public void executarAcao(Conta conta) {
		System.out.println("enviando email");
	}

}