package web;

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
import metier.IProjetsFreelancer;
import metier.OffreImpl;
import metier.ProjetsFreelancerImp;

/**
 * Servlet implementation class ControlerProjetsFreelancer
 */
//@WebServlet("/ProjetsFreelancer.php")
public class ControlerProjetsFreelancer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IProjetsFreelancer metier;

	public void init() throws ServletException {
		metier= new ProjetsFreelancerImp();
			}
    public ControlerProjetsFreelancer() {
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
		request.getRequestDispatcher("ProjetFreelancer.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProjetModel model=new ProjetModel();
		System.out.println("Conne");
		//model.setMotCle(req.getParameter("motCle"));
		List<Projet> projets=metier.listprojets();
		model.setProjets(projets);
		request.setAttribute("model", model);
		request.getRequestDispatcher("ProjetFreelancer.jsp").forward(request,response);
	}

}
