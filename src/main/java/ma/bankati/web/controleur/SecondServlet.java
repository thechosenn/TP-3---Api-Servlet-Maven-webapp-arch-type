package ma.bankati.web.controleur;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SecondControleur")
public class SecondServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse response)
            throws ServletException, IOException {
        String page = "" +
                "<!DOCTYPE html>" +
                "<html>" +
                "<head>" +
                "<title>Hello World</title>" +
                "</head>" +
                "<body>" +
                "<h1>Bonjour mes Amis ^_^</h1>" +
                "<h2>Ceci est une page generee a partir de notre Servlet</h2>" +
                "<ul>" +
                "<li>Protocole : " + req.getProtocol() + "</li>" +
                "<li>Serveur : " + req.getServerName() + "</li>" +
                "<li>Port : " + req.getServerPort() + "</li>" +
                "<li>Methode : " + req.getMethod() + "</li>" +
                "<li>idCompte : " + req.getParameter("idCompte") + "</li>" +
                "</ul>" +
                "</body>" +
                "</html>";
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println(page);
    }

}
