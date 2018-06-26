import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddStudent", urlPatterns = {"/AddStudent"})
public class AddStudent extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        char sex = request.getParameter("sex").charAt(0);
        String course = request.getParameter("course");
        int fees = Integer.parseInt(request.getParameter("fee"));
        int paid = Integer.parseInt(request.getParameter("paid"));
        int due = Integer.parseInt(request.getParameter("due"));
        String address = request.getParameter("address");
        String contact = request.getParameter("contact");
        System.out.println(fname + lname + email + sex + course + fees + paid + due + address + contact);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
