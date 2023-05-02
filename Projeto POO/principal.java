package Projeto;

import java.util.Scanner;

public class principal {

	public static void main(String[] args)  {
		
		conta minhaConta = new conta (0, null, 0, false);
		
		int opcao, cont=0;
						
		String movimento;
		
		String sair="N";
										
		float valormovimento;
		
		Scanner leia = new Scanner (System.in);
		
				 
		System.out.println ("1 - Conta Poupança"); 
		
		System.out.println ("2 - Conta Corrente"); 
		
		System.out.println ("3 - Conta Especial"); 
		
		System.out.println ("4 - Conta Empresa"); 
		
		System.out.println ("5 - Conta Estudantil"); 
		
		System.out.println ("6 - Sair");
		
		System.out.println ("Digite a opção desejada");
		opcao = Integer.parseInt(leia.nextLine());
		
		while(sair.compareTo("N")==0) {
		
		if(opcao==1 ) {
			System.out.println ("Conta [Conta Corrente]");
			System.out.printf("Saldo atual: %f\n",minhaConta.saldo);
			System.out.println ("MOVIMENTO - D-debito ou C-Crédito:");
			movimento = leia.nextLine();
			
			if(cont<=10) {
										
				if(movimento=="D") {
					System.out.println ("Valor movimento: R$");	
					valormovimento = Float.parseFloat(leia.nextLine());
					minhaConta.saldo = minhaConta.saldo-valormovimento;	
					cont++;
				}
				
				else{
					System.out.println ("Valor movimento: R$");	
					valormovimento = Float.parseFloat(leia.nextLine());
				    minhaConta.saldo = minhaConta.saldo+valormovimento;
				    cont++;
				}
			}
			
			
			System.out.println ("Sair S/N:");
			sair = leia.nextLine();
		}
		}
	}
}

			
					
					
		
	


