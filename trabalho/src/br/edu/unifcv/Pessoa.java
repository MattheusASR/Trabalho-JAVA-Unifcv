package br.edu.unifcv;

public class Pessoa {

public Pessoa() {
		
	}
	int dia;
	int ano;
	int mes;
	int totalDias;


	public int Calcula(int dias) {
	
		 while(dias > 0) {
		    	
		    	while(dias > 365) {
		    	 ano = ano + 1;
		    	 dias = dias - 365;
		    	 
		    	} 
		    	while (dias > 30 ) {
		    	mes = mes + 1;
		    	dias = dias - 30;
		    	}
		    	
		    	dia = dias;
		    	dias = 0;
		    }
		    
		    System.out.println("anos: " + ano + " meses: " + mes + " dias: " + dia);

		    return 0;
		}


	
}
