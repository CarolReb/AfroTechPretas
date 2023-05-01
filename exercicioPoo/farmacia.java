package exercicioPoo;

public class farmacia {

	private int Medicamentos;


	public farmacia(int Medicamentos){

	}


	public int getMedicamentos() {
	return Medicamentos;
	}


	public void setMedicamentos(int Medicamentos) {
	Medicamentos = Medicamentos;
	}

	public void visualizar() {

	System.out.println("\n\n****************************************************************************************************************\n");
	System.out.println("Digite seu medicamento");
	System.out.println("\n\n****************************************************************************************************************\n");
	System.out.println("Quantidade de Caixa: " + this.Medicamentos);


	}

}
