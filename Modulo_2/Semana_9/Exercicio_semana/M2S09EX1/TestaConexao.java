import java.sql.*;

public class TestaConexao {
    public static void main(String[] args) {
        String connectionString = "jdbc:oracle:thin:@localhost:1521/xe";
        String user = "VICENTE2";
        String password = "0r4cl3Cl0ud*";
        try (Connection connection = DriverManager.getConnection(connectionString,user,password)){
            System.out.println("Conecato no banco " + connection.getSchema());
            Statement stm = connection.createStatement();
            stm.execute("SELECT * FROM produtos");
            ResultSet result = stm.getResultSet();

            while (result.next()) {
                int id = result.getInt("id");
                String nome = result.getString("nome");
                String descricao = result.getString("descricao");
                System.out.printf("ID: %d, NOME: %s, DESCRICAO: %s \n", id, nome,descricao );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}