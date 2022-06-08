

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    private static Connection connection = null;

    public static Connection getConnection(){

        if(connection == null){
            try{
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3336/classicmodels?user=root&password=root"
                        + "&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        return connection;
    }

    public static void closeConnection(){

        if(connection != null){

            try{
                connection.close();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }


        }




    }


}
