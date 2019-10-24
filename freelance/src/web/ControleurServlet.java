package web;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import metier.GestionImp;
import metier.IGestion;
import model.Login;
import model.Loginp;
import entities.Freelancer;
import entities.PorteurDeProjet;
import entities.Session_Info;
import entities.Session_Info_Port;

public class ControleurServlet extends HttpServlet {
	private IGestion metier;

	public void init() throws ServletException {
		metier= new GestionImp();
			}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PersonneModel model=new PersonneModel();
		req.setAttribute("model", model);
		String action= req.getParameter("action");
		
		HttpSession session=req.getSession();
		Login obj_Login=new Login();
		
		Session_Info Info=obj_Login.get_Info(req);
		System.out.println(Info.getAdresse());

		
		
			
		if(action.equals("savef")) {
			try {
			model.getFreelancer().setNom(req.getParameter("nom"));
			model.getFreelancer().setPrenom(req.getParameter("prenom"));
			model.getFreelancer().setAdresse(req.getParameter("adresse"));
			model.getFreelancer().setTel(Integer.parseInt(req.getParameter("tel")));
			model.getFreelancer().setMail(req.getParameter("mail"));
			model.getFreelancer().setMdp(req.getParameter("mdp"));
			model.getFreelancer().setDate(req.getParameter("date"));
			model.getFreelancer().setSexe(req.getParameter("sexe"));
			metier.addFreelancer(model.getFreelancer());

			model.setFreelancer((Freelancer) metier.listFreelancer());}
			catch(Exception e) {
				model.setErrors(e.getMessage());
			}
			
			session.setAttribute("user_session", Info);
			req.getRequestDispatcher("FreelancerHome.jsp").forward(req,resp);	
		}
		
		PersonneModel model1=new PersonneModel();
		req.setAttribute("model", model1);
		String action1= req.getParameter("action");
		
		
		Loginp obj_Loginp=new Loginp();
		Session_Info_Port Info_port=obj_Loginp.get_Info(req);
		
		if(action1.equals("savep")) {
			try {
			model1.getPorteurDeProjet().setNom(req.getParameter("nom"));
			model1.getPorteurDeProjet().setPrenom(req.getParameter("prenom"));
			model1.getPorteurDeProjet().setAdresse(req.getParameter("adresse"));
			model1.getPorteurDeProjet().setTel(Integer.parseInt(req.getParameter("tel")));
			model1.getPorteurDeProjet().setMail(req.getParameter("mail"));
			model1.getPorteurDeProjet().setMdp(req.getParameter("mdp"));
			model.getPorteurDeProjet().setDate(req.getParameter("date"));
			model.getPorteurDeProjet().setSexe(req.getParameter("sexe"));
			metier.addPorteurDeProjet(model1.getPorteurDeProjet());

			model.setPorteurDeProjet((PorteurDeProjet)metier.listPorteurDeProjet());}
			catch(Exception e) {
				model.setErrors(e.getMessage());
			}
			
			session.setAttribute("user_session", Info_port);
			req.getRequestDispatcher("AddPic.jsp").forward(req,resp);	

	
		}
		
		
		
	}
	
	

	
}