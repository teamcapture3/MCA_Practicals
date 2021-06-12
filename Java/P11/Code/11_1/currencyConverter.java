import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/currencyConverter")
public class currencyConverter extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            Double amt=Double.parseDouble(request.getParameter("amt"));
            String currency=request.getParameter("curr");
            if(currency.equals("U.S.Dollar(USD)"))
            {out.println("<h3><center><br><br>U.S.Dollar(USD) &nbsp"+amt+"&nbsp&nbsp&nbsp = &nbsp&nbsp&nbsp"+amt*73.80+"&nbsp INR</center></h3>");} 
            else if(currency.equals("European Euro(EUR)"))
            {out.println("<h3><center><br><br>European Euro(EUR) &nbsp"+amt+"&nbsp&nbsp&nbsp = &nbsp&nbsp&nbsp"+amt*89.45+"&nbsp INR</center></h3>");} 
            if(currency.equals("British Pound(GBP)"))
            {out.println("<h3><center><br><br>British Pound(GBP) &nbsp"+amt+"&nbsp&nbsp&nbsp = &nbsp&nbsp&nbsp"+amt*99.17+"&nbsp INR</center></h3>");} 
            if(currency.equals("Japanese Yen"))
            {out.println("<h3><center><br><br>Japanese Yen &nbsp"+amt+"&nbsp&nbsp&nbsp = &nbsp&nbsp&nbsp"+amt*0.71+"&nbsp INR</center></h3>");}            
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}

