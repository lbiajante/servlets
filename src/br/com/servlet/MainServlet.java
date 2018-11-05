package br.com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<head>");
		writer.println("<title>Olá Fulano!</title>");
		writer.println("");
		writer.println("");
		writer.println("</head>");
		writer.println("<body>");		
		writer.println("<fieldset>");		
		writer.println("<legend>Escreva o seu nome</legend>");		
		writer.println("<form action=/UmArquivoServlet/RecebeDadosServlet>");		
		writer.println("<label>Nome</label>");		
		writer.println("<input type='text' name='nome'/>");		
		writer.println("<button>Inserir</button>");		
		writer.println("</form></fieldset></body></html>");		
		writer.println("");
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
private void process (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out = response.getWriter();
	out.println("<h1>Nome inserido com sucesso!</h1>");
	String nome = request.getParameter("nome");
	out.print("<h2>Olá, " + nome+"</h2>");
}
}
