
class MusicasNoLP extends Musica{
	int velocidade; // 33, 45 ou 78
	
	MusicasNoLP(String nomeDaMusica, String compositor, String interprete,
			String nomeDoAlbum, int ano, int velocidade) {
		super(nomeDaMusica, compositor, interprete, nomeDoAlbum, ano);
		this.velocidade = velocidade;
	}
	
	int getVelocidade() {
		return velocidade;
	}
}
