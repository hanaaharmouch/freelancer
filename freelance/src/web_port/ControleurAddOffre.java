package web_port;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Offre;
import entities.Postulation;
import metier.IPostulation;
import metier.PostulationImp;
import metierp.AddOffreImp;
import metierp.IAddOffre;
import web.OffreModel;
import web.PostModel;
import metier.IPostulation;
import metier.PostulationImp;
/**
 * Servlet implementation class ControleurAddOffre
 */
//@WebServlet("/ControleurAddOffre")
public class ControleurAddOffre extends HttpServlet {
private IAddOffre metier;
	
	public void init() throws ServletException {
		metier=  new AddOffreImp();
			}
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		OffreModel model=new OffreModel();
		req.setAttribute("model1", model);
		String action= req.getParameter("action");
		if(action.equals("ajouterOffre")) {
			try {
				
			String mc = req.getParameter("id");
			int valeur = Integer.parseInt(mc);
		
			//model.getPostulation().setId_postulation(Integer.parseInt(req.getParameter("budget")));
			model.getOffre().setIdPort(valeur);
			model.getOffre().setCategorie(req.getParameter("categorie"));
			model.getOffre().setBudget(Integer.parseInt(req.getParameter("budget")));
			model.getOffre().setDure(req.getParameter("dure"));
			model.getOffre().setProjet(req.getParameter("projet"));
			
			metier.addOffre(model.getOffre());
			System.out.println(valeur);

			model.setOffre((Offre) metier.listPost());}
			catch(Exception e) {
				model.setErrors(e.getMessage());
			}
			
		}
		
		req.getRequestDispatcher("PorteurHome.jsp").forward(req,resp);	
		
	}
}
