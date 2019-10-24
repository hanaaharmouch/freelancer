package web_port;

import java.io.IOException;
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
import metierp.IUpdateOffre;
import metierp.UpdateOffre;
import web.OffreModel;

/**
 * Servlet implementation class ControlerUpdateOffre
 */
//@WebServlet("/updateOffre.php")
public class ControlerUpdateOffre extends HttpServlet {
	private static final long serialVersionUID = 1L;
private IUpdateOffre metier;
	
	public void init() throws ServletException {
		metier=  new UpdateOffre();
			}
    public ControlerUpdateOffre() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id= Integer.parseInt(request.getParameter("id"));
		Offre O= metier.getOffre(id);
		request.setAttribute("offre",O);
		request.getRequestDispatcher("UpdateOffre.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String mc = request.getParameter("id");
			String mc2 = request.getParameter("idp");


			int valeur2 = Integer.parseInt(mc2);
		   Offre O = new Offre();
			//model.getPostulation().setId_postulation(Integer.parseInt(req.getParameter("budget")));
		    O.setId(Integer.parseInt(request.getParameter("id")));
			O.setIdPort(valeur2);
			O.setCategorie(request.getParameter("categorie"));
			O.setBudget(Integer.parseInt(request.getParameter("budget")));
			O.setDure(request.getParameter("dure"));
			O.setProjet(request.getParameter("projet"));
			
			metier.updateOffre(O);
			System.out.println(valeur2);

	
		
		
		request.getRequestDispatcher("PorteurHome.jsp").forward(request,response);	
		
	}

}
