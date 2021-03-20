package br.com.cadastro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {


        public static void main(String[] args) throws SQLException {

            try {
                Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_usuario",
                        "root", "tai861247");

                System.out.println("Conectado!");

                conexao.close();

            } catch (SQLException s) {
                System.out.println("Não foi possível conectar ao banco");
            }
        }
}

