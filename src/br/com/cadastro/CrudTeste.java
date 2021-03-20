package br.com.cadastro;

import java.sql.*;

public class CrudTeste {

        CadastroEstudantil List = new CadastroEstudantil();

        public void insert() {

            try {
                Connection conn = ConnectionFactory.createConnectionToMySQL();
                String query = "INSERT INTO usuario_1 (Nome,Cpf, Email, Date_create)" + "values(?, ?, ?,? )";

                PreparedStatement preparedStmt = conn.prepareStatement(query);


                preparedStmt.setString(1, List.getNome());
                preparedStmt.setString(2, List.getCpf());
                preparedStmt.setString(3, List.getEmail());
                preparedStmt.setDate(4, (Date) List.getStartDate());

                preparedStmt.execute();

            } catch (Exception e) {
                System.out.println(" Erro:" + e.getMessage());
            }
        }

        public void update() {

            try {
                Connection conn = ConnectionFactory.createConnectionToMySQL();
                String query = "UPDATE usuario_1  SET Nome = ?,  Email = ?, Cpf = ?, Date_create = ? WHERE Id = " + List.getId();

                PreparedStatement preparedStmt = conn.prepareStatement(query);

                preparedStmt.setString(1, List.getNome());
                preparedStmt.setString(2, List.getEmail());
                preparedStmt.setString(3, List.getCpf());
                preparedStmt.setDate(4, (Date) List.getStartDate());

                preparedStmt.executeUpdate();

                conn.close();


            } catch (Exception e) {

                System.out.println(" Erro:" + e.getMessage());
            }
        }


        public void delete() {

            try {
                Connection conn = ConnectionFactory.createConnectionToMySQL();

                String query = "DELETE FROM usuario_1  WHERE ID = ?";


                PreparedStatement preparedStmt = conn.prepareStatement(query);
                preparedStmt.setString(1, List.getId());
                preparedStmt.executeUpdate();

            } catch (Exception e) {
                System.out.println(" Erro:" + e.getMessage());

            }
        }

        public void select () {


            try {
                Connection conn = ConnectionFactory.createConnectionToMySQL();
                System.out.println(List.getStartDate());
                Statement statement = conn.createStatement();
                statement.executeQuery("SELECT * FROM usuario_1 ");

                ResultSet set = statement.getResultSet();
                System.out.println("Id - Nome - cpf - email - Data");

                while (set.next()) {
                    String id = set.getString("id");
                    String nome = set.getString("nome");
                    String cpf = set.getString("cpf");
                    String email = set.getString("email");
                    String data = set.getString("Date_create");
                    System.out.println(id+": - "+nome+" - "+cpf+" - "+email +" -  "+data);
                }

            }catch (Exception e){
                System.out.println("Erro:" + e.getMessage());
            }

        }
    }


