package exercicioPoo;

public class cosmeticos extends farmacia{
	
	public String Creme;
	protected float Ml;

	public cosmeticos(int Medicamento, String Creme, float Ml) {
	super(Medicamento);
	this.Creme = Creme;
	this.Ml = Ml;

	}

	public String getCreme() {
	return Creme;
	}

	public void setCreme(String creme) {
	Creme = creme;
	}

	public float getMl() {
	return Ml;
	}

	public void setMl(float ml) {
	Ml = Ml;

	}
	@Override
	public void visualizar() {
	System.out.println("Digite o Creme " + this.Creme);
	System.out.println("Digite o Mls " + this.Ml);

	}
	}

