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

    public static int enterData(User u) throws SQLException, ClassNotFoundException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=FeeManagement;user=Admin;password=Pass@123");
        ps = cn.prepareStatement("INSERT INTO userDetails VALUES (?,?,?,?,?,?)");
        ps.setString(1, u.getUserName());
        ps.setString(2, u.getFname());
        ps.setString(3, u.getLname());
        ps.setString(4, u.getEmail());
        ps.setString(5, u.getPassword());
        ps.setString(6, u.getContact());
        return ps.executeUpdate();
    }

    public static int getRoll() throws SQLException, ClassNotFoundException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=FeeManagement;user=Admin;password=Pass@123");
        ps = cn.prepareStatement("SELECT COUNT(*) FROM studDetails");
        ResultSet rs = ps.executeQuery();
        rs.next();
        return rs.getInt(1);
    }

    public static int enterData(Student s) throws SQLException, ClassNotFoundException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=FeeManagement;user=Admin;password=Pass@123");
        ps = cn.prepareStatement("INSERT INTO studDetails VALUES (?,?,?,?,?,?,?,?,?,?)");
        ps.setString(2, s.getName());
        ps.setString(3, s.getEmail());
        ps.setString(4, s.getSex());
        ps.setString(5, s.getCourse());
        ps.setString(9, s.getAddress());
        ps.setString(10, s.getContact());
        ps.setInt(1, s.getRollno());
        ps.setInt(6, s.getFee());
        ps.setInt(7, s.getPaid());
        ps.setInt(8, s.getDue());
        return ps.executeUpdate();
    }
}
