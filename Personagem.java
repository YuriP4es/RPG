package pacote;

public class Personagem {
	private String nome;
	private double vida;
	private double ataque;
	private double defesa;
	private double magia;
	private double inteligencia;
	
	// Atributos para armazenar os valores iniciais
	private double vidaInicial;
	private double magiaInicial;
	
	// metodo construtor da classe personagem
	public Personagem(String nome, double vida, double ataque, double defesa, double magia, double inteligencia) {
		this.nome = nome;
		this.vida = vida;
		this.ataque = ataque;
		this.defesa = defesa;
		this.magia = magia;
		this.inteligencia = inteligencia;
		
		// Salva os valores iniciais
		this.vidaInicial = vida;
		this.magiaInicial = magia;
		

	}
	// encapsulamento de todos os atributos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getVida() {
		return vida;
	}

	public void setVida(double vida) {
		this.vida = vida;
	}

	public double getAtaque() {
		return ataque;
	}

	public void setAtaque(double ataque) {
		this.ataque = ataque;
	}

	public double getDefesa() {
		return defesa;
	}

	public void setDefesa(double defesa) {
		this.defesa = defesa;
	}

	public double getMagia() {
		return magia;
	}

	public void setMagia(double magia) {
		this.magia = magia;
	}

	public double getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(double inteligencia) {
		this.inteligencia = inteligencia;
	}

	public double getVidaInicial() {
		return vidaInicial;
	}
	public void setVidaInicial(double vidaInicial) {
		this.vidaInicial = vidaInicial;
	}
	public double getMagiaInicial() {
		return magiaInicial;
	}
	public void setMagiaInicial(double magiaInicial) {
		this.magiaInicial = magiaInicial;
	}
	// metodo da ação atacar com condição para nome, dependendo do personagem tem maior dano de ataque
	public void atacar(Personagem alvo) {
		if (this.nome.equals("Bruxinha Rabuda")) {					
			double dano = Math.max( this.ataque *2 , this.ataque - alvo.defesa); //ataque do personagem menos a defesa do inimigo
			alvo.setVida(alvo.getVida() - dano);
			System.out.println(this.nome + " ataca " + alvo.getNome() + " e causa " + dano + " de dano.");
			if (alvo.getVida() <= 0) {
				System.out.println(alvo.getNome() + " foi Derrotado");
				}
			}else if (this.nome.equals("Cavaleiro Otário")) {					
				double dano = Math.max( this.ataque *1.75 , this.ataque - alvo.defesa); //ataque do personagem menos a defesa do inimigo
				alvo.setVida(alvo.getVida() - dano);
				System.out.println(this.nome + " ataca com a espada" + alvo.getNome() + "e causa " + dano + " de dano.");
				if (alvo.getVida() <= 0) {
					System.out.println(alvo.getNome() + " foi Derrotado");
					}
			}else if (this.nome.equals("Roberto Hood")) {					
				double dano = Math.max( this.ataque *1.5 , this.ataque - alvo.defesa); //ataque do personagem menos a defesa do inimigo
				alvo.setVida(alvo.getVida() - dano);
				System.out.println(this.nome + " lança uma sequência de flechas em" + alvo.getNome() + "e causa " + dano + " de dano.");
				if (alvo.getVida() <= 0) {
					System.out.println(alvo.getNome() + " foi Derrotado");
					}
				}else {
					double dano = Math.max( this.ataque  , this.ataque - alvo.defesa); //ataque do personagem menos a defesa do inimigo
					alvo.setVida(alvo.getVida() - dano);
					System.out.println(this.nome + " ataca " + alvo.getNome() + " e causa " + dano + " de dano.");
					if (alvo.getVida() <= 0) {
						System.out.println(alvo.getNome() + " foi Derrotado");
					}
				}
		}
		
		

		//metodo da ação usar magia, cada personagem vai ter seu tipo de natureza de magia, como se fosse uma sobrescrita de dados
		public void usarMagia(Personagem alvo , String tipoMagia) {
			if (this.magia > 0) {
				if (this.nome.equals("Bruxinha Rabuda") && tipoMagia.equalsIgnoreCase("fogo")) { // this.nome.equals quer dizer que o nome do personagem tem que ser igual pra usar natureza fogo 
					double danoMagico = this.getMagia() * 3;
					alvo.setVida(alvo.getVida() - danoMagico);
					System.out.println(this.nome + " lança uma bola de fogo em " + alvo.getNome() + " e causa " + danoMagico + " de dano!");
					this.setMagia(this.magia - 5); // define o custo da magia 
					if (alvo.getVida() <= 0) {
						System.out.println(alvo.getNome() + " foi derrotado!");
					}
				} else if (this.nome.equals("Cavaleiro Otário") && tipoMagia.equalsIgnoreCase("agua")) {
					double danoMagico = this.getMagia() * 2;
					alvo.setVida(alvo.getVida() - danoMagico);
					System.out.println(this.nome + " invoca uma tsunami para " + alvo.getNome() + " e causa " + danoMagico + " de dano!");
					this.setMagia(this.magia - 3); // define o custo da magia 
					if (alvo.getVida() <= 0) {
						System.out.println(alvo.getNome() + " foi derrotado!");
					}
				} else if (this.nome.equals("Roberto Hood") && tipoMagia.equalsIgnoreCase("terra")) {
					double danoMagico = this.getMagia() * 2.5;
					alvo.setVida(alvo.getVida() - danoMagico);
					System.out.println(this.nome + " ergue espinhos da terra contra " + alvo.getNome() + " e causa " + danoMagico + " de dano!");
					this.setMagia(this.magia - 4); // define o custo da magia 
					if (alvo.getVida() <= 0) {
						System.out.println(alvo.getNome() + " foi derrotado!");
					}
				} else {
					System.out.println("Você não pode usar essa magia ou naõ tem magia o suficiente.");
				}
				
			} else {
				System.out.println(this.nome + " não possui magia suficiente");
			}
			
			
			
			 
	}

		public void restaurarAtributos() {
			this.vida = this.vidaInicial;
			this.magia = this.magiaInicial;
			System.out.println(this.nome + " teve seus atributos restaurados para os valores iniciais.");
			System.out.println("Vida: " + this.vida + ", Magia: " + this.magia);
		}

}

