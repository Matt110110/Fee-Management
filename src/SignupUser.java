import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/SignupUser")
public class SignupUser extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
            String username = request.getParameter("username");
            String firstname = request.getParameter("fname");
            String lastname = request.getParameter("lname");
            String email = request.getParameter("email");
            String password = request.getParameter("pass");
            String passwordVerification = request.getParameter("repeat-pass");
            String contact = request.getParameter("number");
            if (password.equals(passwordVerification)) {
                User user = new User(firstname, lastname, username, email, password, contact);
                try {
                    boolean b = DBUser.validateUsername(user);
                    if (b) {
                        response.sendRedirect("InvalidUname.html");
                    } else {
                        if (DBUser.enterData(user) == 1) {
                            // TODO : Add proper html pages instead of printing using PrintWriter
                            out.println("<html><body bgcolor='cyan'><center><h1>Records entered successfully.</h1><a href='./loginUser.html'><button class='btn-primary btn-lg btn-block'>Return...</button></a></body></html>");
                        } else {
                            // TODO : Add proper html pages instead of printing using PrintWriter
                            out.println("<html><body bgcolor='red'><center><h1>Records could not be entered</h1><a href='./loginUser.html'><button class='btn-primary btn-lg btn-block'>Return...</button></a></body></html>");
                        }
                    }
                } catch (SQLException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
            } else {
                response.sendRedirect("WrongPassword.html");
            }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
