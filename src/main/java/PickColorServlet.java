import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "PickColorServlet", urlPatterns = "/pickcolor")
public class PickColorServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //When the user gets to /pickcolor .. .
        //Show them my JSP
        req.getRequestDispatcher("pickcolor.jsp").forward(req, resp);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String colorpick = request.getParameter("colorpick");
        response.sendRedirect("/viewcolor?color=" + colorpick);
    }
}
