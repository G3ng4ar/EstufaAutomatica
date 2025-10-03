package estufa;

public class Calculadores {
	//CÁLCULO DA MÉDIA
	public double valorMedia(int[] temperaturas) {
		if (temperaturas == null || temperaturas.length == 0) {
			return 0;
		}
		
		int soma = 0;
		for (int temp : temperaturas) {
			soma += temp;
		}
		
		return (double) soma / temperaturas.length;
	}
	
	//IDENTIFICA VALOR MÍNIMO NO ARRAY DE TEMPERATURAS
	public int minima (int[] temperaturas) {
		int minimaReg = temperaturas[0];
		for(int temp : temperaturas) {
			if (temp < minimaReg) {
				minimaReg = temp;
			}
		}
		return minimaReg;
	}
	
	//IDENTIFICA VALOR MÁXIMO NO ARRAY DE TEMPERATURAS
	public int maxima (int[] temperaturas) {
		int maximaReg = temperaturas[0];
		for(int temp : temperaturas) {
			if (temp > maximaReg) {
				maximaReg = temp;
			}
		}
		return maximaReg;
	}
	
}
