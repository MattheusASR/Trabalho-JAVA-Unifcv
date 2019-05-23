package br.edu.unifcv;

public class ComparaNumero {
	
	public ComparaNumero() {
		
	}


	int n1, n2;
	
	public int ComparaNum (int n1, int n2) {
			
		if(n1>n2) {
			System.out.println("O numero "+ n1 +" eh maior");
		}else {
			System.out.println("O numero "+ n2 +" eh maior");
		}
		if(n1==n2) {
			  System.out.println("sao iguais");
		  }
			
		
		return 0;
		
	}
}
