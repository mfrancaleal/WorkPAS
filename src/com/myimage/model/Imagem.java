package com.myimage.model;
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
 
@Entity
@SequenceGenerator(name = "seq", sequenceName = "seq_usuario",
                   allocationSize = 1, initialValue = 1)
 
public class Imagem {
     
	@Id
    @GeneratedValue(generator="seq")
    private Integer id;
    private String nome;
    private String email;
    private String senha;
     
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}