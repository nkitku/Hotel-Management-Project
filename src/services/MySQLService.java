package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Arrays;

/**
 * MySQLService as Singleton Class
 *
 */
public class MySQLService {

    private final Connection connection;
    private static MySQLService INSTANCE;

    private MySQLService() throws SQLException {
        URL url = getClass().getProtectionDomain().getCodeSource().getLocation();
        String filepath = url.toString().replace("file:/", "").replace("Hotel.jar", "");
        String txt = this.readFile(filepath + "/../configs/mysql.txt");
        System.out.println(url);
        System.out.println(txt);
        if (txt == null) {
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
        } else {
            String[] mysqlConfig = txt.split(System.getProperty("line.separator"));
            System.out.println(Arrays.toString(mysqlConfig));
            // TA.read(new FileReader("C:\\password.txt"), null);
            // Class.forName("com.mysql.jdbc.Driver");
            // con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", TA.getText());
            this.connection = DriverManager.getConnection(mysqlConfig[0].trim(), mysqlConfig[1].trim(), mysqlConfig[2].trim());
        }

    }

    private String readFile(String fileName) {
        try {
            // InputStreamReader n = new InputStreamReader(getClass().getResourceAsStream(fileName));
            // InputStreamReader n = new InputStreamReader(new FileInputStream(fileName));
            final FileReader n = new FileReader(fileName);
            final BufferedReader reader = new BufferedReader(n);
            final StringBuilder stringBuilder = new StringBuilder();
            final String ls = System.getProperty("line.separator");
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }
            // delete the last new line separator
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            reader.close();

            return stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }

    public Connection getConnection() throws SQLException {
        return this.connection;
    }

    public static MySQLService getInstance() throws SQLException {
        if (MySQLService.INSTANCE == null) {
            System.out.println("Creating new MySQLService instance");
            MySQLService.INSTANCE = new MySQLService();
        } else {
            System.out.println("Using existing MySQLService instance");
        }
        return MySQLService.INSTANCE;
    }
}
