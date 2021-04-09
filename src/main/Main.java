package main;

import methods.AnalisadorDePresenca;

public class Main {

	public static void main(String[] args) {
		
		//Caso 1 de Teste do Desafio
		String[] arrayParaAnalise = {"hbas ies","alco2 hbas", "pot alco2 hbas"};
		
		System.out.println("Startup");
		
		AnalisadorDePresenca analisadorDePresenca = new AnalisadorDePresenca(arrayParaAnalise);

		analisadorDePresenca.ColaboradoresQueViram2WorkshopsSeguidos();
		
		//Caso 2 de Teste do Desafio
		String[] arrayParaAnalise2 = {"hbas ies alco", "alco hbas tst gkmo", "pot aacs alco aaosc fgrr", "till ies alco2 tst gkmo hbas"};
		
		System.out.println("Startup 2");
		
		AnalisadorDePresenca analisadorDePresenca2 = new AnalisadorDePresenca(arrayParaAnalise2);

		analisadorDePresenca2.ColaboradoresQueViram2WorkshopsSeguidos();
		
		//Caso 3 de Teste do Desafio
		String[] arrayParaAnalise3 = {"hbas ies", "", "alco hbas gkmo"};
		
		System.out.println("Startup 3");
		
		AnalisadorDePresenca analisadorDePresenca3 = new AnalisadorDePresenca(arrayParaAnalise3);

		analisadorDePresenca3.ColaboradoresQueViram2WorkshopsSeguidos();
		
		//Caso 4 de Teste do Desafio
		String[] arrayParaAnalise4 = {};
		
		System.out.println("Startup 4");
		
		AnalisadorDePresenca analisadorDePresenca4 = new AnalisadorDePresenca(arrayParaAnalise4);

		analisadorDePresenca4.ColaboradoresQueViram2WorkshopsSeguidos();
		
		//Caso 5 de Teste do Desafio
		String[] arrayParaAnalise5 = {"hbas ies", "hbas ies"};
		
		System.out.println("Startup 5");
		
		AnalisadorDePresenca analisadorDePresenca5 = new AnalisadorDePresenca(arrayParaAnalise5);

		analisadorDePresenca5.ColaboradoresQueViram2WorkshopsSeguidos();
		
	}

}
