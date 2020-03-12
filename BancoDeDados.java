class BancoDeDados {
	int x;
	
	bibliotecaDeMusicas= new Musica[4];

	Musica [] xxxbibliotecaDeMusicas;
	
	
	
			
	bibliotecaDeMusicas[0] = new MusicasNoMP3("Sozinho","Peninha",
			"Caetano Veloso","Prenda Minha", 1997, 3000);
	bibliotecaDeMusicas[1] = new MusicasNoLP("Triste Oração", "Edgardo Luiz",
			"Dalva de Oliveira", "Em Tudo Você", 1960, 33);
	bibliotecaDeMusicas[2] = new MusicasNoCD("Even Flow", "Eddie Vedder",
			"Pearl Jam", "Ten", 1991);
	bibliotecaDeMusicas[3] = new MusicasNoMP3("Coming Back to Life",
			"Gilmour", "Pink Floyd","The Division Bell", 1994, 5000);
	//bibliotecaDeMusicas[4] = new MusicasNoLP()
	//bibliotecaDeMusicas[5] = new MusicasNoCD()
	//bibliotecaDeMusicas[6] = new MusicasNoMP3()
	//bibliotecaDeMusicas[7] = new MusicasNoLP()
	//bibliotecaDeMusicas[8] = new MusicasNoCD()
	//bibliotecaDeMusicas[9] = new MusicasNoMP3()
	public static void main(String[] args) {
		BancoDeDados bd = new BancoDeDados();
		
		bd.buscaPorCompositor("Peninha");
	}
	void buscaPorTitulo(String nomeBuscado) {
		for(Musica musica: bibliotecaDeMusicas) {
			if(nomeBuscado == musica.nomeDaMusica) {
				musica.imprimirMusica();
			}
		}
	}
	void buscaPorCompositor(String nomeBuscado) {
		for(Musica musica: bibliotecaDeMusicas) {
			if(nomeBuscado == musica.compositor) {
				musica.imprimirMusica();
			}
		}
	}
	void buscaPorInterprete(String nomeBuscado) {
		for(Musica musica: bibliotecaDeMusicas) {
			if(nomeBuscado == musica.interprete) {
				musica.imprimirMusica();
			}
		}
	}
	void buscaPorPeriodo(int anoMinimo,
			int anoMaximo) {
		for(Musica musica: bibliotecaDeMusicas) {
			if(anoMinimo <= musica.ano && anoMaximo >= musica.ano) {
				musica.imprimirMusica();
			}
		}
	}
}
