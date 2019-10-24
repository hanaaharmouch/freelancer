package web_port;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Offre;
import entities.PorteurDeProjet;
import entities.Postulation;
import metier.PostulationImp;
import metierp.IPostulationp;
import metierp.PosulationImpp;
import web.OffreModel;
import web.PostModel;
import metier.IPostulation;

/**
 * Servlet implementation class ControleurPostulationp
 */
//@WebServlet("/Postulationp")
public class ControleurPostulationp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IPostulationp metier;

	public void init() throws ServletException {
		metier= new PosulationImpp();
			}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControleurPostulationp() {
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
		request.getRequestDispatcher("Postulationp.jsp").forward(request,response);
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
		request.getRequestDispatcher("Postulationp.jsp").forward(request,response);
	}

}
