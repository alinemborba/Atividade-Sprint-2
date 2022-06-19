import java.sql.*;
import java.util.Scanner;

public class TestaProdutos {
    public static void main(String[] args) throws SQLException {

        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection con = connectionFactory.recuperarConexao();

        Statement stm = con.createStatement();
        stm.execute("Select * from tbprodutos");
        ResultSet rst = stm.getResultSet();

        Scanner entrada = new Scanner(System.in);

        int perguntas = 1;
        double[] opcoes = new double[perguntas];


        System.out.println("Qual operação você deseja realizar?");
        System.out.println("[1] Cadastrar");
        System.out.println("[2] Atualizar");
        System.out.println("[3] Excluir");
        opcoes[0] = entrada.nextDouble();

        while(rst.next()){
            Statement stm1 = con.createStatement();
             if (opcoes[0] == 1){
                 stm1.execute("Insert into tbprodutos (ID, Nome, Descrição, Quantidade, Preço) values (2001, 'Chocolate Garoto', 'Chocolate meio amargo, 95g', '11', 4.99)");
                 stm1.execute("Insert into tbprodutos (ID, Nome, Descrição, Quantidade, Preço) values (2002, 'Chocolate Lacta', 'Chocolate ao leite, 90g', '15', 5.99)");
                 stm1.execute("Insert into tbprodutos (ID, Nome, Descrição, Quantidade, Preço) values (2003, 'Chocolate Milka', 'Chocolate ao leite com cookies, 150g', '21', 16.99)");
                 System.out.println("Três produtos cadastrados");
             }

             if (opcoes[0] == 2){
                 Statement stm2 = con.createStatement();
                 System.out.println("Produto editado");
                 stm2.execute("UPDATE tbprodutos SET DESCRIÇÃO = 'Chocolate branco, 100g' WHERE ID = 2001");
             }

             if (opcoes[0] == 3){
                 Statement stm3 = con.createStatement();
                 System.out.println("Produto excluido");
                 stm3.execute("DELETE FROM tbprodutos WHERE ID = 2002");
             }

        }

        con.close();

    }
}
