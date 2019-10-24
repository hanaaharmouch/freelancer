package web_port;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Offre;
import entities.Projet;
import metier.IOffre;
import metier.OffreImpl;
import metierp.IProjetsPorteur;
import metierp.ProjetsPorteurImp;
import web.ProjetModel;

/**
 * Servlet implementation class ControlerProjetsFreelancer
 */
public class ControlerProjetPorteur extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IProjetsPorteur metier;

	public void init() throws ServletException {
		metier= new ProjetsPorteurImp();
			}
    public ControlerProjetPorteur() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mc = request.getParameter("id");
		int valeur = Integer.parseInt(mc);
		ProjetModel model=new ProjetModel();
		List<Projet> projets=metier.projetParMC(valeur);
		model.setProjets(projets);
		System.out.println(valeur);
		request.setAttribute("model", model);
		request.getRequestDispatcher("ProjetPorteur.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
