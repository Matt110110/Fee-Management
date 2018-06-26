import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "AddStudent", urlPatterns = {"/AddStudent"})
public class AddStudent extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fname = request.getParameter("name");
        String email = request.getParameter("email");
        String sex = request.getParameter("sex");
        String course = request.getParameter("course");
        int fees = Integer.parseInt(request.getParameter("fee"));
        int paid = Integer.parseInt(request.getParameter("paid"));
        int due = Integer.parseInt(request.getParameter("due"));
        String address = request.getParameter("address");
        String contact = request.getParameter("contact");
        /**
         *Delete debugging code after debugging is over
         */
        System.out.println(fname + "\n" + email + "\n" + sex + "\n" + course + "\n" + fees + "\n" + paid + "\n" + due + "\n" + address + "\n" + contact);
        try {
            System.out.println(DBUser.getRoll());
            Student s = new Student(request.getParameter("name"), request.getParameter("email"), request.getParameter("sex"), request.getParameter("course"), Integer.parseInt(request.getParameter("fee")), Integer.parseInt(request.getParameter("paid")), Integer.parseInt(request.getParameter("due")), request.getParameter("address"), request.getParameter("contact"));
            if (DBUser.enterData(s) != 0) {
                response.sendRedirect("index.jsp");
            } else {
                response.sendRedirect("AdminMain.html");
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
