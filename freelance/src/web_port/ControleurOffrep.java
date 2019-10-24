package web_port;

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
import metierp.IOffrep;
import metierp.OffreImpp;
import web.OffreModel;

/**
 * Servlet implementation class ControleurOffrep
 */
//@WebServlet("/PorteurHome.php")
public class ControleurOffrep extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IOffrep metier;

	public void init() throws ServletException {
		metier= new OffreImpp();
			}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControleurOffrep() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String mc = request.getParameter("id");
		int valeur = Integer.parseInt(mc);
		
		OffreModel model=new OffreModel();
		List<Offre> offres=metier.offreParMC(valeur);
		
		
		System.out.println(valeur);
		request.setAttribute("model", model);
		model.setOffres(offres);
		request.getRequestDispatcher("OffresPort.jsp").forward(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("OffresPort.jsp").forward(request,response);

		doGet(request, response);
		
	}

}