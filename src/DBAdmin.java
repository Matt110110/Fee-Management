import java.sql.*;

public class DBAdmin {
    static PreparedStatement ps;

    private static Connection createConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=FeeManagement;user=Admin;password=Pass@123");
    }

    public static boolean verify(String username, String password) {
        boolean status = false;
        try {
            Connection cn = createConnection();
            ps = cn.prepareStatement("SELECT * FROM adminCreds WHERE userId=? AND password=?");
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
        Connection cn = createConnection();
        ps = cn.prepareStatement("SELECT * FROM userDetails WHERE userId=?");
        ps.setString(1, u.getUserName());
        ResultSet rs = ps.executeQuery();
        boolean b = rs.next();
        cn.close();
        return b;
    }

    public static int enterData(User u) throws SQLException, ClassNotFoundException {
        Connection cn = createConnection();
        ps = cn.prepareStatement("INSERT INTO userDetails VALUES (?,?,?,?,?,?)");
        ps.setString(1, u.getUserName());
        ps.setString(2, u.getFname());
        ps.setString(3, u.getLname());
        ps.setString(4, u.getEmail());
        ps.setString(5, u.getPassword());
        ps.setString(6, u.getContact());
        return ps.executeUpdate();
    }
}
