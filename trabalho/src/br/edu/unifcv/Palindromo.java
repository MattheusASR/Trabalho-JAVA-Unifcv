package br.edu.unifcv;


public class Palindromo {
	public Palindromo() {
		
	}

	String palavra = "ovo";
	String inverso;
	
	
	public void palindromo1 () {
		
			inverso = new StringBuilder(palavra).reverse().toString();
		
		if(palavra.equals(inverso)) {
			System.out.println("eh um palindromo");
		}else {
			System.out.println("nao eh palindromo");
		}
		
	}

}
