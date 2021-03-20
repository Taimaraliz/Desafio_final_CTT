package br.com.cadastro;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CadastroEstudantil {
    private String id;
    private String nome;
    private String cpf;
    private String email;
    private Date startDate;

    public String getId() {
        id = "2";
        return id;
    }


    public void setId(String id){
        this.id = id;
    }

    public String getNome(){
        this.nome = "Maria João ";
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEmail(){

        this.email = "mariajoao@hotmail.com.br";
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf(){
        cpf = "1234";
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public Date getStartDate(){
        Calendar c = Calendar.getInstance();

        java.sql.Date startDate = new java.sql.Date(c.getTime().getTime());
        String data = new SimpleDateFormat("dd/MM/yyy").format(startDate);
        return startDate;
    }
    public void setStartDate(Date startDate){
        this.startDate = startDate;
    }

}
