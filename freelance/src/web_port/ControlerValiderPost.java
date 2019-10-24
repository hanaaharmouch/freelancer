package web_port;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metierp.DeleteOffre;
import metierp.IDeleteOffre;
import metierp.IValiderPost;
import metierp.ValdierPostImp;

/**
 * Servlet implementation class ControlerValiderPost
 */
//@WebServlet("/ValiderPostulation.php")
public class ControlerValiderPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
private IValiderPost metier;
	
	public void init() throws ServletException {
		metier=  new ValdierPostImp();
			}
    public ControlerValiderPost() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mc = request.getParameter("idpost");
		String mc1 = request.getParameter("idporteur");
		String mc2 = request.getParameter("idf");
		String mc3 = request.getParameter("idoffre");
		
		int valeur = Integer.parseInt(mc);
		int valeur1 = Integer.parseInt(mc1);
		int valeur2 = Integer.parseInt(mc2);
		int valeur3 = Integer.parseInt(mc3);
		metier.ValiderPost(valeur3,valeur);
		metier.ToProjet(valeur3,valeur2, valeur,valeur1);
		metier.ValiderDelete(valeur3);
		System.out.println(valeur);
		
		request.getRequestDispatcher("PorteurHome.jsp").forward(request,response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
