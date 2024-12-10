package model;

import database.UsuarioDAO;
import java.sql.SQLException;
import java.util.ArrayList;


public class Usuario {
    private int id;
    private String nome;
    private String dataNascimento;
    private String cpf;
    private String telefone;
    private String cidade;
    private String rua;
    private String cep;
    private String senha;

    public Usuario(){}

    public Usuario(String cpf, String senha) {
        this.cpf = cpf;
        this.senha = senha;
    }
    
    public Usuario(String nome, String dataNascimento, String cpf, String telefone, String cidade, String rua, String cep, String senha) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.telefone = telefone;
        this.cidade = cidade;
        this.rua = rua;
        this.cep = cep;
        this.senha = senha;
    }
        
    public Usuario(int id, String nome, String dataNascimento, String cpf, String telefone, String cidade, String rua, String cep, String senha) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.telefone = telefone;
        this.cidade = cidade;
        this.rua = rua;
        this.cep = cep;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    

    
    
    public boolean login() throws ClassNotFoundException, SQLException{
        boolean key = false;
        UsuarioDAO dao = new UsuarioDAO();
        ArrayList<Usuario> list = dao.getAllUsers();
        
        for( Usuario u : list ) {
            if( u.getCpf().equals(this.cpf) ) {
                if( u.getSenha().equals(this.senha) ) {
                    key = true;
                }
            }
        }
        
        return  key;
    }
    
   
    
}
