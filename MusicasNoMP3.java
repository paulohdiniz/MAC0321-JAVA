
class MusicasNoMP3 extends Musica{
	int tamanho; //em bytes
	
	MusicasNoMP3(String nomeDaMusica, String compositor, String interprete,
			String nomeDoAlbum, int ano, int tamanho) {
		super(nomeDaMusica, compositor, interprete, nomeDoAlbum, ano);
		this.tamanho = tamanho;
	}
	
	double getTamanho() {
		return tamanho;
	}
}
