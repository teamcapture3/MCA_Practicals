import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/login2")
public class login2 extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out=response.getWriter();
        HttpSession session=request.getSession(true);
        @SuppressWarnings("deprecation")
		String name=(String)session.getValue("username");
        out.println(name+" logged in !!!");
    }
}
