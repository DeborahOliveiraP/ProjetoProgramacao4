package br.com.facol.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.facol.dao.ContaDao;
import br.com.facol.domain.conta.Conta;

@WebServlet(urlPatterns = "/listar-contas")
public class ListarContasServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		PrintWriter out = resp.getWriter();

		out.println("<html>");
		out.println("<body>");
		out.println("<ul>");

		ContaDao dao = new ContaDao();
		
		List<Conta> contas = dao.listarContas();

		for (Conta conta : contas) {
			out.println("<li>" + conta.getConta() + "</li>");
		}

		out.println("</ul>");
		out.println("</body>");
		out.println("</html>");

	}

}