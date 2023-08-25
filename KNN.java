package knn;

import java.util.*;

class KNN {

	public static void main(String args[]){ 

		DataSet dataset = new DataSet();

		int k = 7; 
		//lista para manter os dados da cidade
		List<Cidade> cidades = new ArrayList<Cidade>();

		cidades.add(new Cidade(dataset.getDados()[0],"SP"));
		cidades.add(new Cidade(dataset.getDados()[1],"RJ"));
		cidades.add(new Cidade(dataset.getDados()[2],"MG"));
		cidades.add(new Cidade(dataset.getDados()[3],"SP"));
		cidades.add(new Cidade(dataset.getDados()[4],"MG"));
		cidades.add(new Cidade(dataset.getDados()[5],"RJ"));
		cidades.add(new Cidade(dataset.getDados()[6],"SP"));
		cidades.add(new Cidade(dataset.getDados()[7],"MG"));
		cidades.add(new Cidade(dataset.getDados()[8],"RJ"));

		//cidade a ser classificada
		double[] cidadeDesconhecidade = {0.65,0.78,0.21,0.29,0.58};
		
		Distancia dist = new Distancia(k, cidades, cidadeDesconhecidade);

		dist.calcular();
		
		String[] lista = dist.definirRank();
		
		Votos votos = new Votos(lista); 
		String newClasse = votos.contarVotos();
		System.out.println("A classe da nova instancia é: "+newClasse);                
	} 

	static class DistanceComparator implements Comparator<Resultado> {
		public int compare(Resultado a, Resultado b) {
			return a.getDistancia()<b.getDistancia() ? -1 : a.getDistancia() == b.getDistancia() ? 0 : 1;
		}
	}

}