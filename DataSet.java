package knn;

public class DataSet {
	private double[][] dados = {
			{0.35,0.91,0.86,0.42,0.71},
			{0.21,0.12,0.76,0.22,0.92},
			{0.41,0.58,0.73,0.21,0.09},
			{0.71,0.34,0.55,0.19,0.80},
			{0.79,0.45,0.79,0.21,0.44},
			{0.61,0.37,0.34,0.81,0.42},
			{0.78,0.12,0.31,0.83,0.87},
			{0.52,0.23,0.73,0.45,0.78},
			{0.53,0.17,0.63,0.29,0.72},
		};

	public double[][] getDados() {
		return dados;
	}

	public void setDados(double[][] dados) {
		this.dados = dados;
	}

}
