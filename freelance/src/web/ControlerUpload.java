package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import entities.Session_Info;

import java.io.File;

public class ControlerUpload extends HttpServlet {
  
		private static final long serialVersionUID = 1L;


		    private static final String DATA_DIRECTORY = "data";
		    private static final int MAX_MEMORY_SIZE = 1024 * 1024 * 2;
		    private static final int MAX_REQUEST_SIZE = 1024 * 1024;
	    public ControlerUpload() {
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
			  PrintWriter out = response.getWriter();
			  String mc = request.getParameter("id");
				int valeur = Integer.parseInt(mc);
			  if(!ServletFileUpload.isMultipartContent(request)){
			   out.println("Nothing to upload");
			   return; 
			  }
			  FileItemFactory itemfactory = new DiskFileItemFactory(); 
			  ServletFileUpload upload = new ServletFileUpload(itemfactory);
			  try{
			   List<FileItem>  items = upload.parseRequest(request);
			   for(FileItem item:items){
			     
			    String contentType = item.getContentType();
			    if(!contentType.equals("image/png")){
			     System.out.println("only png format image files supported");
			     continue;
			    }
			    File uploadDir = new File("C:\\Users\\hanaa\\eclipse-workspac\\freelance\\WebContent\\images");
		        
		        File file = new File("C:\\Users\\hanaa\\eclipse-workspac\\freelance\\WebContent\\images\\"+valeur+".png");
			    
			    item.write(file);
			    String img= file.getPath();
			    out.println("File Saved Successfully"+img);
			    request.setAttribute("image", file.getPath());
				request.getRequestDispatcher("FreelancerHome.jsp").forward(request,response);	


			   }
			  }
			  catch(FileUploadException e){
			    
			   out.println("upload fail");
			  }
			  catch(Exception ex){
			    
			   out.println(ex);
			  }
				

			 }

	    }