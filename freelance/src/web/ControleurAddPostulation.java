package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Postulation;
import metier.IPostulation;
import metier.PostulationImp;


public class ControleurAddPostulation extends HttpServlet {
       
	private IPostulation metier;
	
	public void init() throws ServletException {
		metier= new PostulationImp();
			}
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PostModel model=new PostModel();
		req.setAttribute("model1", model);
		String action= req.getParameter("action");
		if(action.equals("postuler")) {
			try {
			String mc = req.getParameter("id");
			String mc1= req.getParameter("idf");
			String mc2= req.getParameter("nomf");
			String mc3= req.getParameter("prenomf");
			String mc4= req.getParameter("np");
			int valeur = Integer.parseInt(mc);
			int valeur1 = Integer.parseInt(mc1);
		System.out.println(valeur1);
			//model.getPostulation().setId_postulation(Integer.parseInt(req.getParameter("budget")));
			model.getPostulation().setId_offre(valeur);	
			model.getPostulation().setId_freelancer(valeur1);
			model.getPostulation().setNomf(mc2);
			model.getPostulation().setPrenomf(mc3);
			model.getPostulation().setNomp(mc4);
			model.getPostulation().setBudget(Integer.parseInt(req.getParameter("budget")));
			model.getPostulation().setDure(req.getParameter("dure"));
			model.getPostulation().setMotivation(req.getParameter("motivation"));
			
			metier.addPostulation(model.getPostulation());
			System.out.println(valeur);

			model.setPostulation((Postulation) metier.listPost());}
			catch(Exception e) {
				model.setErrors(e.getMessage());
			}
			
		}
		
		req.getRequestDispatcher("FreelancerHome.jsp").forward(req,resp);	
		
	}

}