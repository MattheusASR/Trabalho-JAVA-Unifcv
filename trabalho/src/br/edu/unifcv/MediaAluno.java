package br.edu.unifcv;

public class MediaAluno {

	public MediaAluno() {
		
	}
	
double media, soma;
	
	public double AdcNotas (double nota1, double nota2, double nota3, double nota4) {
	
		soma = nota1 + nota2 + nota3 + nota4;
		
		return soma;
		}

public double Media() {
	media = soma / 4;

	if(media > 6) {
		System.out.println("Aprovado!");
	}else if(media < 4) {
		System.out.println("Reprovado!");
	}
	if(media <6 ) {
		System.out.println("fazer a prova");
	}else if(media == 4) {
		System.out.println("fazer a prova");
	}
	
	
	System.out.println("a media eh: " + media);
	return media;
}


}
