package SecondDBAppsIntroduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.Properties;

public class ExersiceDB {
    public static void main(String[] args) throws SQLException, IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        Properties p = new Properties();
        p.setProperty("user", "root");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/soft_uni",p);

        PreparedStatement prep = connection.prepareStatement("SELECT * FROM addresses WHERE address_id > ?");

        String salary = console.readLine();
        prep.setInt(1,Integer.parseInt(salary));

        ResultSet resultSet = prep.executeQuery();

        while(resultSet.next()){
            System.out.println(resultSet.getString("address_text") + " "+ resultSet.getString("town_id"));
        }
    }
}
