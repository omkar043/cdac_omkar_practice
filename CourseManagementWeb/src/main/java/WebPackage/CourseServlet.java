package WebPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CourseServlet
 */

@WebServlet("/courseLogin")
public class CourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		    response.setContentType("text/html");
		    PrintWriter out = response.getWriter();
		    
		    String CourseID = request.getParameter("cid");
		    String CourseName = request.getParameter("cname");
		    String  CourseFee = request.getParameter("cp");
		    String CourseDuration = request.getParameter("cdur");
		    
		    String htmlRespone = "<html>";
	        htmlRespone += "<h2>Your CourseID is: " + CourseID + "<br/>";      
	        htmlRespone += "   Your Course Name is: " + CourseName  + "<br/>"; 
	        htmlRespone +=  "  Your Course Course Fee is: " + CourseFee  + "<br/>"; 
	        htmlRespone +=  "  Your Course Course Duration is: " + CourseDuration +"</h2>";
	        htmlRespone += "</html>";
		    
	        out.println(htmlRespone);
		    
	      
	}

}
