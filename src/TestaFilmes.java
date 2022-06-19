import java.sql.*;

public class TestaFilmes {
    public static void main(String[] args) throws SQLException {

        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection con = connectionFactory.recuperarConexao();

        Statement stm = con.createStatement();
        stm.execute("Select * from tbfilmes");
        ResultSet rst = stm.getResultSet();

        while(rst.next()){

        }
    }
}
