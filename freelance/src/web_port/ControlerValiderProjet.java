package web_port;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metierp.IValiderPost;
import metierp.IValiderProjet;
import metierp.ValdierPostImp;
import metierp.ValiderProjetImp;

/**
 * Servlet implementation class ControlerValiderProjet
 */
//@WebServlet("/ControlerValiderProjet")
public class ControlerValiderProjet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IValiderProjet metier;
		
		public void init() throws ServletException {
			metier=  new ValiderProjetImp();
				}
	    public ControlerValiderProjet() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String mc = request.getParameter("id");
			
			int valeur = Integer.parseInt(mc);
			
			metier.ValiderProjet(valeur);
			
			System.out.println(valeur);
			
			request.getRequestDispatcher("PorteurHome.jsp").forward(request,response);
		}


		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		}
}
