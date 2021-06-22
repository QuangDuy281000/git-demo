package test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/test")
public class homeSevelet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        List<users> list = dao.cc();
        out.println("<head>");
        out.println("<title>ket qua</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<table border=1>");
        for (users s : list) {
            out.println("<tr>");
            out.println("<td>" + s.getName() + "</td>" + "</br>");
            out.println("<td>" + s.getPass() + "</td>");
            out.println("</tr");
        }
        out.println("</table>");
        out.println("</body>");

    }
}

