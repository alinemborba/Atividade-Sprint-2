import java.sql.*;
import java.util.Scanner;

public class TestaFilmes {
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);

        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection con = connectionFactory.recuperarConexao();

        Statement stm = con.createStatement();
        stm.execute("Select * from tbfilmes");
        ResultSet rst = stm.getResultSet();

        int filmes = 1;
        double[] numFilmes = new double[filmes];

        System.out.println("Para ver a lista de filmes, escolha:");
        System.out.println("Quantos filmes você quer ver por página?");
        System.out.println("[1] 5 filmes por página");
        System.out.println("[2] 10 filmes por página");
        System.out.println("[3] 20 filmes por página");
        numFilmes[0] = entrada.nextDouble();

        while (rst.next()) {
            Statement stm1 = con.createStatement();
            Integer codigo = rst.getInt("Código");
            String nome = rst.getString("Nome");
            String descricao = rst.getString("Descrição");
            int ano = rst.getInt("Ano");

            if (numFilmes[0] == 1) {
                stm1.execute("SELECT * FROM tbfilmes LIMIT 5");
            } else if (numFilmes[0] == 2) {
                stm1.execute("SELECT * FROM tbfilmes LIMIT 10");
            } else if (numFilmes[0] == 3) {
                stm1.execute("SELECT * FROM tbfilmes LIMIT 20");
            }

        }

        con.close();

    }
}
