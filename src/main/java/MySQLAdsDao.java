import com.mysql.cj.jdbc.Driver;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class MySQLAdsDao implements Ads {
    private Connection connection;
    public MySQLAdsDao(Config config) {
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/adlister_db?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                    "codeup");
    }
    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList();
        String selectQuery = "SELECT * FROM ads";
        try{
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/adlister_db?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                    "codeup");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectQuery);
            While (resultSet.next()) {
                ads.add(new Ad(resultSet.getString("url"),resultSet.getString("username"), resultSet.getString("password"),))
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public Long insert(Ad ad) {
        return null;
    }
}
