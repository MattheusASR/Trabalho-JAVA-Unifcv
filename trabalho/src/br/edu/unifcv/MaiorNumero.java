package br.edu.unifcv;

public class MaiorNumero {
	
	public MaiorNumero() {
		
	}
	
	int n1, n2;
	
	public int NumeroMaior (int n1, int n2) {
		if(n1>n2) {
			System.out.println("O numero "+ n1 +" eh maior");
		}else {
			System.out.println("O numero "+ n2 +" eh maior");
		}
		
		return 0;
		
	}

}
