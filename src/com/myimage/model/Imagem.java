package com.myimage.model;

import antlr.collections.List;

public class Imagem extends Multimidia {
	
	private String extensao;
	private String titulo;
	private String url;
    private int tamanho;
    private String nome;
    
	public Imagem(){
		super();
	}
	
	@Override
	protected void salvar(){
		
	}
	
	private List carregaImagem(){
		List retornImagem = (List) this.carregaMidia();
		
		return retornImagem;
	}
	
	public String getExtensao() {
		return extensao;
	}

	public void setExtensao(String extensao) {
		this.extensao = extensao;
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

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	
	
}
