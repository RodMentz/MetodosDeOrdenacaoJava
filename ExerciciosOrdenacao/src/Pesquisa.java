
public class Pesquisa {
	public int pesquisaSequencial(int[] tab, int arg) {
		for(int i = 0; i < tab.length; i++)
			if(tab[i] == arg)
				return i;
		return -1;
	}
	
	public int pesquisaSequencialOrdenada(int[] tab, int arg) {
		for(int i = 0; (i < tab.length) && (tab[i] <= arg); i++)
			if(tab[i] == arg)
				return i;
		return -1;
	}
	
	public int pesquisaBinaria(int[] tab, int arg) {
		int inf = 0; int sup = tab.length - 1;
		while(inf <= sup) {
			int med = (inf + sup) / 2; //divisao inteira
			if(arg == tab[med])
				return med;
			else if(arg < tab[med])
				sup = med - 1; //procura na 1a metade
			else
				inf = med + 1; //procura na 2a metade
		}
		return -1;
	}
}
