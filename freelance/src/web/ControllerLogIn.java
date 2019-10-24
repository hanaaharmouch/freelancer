package web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Login;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.User;

import entities.Session_Info;
import metier.SingletonConnection;



/**
 * Servlet implementation class ControllerLogIn
 */
//@WebServlet("/ControllerLogIn")
public class ControllerLogIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerLogIn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		Login obj_Login=new Login();
		boolean flag=obj_Login.check_connection(request);
		Session_Info Info=obj_Login.get_Info(request);
		System.out.println(Info.getAdresse());
		//System.out.println(Info.getAdresse());
		
		if(flag){
			
			session.setAttribute("user_session", Info);
			request.getRequestDispatcher("FreelancerHome.jsp").forward(request,response);
		}
		else {
			System.out.println("ouups");
			request.getRequestDispatcher("login.jsp").forward(request,response);
		}
		doGet(request, response);
	}

}