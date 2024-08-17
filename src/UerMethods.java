import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UerMethods {

    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "admin";
    private Connection connection;

    public UerMethods() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new SQLException("yuklenmeyib.");
        }
        this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public List<Users> listUsers() throws SQLException {
        String sql = "SELECT * FROM users";
        List<Users> list = new ArrayList<>();
        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Users users = new Users(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getInt("age"));
                list.add(users);
                System.out.println(users);
            }
        } catch (SQLException e) {
            System.out.println("sehvdir");
        }
        return list;
    }

    public void updateUser(int id, String name, String email, int age) {

    }

    public void deleteUser(int id) {

    }

    public void findUserById(int id) {

    }


    public void addUser() {

    }
//    public Users finduserbyid(int id ){
//// mentiqini yaz
//    }

//    public void closeConnection(){
//
//    }


}


