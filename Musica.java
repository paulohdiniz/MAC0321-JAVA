public class Musica {
	 String nomeDaMusica;
	 String compositor;
	 String interprete;
	 String nomeDoAlbum;
	 int ano;
	
	Musica(String nomeDaMusica, String compositor, String interprete,
	String nomeDoAlbum, int ano){
		this.nomeDaMusica = nomeDaMusica;
		this.compositor = compositor;
		this.interprete = interprete;
		this.nomeDoAlbum = nomeDoAlbum;
		this.ano = ano;
	}
	
	//metodos de obtencao
	String getNomeDaMusica() {
		return nomeDaMusica;
	}
	String getCompositor() {
		return compositor;
	}
	String getInterprete() {
		return interprete;
	}
	String getNomeDoAlbum() {
		return nomeDoAlbum;
	}
	int getAno() {
		return ano;
	}
	void imprimirMusica() {
		System.out.println(nomeDaMusica);
		System.out.println("Composta por: " + compositor);
		System.out.println("Interpretada por: " + interprete);
		System.out.println("No ano de: " + ano);
		System.out.println("Do álbum: "+ nomeDoAlbum);
	}
}
