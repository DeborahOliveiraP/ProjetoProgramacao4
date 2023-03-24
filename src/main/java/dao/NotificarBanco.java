package dao;
import br.com.facol.domain.conta.Conta;

public class NotificarBanco implements AcaoPosCriacaoBanco {

	@Override
	public void executarAcao(Conta conta) {
		System.out.println("Notificando banco da criacao da conta");
	}

}