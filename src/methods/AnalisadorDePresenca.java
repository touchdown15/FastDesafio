package methods;

import java.util.ArrayList;
import java.util.Collections;

public class AnalisadorDePresenca {
	
	private String [] atas;
	private ArrayList<String> arrayResultado = new ArrayList<String>();

	public AnalisadorDePresenca(String[] atas) {
		super();
		this.atas = atas;
	}
	
	public String[] ColaboradoresQueViram2WorkshopsSeguidos() {
		String [] ata = atas;
		
		for(int i = 0; i+1 < ata.length; i++) {
			
			String[] arrayDividido =  ata[i].split(" ");
			
			String[] arrayParaComparar = ata[i+1].split(" ");
			
			Comparacao(arrayDividido, arrayParaComparar);
			
		}
		
		Collections.sort(this.arrayResultado);
		
		//Console Usado para testar o resultado. Retirar quando for para produção
		System.out.println(this.arrayResultado);
		
		String [] colaboradoresResultado = new String [this.arrayResultado.size()];
		
		this.arrayResultado.toArray(colaboradoresResultado);
		
		return colaboradoresResultado;
	}
	
	public void Comparacao(String[] arraySeparado1, String[] arraySeparado2) {
		String[] arraySeparado = arraySeparado1;
		String[] arrayParaComparar = arraySeparado2;
		
		for(int i = 0; i < arraySeparado.length; i++) {
			for(int j = 0; j < arrayParaComparar.length ; j++) {
				
				if(arraySeparado[i].equals(arrayParaComparar[j]) && !this.arrayResultado.contains(arraySeparado[i])) {
					this.arrayResultado.add(arraySeparado[i]);
				}
				
			}
		}
		
	}

}
