import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.List;
public class MySQLAdsDao implements Ads {
    private Connection connection;
    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/adlister_db?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                    "codeup"
            );
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return ads;
    }
    @Override
    public List<Ad> all() {
        return null;
    }
    @Override
    public Long insert(Ad ad) {
        return null;
    }
}
