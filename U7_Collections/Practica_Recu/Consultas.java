import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Consultas {

    public static List<Product> getProductLines(Double price){

        Connection connection = ConexionDB.getConnection();
        ArrayList<Product> list = new ArrayList<>();

        try{

            PreparedStatement preparedStatement = connection.prepareStatement("select p.productName , p.productLine , p.buyPrice \n" +
                    "from products p where buyPrice < ?;");

            preparedStatement.setDouble(1,price);

            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next()){

                Product product = new Product();
                product.setProductname(rs.getString(1));
                product.setProductLine(rs.getString(2));
                product.setBuyPrice(rs.getDouble(3));
                list.add(product);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return list;
    }





}
