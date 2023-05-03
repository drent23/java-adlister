import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;
@WebServlet(name = "ViewColorServlet", urlPatterns = "/viewcolor")
public class ViewColorServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/viewcolor.jsp").forward(request,response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String crust = request.getParameter(("crust"));
        request.setAttribute("crust", crust);
        String sauce = request.getParameter(("sauce"));
        request.setAttribute("sauce", sauce);
        String size = request.getParameter(("size"));
        request.setAttribute("size", size);
        String toppings = request.getParameter(("toppings"));
        request.setAttribute("toppings", toppings);
    }
}
