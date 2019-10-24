package web_port;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entities.Session_Info;
import entities.Session_Info_Port;
import model.Loginp;

/**
 * Servlet implementation class ControlerLogInp
 */
//@WebServlet("/ControlerLogInp")

public class ControllerLogInp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerLogInp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		Loginp obj_Login=new Loginp();
		boolean flag=obj_Login.check_connection(request);
		Session_Info_Port Info=obj_Login.get_Info(request);
		System.out.println(Info.getAdresse());
		System.out.println(Info.getId());
		//System.out.println(Info.getAdresse());
		
		if(flag){
			
			session.setAttribute("user_session", Info);
			request.getRequestDispatcher("PorteurHome.jsp").forward(request,response);
		}
		else {
			System.out.println("ouups");
			request.getRequestDispatcher("loginp.jsp").forward(request,response);
		}
		doGet(request, response);
	}

	}

