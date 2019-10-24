package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Postulation;
import metier.IPostulationsFr;
import metier.PostulationsFrImp;
import metierp.IPostulationp;
import metierp.PosulationImpp;
import web.PostModel;

/**
 * Servlet implementation class ControlerPostFreelancer
 */
//@WebServlet("/PostulationsFreelancer.php")
public class ControlerPostFreelancer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IPostulationsFr metier;

	public void init() throws ServletException {
		metier= new PostulationsFrImp();
			}   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControlerPostFreelancer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String mc = request.getParameter("id");
		int valeur = Integer.parseInt(mc);
		PostModel model=new PostModel();
		List<Postulation> postulations=metier.postulationParMC(valeur);
		model.setPostulations(postulations);
		System.out.println(valeur);
		request.setAttribute("model", model);
		request.getRequestDispatcher("postulationF.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PostModel model=new PostModel();
		System.out.println("Conne");
		//model.setMotCle(req.getParameter("motCle"));
		List<Postulation> postulations=metier.listpost();
		model.setPostulations(postulations);
		request.setAttribute("model", model);
		request.getRequestDispatcher("postulationF.jsp").forward(request,response);
	}
}
