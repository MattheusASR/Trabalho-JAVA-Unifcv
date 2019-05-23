package br.edu.unifcv;

public class AntecessorSucessor {
	
	public AntecessorSucessor() {
		
	}
	
	int num;
	
	
	public int Verifica (int num) {
		int s = num + 1;
		int a = --num;
			System.out.println("seu sucessor eh: "+ s);
		
			System.out.println("seu antecessor eh: " + a);
		
		return 0;
	}

}
