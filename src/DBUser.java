import java.sql.*;

public class DBUser {
    private static PreparedStatement ps;

    private static Connection createConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=FeeManagement;user=Admin;password=Pass@123");
    }

    public static boolean verify(String username, String password) {
        boolean status = false;
        try {
            Connection cn = createConnection();
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

    public static int getRoll() throws SQLException, ClassNotFoundException {
        Connection cn = createConnection();
        ps = cn.prepareStatement("SELECT COUNT(*) FROM studDetails");
        ResultSet rs = ps.executeQuery();
        rs.next();
        return rs.getInt(1);
    }

    public static boolean isCorrectRoll(Student s) throws SQLException, ClassNotFoundException {
        Connection cn = createConnection();
        ps = cn.prepareStatement("SELECT * FROM studDetails WHERE rollNo=?");
        ps.setInt(1, s.getRollno());
        ResultSet rs = ps.executeQuery();
        boolean b = rs.next();
        cn.close();
        return b;
    }

    public static int enterData(Student s) throws SQLException, ClassNotFoundException {
        Connection cn = createConnection();
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

    public static Student searchStudent(Student s) throws SQLException, ClassNotFoundException {
        Connection cn = createConnection();
        ps = cn.prepareStatement("SELECT * FROM studDetails WHERE rollNo=(?)");
        ps.setInt(1, s.getRollno());
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            s.setName(rs.getString(2));
            s.setEmail(rs.getString(3));
            s.setSex(rs.getString(4));
            s.setCourse(rs.getString(5));
            s.setFee(rs.getInt(6));
            s.setPaid(rs.getInt(7));
            s.setDue(rs.getInt(8));
            s.setAddress(rs.getString(9));
            s.setContact(rs.getString(10));
        }
        cn.close();
        return s;
    }

    public static int deleteStudent(Student s) throws SQLException, ClassNotFoundException {
        Connection cn = createConnection();
        ps = cn.prepareStatement("DELETE FROM studDetails WHERE rollNo=(?)");
        ps.setInt(1, s.getRollno());
        return ps.executeUpdate();
    }

    public static Student getDues(Student s) throws SQLException, ClassNotFoundException {
        Connection cn = createConnection();
        ps = cn.prepareStatement("SELECT name,course,due FROM studDetails WHERE rollNo=(?)");
        ps.setInt(1, s.getRollno());
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            s.setName(rs.getString(1));
            s.setCourse(rs.getString(2));
            s.setDue(rs.getInt(3));
        }
        return s;
    }
}
