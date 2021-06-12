import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/login")
public class login extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("deprecation")
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out=response.getWriter();	
		String name=request.getParameter("user");
		String pass=request.getParameter("pass");
		if(name.equals("ninad") && pass.equals("12345678"))
		{
			HttpSession session=request.getSession(true);
			session.putValue("username",name);
			response.sendRedirect(request.getContextPath()+"/login2");
		}
		else
		{
			out.println("Credentials are not correct");
		}
	}
}
