import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;
@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/pizza-order.jsp").forward(request,response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String crust = request.getParameter(("crust"));
        request.setAttribute("crust", crust);
        System.out.println("Crust: " + crust);
        String sauce = request.getParameter(("sauce"));
        request.setAttribute("sauce", sauce);
        System.out.println("Sauce: " + sauce);
        String size = request.getParameter(("size"));
        request.setAttribute("size", size);
        System.out.println("Size: " + size);
        String toppings = request.getParameter(("toppings"));
        request.setAttribute("toppings", toppings);
        System.out.println("Toppings: " + toppings);
    }
}
