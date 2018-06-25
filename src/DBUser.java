import java.sql.*;

public class DBUser {
    static Connection cn;
    static PreparedStatement ps;

    public static boolean verify(String username, String password) {
        boolean status = false;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=FeeManagement;user=Admin;password=Pass@123");
            ps = cn.prepareStatement("SELECT * FROM userDetails WHERE userId=? AND password=?");
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            status = rs.next();
            cn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return status;
    }

    public static boolean validateUsername(User u) throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=FeeManagement;user=Admin;password=Pass@123");
        ps = cn.prepareStatement("SELECT * FROM userDetails WHERE userId=?");
        ps.setString(1, u.getUserName());
        ResultSet rs = ps.executeQuery();
        boolean b = rs.next();
        cn.close();
        return b;
    }
}
