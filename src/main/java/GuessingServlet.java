import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "GuessingServlet", urlPatterns = "/guess")
public class GuessingServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("guessing.jsp").forward(req, resp);
        }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int guess = Integer.parseInt(request.getParameter("numGuess"));
        if (guess < 1 || guess > 3) {
            response.sendRedirect(request.getContextPath() + "/guess");
            return;
        }
    }
}
