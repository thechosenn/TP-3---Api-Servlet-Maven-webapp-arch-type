package ma.bankati.web.controleur;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.catalina.filters.ExpiresFilter;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/home", loadOnStartup = 1)
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse response)
            throws ServletException, IOException {
        req.getRequestDispatcher("/SecondControleur").forward(req, response);
    }

/**
 @Override public void init() throws ServletException {
 super.init();
 System.out.println("init...");
 }

 @Override protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 super.service(req, resp);
 }

 @Override protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 req.getRequestDispatcher("/SecondController").forward(req, resp);
 }**/
}
