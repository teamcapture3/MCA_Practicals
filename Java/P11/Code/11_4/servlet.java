import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet")
public class servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public servlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter pr = response.getWriter();
		pr.print(
				  "<form method=\"post\" action=\"servlet\">"
				  + "Name: <input type=\"text\" name=\"name\"><br><br>"
				  + "Email: <input type=\"text\" name=\"email\"><br><br>"
				  + "Phone number: <input type=\"text\" name=\"phone\"><br><br>"
				  + "<input type=\"submit\" value=\"submit\"></form>"
				);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		String Name,Email,Phone;
		Name = request.getParameter("name");
		Email = request.getParameter("email");
		Phone = request.getParameter("phone");
		
		PrintWriter pr = response.getWriter();
		pr.print("<h3>Your name:"+Name+"</h3>"
				+ "<h3>Your Email:"+Email+"</h3>"
				+ "<h3>Your Phone no:"+Phone+"</h3>"
				);
	}

}
