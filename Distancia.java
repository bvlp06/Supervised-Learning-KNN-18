package knn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import knn.KNN.DistanceComparator;

public class Distancia {
	private int k;
	private List<Cidade> cidades;
	private double[] cidadeDesconhecidade;

	private List<Resultado> resultados = new ArrayList<Resultado>();


	public Distancia (int k,List<Cidade> cidades, double[] cidadeDesconhecidade) {
		this.k = k;
		this.cidades = cidades;
		this.cidadeDesconhecidade = cidadeDesconhecidade;
	}

	public void calcular() {

		for(Cidade cidade : cidades){
			double dist = 0.0;  
			for(int j = 0; j < cidade.getAtributos().length; j++){    	     
				dist += Math.pow(cidade.getAtributos()[j] - cidadeDesconhecidade[j], 2) ;
			}
			double distance = Math.sqrt( dist );
			resultados.add(new Resultado(distance,cidade.getNome()));
		} 
	}

	public String[] definirRank() {
		Collections.sort(resultados, new DistanceComparator());
		String[] lista = new String[k];
		for(int x = 0; x < k; x++){
			System.out.println(resultados.get(x).getNome()+ ": " + resultados.get(x).getDistancia());
			lista[x] = resultados.get(x).getNome();
		}
		return lista;
	}
}
