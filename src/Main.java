import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        UerMethods uerMethods = new UerMethods();
        try {
            while (true) {
                System.out.println("menyu : " +
                        "1.list users" +
                        "2.update user" +
                        "3.delete user" +
                        "4.add user" +
                        "5.HECNE CIX");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        uerMethods.listUsers();
                        break;
                    case 2:
//                        uerMethods.updateUser();
                        break;
                    case 3:
//                        uerMethods.deleteUser();
                        break;
                    case 4:
//                        uerMethods.addUser();
                        break;
                    case 5:
                        System.exit(1);
                        break;
                    default:
                        System.out.println("pls dogru secim etdaa");
                        break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        finally {
//            if (uerMethods !=null){
//                uerMethods.closeConnection();
//            }
//        }
    }
}

