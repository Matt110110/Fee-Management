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

        // TODO : Create a check for valid roll number and add roll number
        try {
            System.out.println(DBUser.getRoll());

//            TODO : Use the second constructor for this application
            Student s = new Student((DBUser.getRoll() + 1), request.getParameter("name"), request.getParameter("email"), request.getParameter("sex"), request.getParameter("course"), Integer.parseInt(request.getParameter("fee")), Integer.parseInt(request.getParameter("paid")), Integer.parseInt(request.getParameter("due")), request.getParameter("address"), request.getParameter("contact"));

            // TODO : Create proper pages to redirect.
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
