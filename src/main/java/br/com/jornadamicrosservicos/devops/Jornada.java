package br.com.jornadamicrosservicos.devops;

public class Jornada {

	private final long id;
	private final String conteudo;

	public Jornada(long id, String conteudo) {
		this.id = id;
		this.conteudo = conteudo;
	}

	public long getId() {
		return id;
	}

	public String getConteudo() {
		return conteudo;
	}

	public String toString() {
		return "[" + this.id + "] " + this.conteudo;
	}
}
