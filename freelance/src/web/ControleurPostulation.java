 package web;

import java.io.IOException;

import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entities.Offre;
import entities.Session_Info;
import metier.IOffre;
import metier.OffreImpl;
import model.Login;
import entities.Session_Info;
public class ControleurPostulation extends HttpServlet {
	private IOffre metier;

	public void init() throws ServletException {
		metier= new OffreImpl();
			}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String mc = req.getParameter("id");
		int valeur = Integer.parseInt(mc);
		OffreModel model=new OffreModel();
		List<Offre> offres=metier.offreParMC(valeur);
		model.setOffres(offres);
		System.out.println(valeur);
		req.setAttribute("model", model);
		
	
		req.getRequestDispatcher("postuler.jsp").forward(req,resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("postuler.jsp").forward(req,resp);
		doGet(req, resp);

		}
		
		
		
	}

	