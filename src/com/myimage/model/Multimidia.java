package com.myimage.model;
 
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
 
@Entity
@SequenceGenerator(name = "seq", sequenceName = "seq_multimidia",
                   allocationSize = 1, initialValue = 1)
 
abstract public class Multimidia {
     
	@Id
    @GeneratedValue(generator="seq")
    private Integer id;
    private String url;
    private int tamanho;
    private String nome;
    
    protected void salvar(){
    	
    }
    
    protected List<Multimidia> carregaMidia(){
    	List<Multimidia> carrega = (List<Multimidia>) null;
    	return carrega; 
    }
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}