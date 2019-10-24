package web_port;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Offre;
import metierp.AddOffreImp;
import metierp.DeleteOffre;
import metierp.IAddOffre;
import metierp.IDeleteOffre;
import web.OffreModel;

/**
 * Servlet implementation class ControlerDeleteOffre
 */
//@WebServlet("/DeleteOffre.php")
public class ControlerDeleteOffre extends HttpServlet {
	private static final long serialVersionUID = 1L;
private IDeleteOffre metier;
	
	public void init() throws ServletException {
		metier=  new DeleteOffre();
			}
    public ControlerDeleteOffre() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mc = request.getParameter("id");
		int valeur = Integer.parseInt(mc);
		metier.deleteOffre(valeur);
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
