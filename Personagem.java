package pacote;

public class Personagem {
	private String nome;
	private int vida;
	private int ataque;
	private int defesa;
	private int magia;
	private int inteligencia;
	
	
	// metodo construtor da classe personagem
	public Personagem(String nome, int vida, int ataque, int defesa, int magia, int inteligencia) {
		this.nome = nome;
		this.vida = vida;
		this.ataque = ataque;
		this.defesa = defesa;
		this.magia = magia;
		this.inteligencia = inteligencia;
	}
	// encapsulamento de todos os atributos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = Math.max(0, vida); //o math.vida garante que a vida não seja negativa
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getDefesa() {
		return defesa;
	}
	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}
	public int getMagia() {
		return magia;
	}
	public void setMagia(int magia) {
		this.magia = Math.max(0 , magia); //mesma coisa do vida
	}
	public int getInteligencia() {
		return inteligencia;
	}
	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}
	
	// metodo da ação atacar
	public void atacar(Personagem alvo) {
		int dano = Math.max( this.ataque , this.ataque - alvo.defesa); //ataque do personagem menos a defesa do inimigo
		alvo.setVida(alvo.getVida() - dano);
		System.out.println(this.nome + " ataca " + alvo.getNome() + " e causa " + dano + " de dano.");
		if (alvo.getVida() <= 0) {
			System.out.println(alvo.getNome() + " foi Derrotado");
			}
		}
		
		
	
	//metodo da ação usar magia, cada personagem vai ter seu tipo de natureza de magia, como se fosse uma sobrescrita de dados
		public void usarMagia(Personagem alvo , String tipoMagia) {
			if (this.magia > 0) {
				if (this.nome.equals("Bruxinha Rabuda") && tipoMagia.equalsIgnoreCase("fogo")) { // this.nome.equals quer dizer que o nome do personagem tem que ser igual pra usar natureza fogo 
					int danoMagico = this.getMagia() * 4;
					alvo.setVida(alvo.getVida() - danoMagico);
					System.out.println(this.nome + " lança uma bola de fogo em " + alvo.getNome() + " e causa " + danoMagico + " de dano!");
					this.setMagia(this.magia - 5); // define o custo da magia 
					if (alvo.getVida() <= 0) {
						System.out.println(alvo.getNome() + " foi derrotado!");
					}
				} else if (this.nome.equals("Cavaleiro Otário") && tipoMagia.equalsIgnoreCase("agua")) {
					int danoMagico = this.getMagia() * 2;
					alvo.setVida(alvo.getVida() - danoMagico);
					System.out.println(this.nome + " invoca uma tsunami para " + alvo.getNome() + " e causa " + danoMagico + " de dano!");
					this.setMagia(this.magia - 3); // define o custo da magia 
					if (alvo.getVida() <= 0) {
						System.out.println(alvo.getNome() + " foi derrotado!");
					}
				} else if (this.nome.equals("Roberto Hood") && tipoMagia.equalsIgnoreCase("terra")) {
					int danoMagico = this.getMagia() * 3;
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
	
	
	

}
