package br.edu.unifcv;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Numero Maior");
		MaiorNumero mn = new MaiorNumero();
		mn.NumeroMaior(10, 5);
		
		System.out.println("Compara Numero");
		ComparaNumero cn = new ComparaNumero();
		cn.ComparaNum(5, 5);
		
		System.out.println("Antecessor e Sucessor");
		AntecessorSucessor as = new AntecessorSucessor();
		as.Verifica(8);
		
		System.out.println("Palindromo");
		Palindromo pl = new Palindromo();
		pl.palindromo1();
		
		System.out.println("Media do Aluno");
		MediaAluno ma = new MediaAluno();
		ma.AdcNotas(8, 10, 9, 8);
		ma.Media();
		
		
		System.out.println("Idade em Dias");
		Pessoa p = new Pessoa();
		p.Calcula(1170);
		

	}

}
