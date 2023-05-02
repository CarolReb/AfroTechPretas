package Projeto;

public class conta {
	
		
		public int numero;
		private String cpf;
		public float saldo;
		private boolean ativo;
		
		/*private int agencia;
		private int tipo;
		private String titular;
		private float limite;*/
		
		public conta(int numero, String cpf, float saldo, boolean ativo) {
			this.numero = numero;
			this.cpf = cpf;
			this.saldo = saldo;
			this.ativo = ativo;
			
						
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public float getSaldo() {
			return saldo;
		}

		public void setSaldo(float saldo) {
			this.saldo = saldo;
		}

		public boolean isAtivo() {
			return ativo;
		}

		public void setAtivo(boolean ativo) {
			this.ativo = ativo;
		}
		
		

	}

