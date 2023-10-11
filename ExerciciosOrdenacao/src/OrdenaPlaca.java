
public class OrdenaPlaca {

	public void ordena(Placa[] placas){
		   algoritmoDeOrdenacao2(placas);
		   algoritmoDeOrdenacao1(placas);
	}
	
	//insercao direta
	private void algoritmoDeOrdenacao1(Placa[] placas) {
		//ordena por LETRA utilizando insercao direta
		for (int i = 1; i < placas.length; i++) { 
			int j = i; 
			Placa B = placas[i];  
			while ((j > 0) && (placas[j-1].getLetras().compareTo(B.getLetras()) > 0)) { 
				placas[j] = placas[j-1]; 
				j--; 
			}
			placas[j] = B;
		}
	}
	
	//bubblesort
	private void algoritmoDeOrdenacao2(Placa[] placas) {
		//ordena por NUMERO utilizando Bubbletsort
		int i = placas.length-1;
		while(i > 0) {
			int lastFlipped = 0;
			for(int j = 0; j < i; j++) {
				if (placas[j].getNumeros().compareTo(placas[j+1].getNumeros()) < 0) {
					Placa T = placas[j];
					placas[j] = placas[j+1];
					placas[j+1] = T;
					lastFlipped = j;
				}
			}
			i = lastFlipped;
		}
	}
	
	//selecaoDireta
	public void selecaoDireta(Placa[] placas){
		//ordena por N�MEROS das placas
		int min = 0;
		for (int i = 0; i < placas.length-1; i++) {
			min = i;
			for (int j = i+1; j < placas.length; j++)
				if (placas[j].getNumeros().compareTo(placas[min].getNumeros()) < 0)
					min = j; 
			Placa T = placas[i];
			placas[i] = placas[min];
			placas[min] = T;
		}
	}
	
}
