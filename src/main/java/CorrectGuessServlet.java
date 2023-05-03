import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
@WebServlet(name = "GuessingServlet", urlPatterns = "/guess")
public class CorrectGuessServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String colorpick = request.getParameter("color");
        request.setAttribute("colorToPage", colorpick);
        request.getRequestDispatcher("viewcolor.jsp").forward(request, response);
    }
}
