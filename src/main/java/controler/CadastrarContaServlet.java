package controler;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ContaDao;
import dao.ContaHandler;
import dao.EnvioEmail;
import dao.NotificarBanco;
import dao.SalvarConta;
import domain.conta.Conta;

@WebServlet(urlPatterns = "/cadastro-conta")
public class CadastrarContaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		String numeroConta = req.getParameter("conta");

		// recebendo a informacao
		ContaHandler handler = new ContaHandler(Integer.valueOf(numeroConta));
		Conta contaHandler = handler.execute();

		// tratando a logica com a informacao recebida
		ContaDao dao = new ContaDao(List.of(new SalvarConta(), new EnvioEmail(), new NotificarBanco()));
		dao.execute(contaHandler);

		PrintWriter out = resp.getWriter();

		out.println("<html>");
		out.println("<body>");

		out.println("Conta: " + contaHandler.getConta() + "-" + contaHandler.getDigitoVerificador()
				+ " criada com sucesso! <br>");
		out.println("Conta com saldo inicial de " + contaHandler.getSaldo());
		out.println("Quantidade de contas criadas: " + contaHandler.totalDeContasCriadas());

		out.println("</body>");
		out.println("</html>");

	}

}