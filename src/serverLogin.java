import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class serverLogin {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "your_database_name";
        String driver = "com.mysql.cj.jdbc.Driver";
        String userName = "your_username";
        String password = "your_password";
        String tableName = "your_table_name";

        System.out.println("Connecting to database...");

        try {
            Class.forName(driver).newInstance();

            Connection conn = DriverManager.getConnection(url + dbName, userName, password);

            System.out.println("Connected to the database successfully!");

            Statement statement = conn.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM " + tableName);

            while (resultSet.next()) {
                System.out.println("Username: " + resultSet.getString("username"));
                System.out.println("Password: " + resultSet.getString("password"));
            }

            statement.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

