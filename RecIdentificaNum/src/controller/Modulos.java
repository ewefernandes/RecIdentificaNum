package controller;

public class Modulos {
	
	public int IdNumero (String vt[], int tam, int n, int ac) {
		
		if (tam < 0) {
			return ac;
		} else {
			if (vt[tam] == Integer.toString(n)) {
				ac = ac + 1;
			}
			return IdNumero(vt, tam-1, n, ac);
		}
		
	}
	
}
