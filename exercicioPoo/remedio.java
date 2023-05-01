package exercicioPoo;

public class remedio extends cosmeticos{
	
	private String nome;
	private float volume;
	private String cor;
	private int quantidade;

	public remedio(int Medicamentos, String Creme, float Ml, String nome, float volume, String cor, int quantidade) {
	super(Medicamentos, Creme, Ml);
	this.nome = nome;
	this.volume = volume;
	this.cor = cor;
	this.quantidade = quantidade;



	}

	public String getNome() {
	return nome;
	}

	public void setNome(String nome) {
	this.nome = nome;
	}

	public float getVolume() {
	return volume;
	}

	public void setVolume(float volume) {
	this.volume = volume;
	}

	public String getCor() {
	return cor;
	}

	public void setCor(String cor) {
	this.cor = cor;
	}

	public int getQuantidade() {
	return quantidade;
	}

	public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
	}


	@Override
	public void visualizar(){

	super.visualizar();
	System.out.println("Digite seu medicamento: " + this.nome);
	System.out.println("Qual o volume: " + this.volume);
	System.out.println("Qual a tarja do seu remedio: " + this.cor);
	System.out.println("Quantidade: " + this.quantidade);


	}

	}

