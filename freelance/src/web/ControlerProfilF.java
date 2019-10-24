package web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Freelancer;
import entities.Offre;
import entities.PorteurDeProjet;
import metier.IOffre;
import metier.IProfilF;
import metier.OffreImpl;
import metier.ProfilFImp;
import metier.SingletonConnection;
import web.OffreModel;
import web.PersonneModel;

/**
 * Servlet implementation class ControlerProfilP
 */
//@WebServlet("/ControlerProfilP")
public class ControlerProfilF extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IProfilF metier;

	public void init() throws ServletException {
		metier= new ProfilFImp();
			}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mc = request.getParameter("id");
		int val = Integer.parseInt(mc);
		PersonneModel model=new PersonneModel();
		Freelancer Freelancer=metier.FreelancerParMC(val);
		model.setFreelancer(Freelancer);
		request.setAttribute("model", model);
		request.getRequestDispatcher("ProfilF.jsp").forward(request,response);

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
