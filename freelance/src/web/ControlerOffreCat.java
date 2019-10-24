package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Offre;
import metier.IOffre;
import metier.OffreImpl;

/**
 * Servlet implementation class ControlerOffreCat
 */
@WebServlet("/ControlerOffreCat")
public class ControlerOffreCat extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IOffre metier;

	public void init() throws ServletException {
		metier= new OffreImpl();
			}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mc = request.getParameter("cat");
		
		
		OffreModel model=new OffreModel();
		List<Offre> offres=metier.offreParCat(mc);
		
		
		System.out.println(mc);
		request.setAttribute("model", model);
		model.setOffres(offres);
		request.getRequestDispatcher("offrescat.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
