import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "PageCountServlet", urlPatterns = "/count")
public class PageCountServlet extends HttpServlet {

    long pageViews = 0;
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        pageViews++;
        PrintWriter out = res.getWriter();
        out.println("" + pageViews + "");
    }
}
