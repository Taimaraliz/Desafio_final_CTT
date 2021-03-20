package br.com.cadastro;

import java.sql.Connection;
import java.sql.DriverManager;

    public class ConnectionFactory {
        private static final String Username = "root";
        private static final String Password = "tai861247";
        private static final String Database_URL = "jdbc:mysql://localhost:3306/db_usuario";

        private static String myDriver = "com.mysql.cj.jdbc.Driver";

        public static Connection createConnectionToMySQL() throws Exception {
            Class.forName(myDriver);

            //conexão com o banco de dados
            Connection connection = DriverManager.getConnection(Database_URL, Username,Password);

            return connection;
        }
        public static void main (String[] args) throws Exception {

            //Connection conn = ConnectionFactory.createConnectionToMysql(); // Recuperar uma conexão com o banco de dados.

            try (Connection conn = createConnectionToMySQL()) {

                if (conn != null) {
                    System.out.println("Conexão realizada com sucesso");
                    conn.close();
                }
            }catch (Exception e){
                System.out.println("Got an exception!");
                System.out.println(e.getMessage());
            }
        }

    }

