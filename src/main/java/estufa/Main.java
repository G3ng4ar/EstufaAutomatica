package estufa;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//DECLARAÇÃO DA CLASSE DE CÁLCULO E CONTAGENS
		Calculadores calc = new Calculadores();
		
		//DECLARAÇÃO DE VARIÁVEIS LOCAIS
		//DECLARADO ARRAY temperaturas COM ÍNDICE DE 24 CASAS, PARA SIMULAR AS 24 HORAS PERMITIDAS PARA O USUÁRIO INSERIR OS VALORES
		int[] temperaturas = new int[24];                                 
		double med = 0;
		int temMin = 10;
		int temMax = 40;
		int contMax = 0;
		Scanner scanner = new Scanner(System.in);

		//LOOP PRINCIPAL
		for(int i=0; i < temperaturas.length; i++) {
			boolean entradaValida = false;
		    
			//LOOP WHILE ENQUANTO O INPUT FOR NULO
		    while (!entradaValida) {
		        try {
					System.out.println();
					System.out.println("--Controle de Estufa--");
					System.out.println("Horário: "+i+":00");
					
					System.out.println("Temperatura mínima permitida:"+temMin+"°C");
					System.out.println("Temperatura máxima permitida:"+temMax+"°C");
					
					System.out.println("Insira a temperatura atual em °C:");
					
					//CONDICIONAL PARA GARANTIR QUE O VALOR INSERIDO É UM INTEIRO, CASO SEJA, ENCERRA O LOOP WHILE
					if (scanner.hasNextInt()) {
		                temperaturas[i] = scanner.nextInt();
		                entradaValida = true;
						System.out.println();
						
						//CONDIÇÃO PARA CONTAR QUANTAS TEMPERATURAS REGISTRADAS ESTIVERAM ACIMA DO LIMITE MÁXIMO E MENSAGENS DE CONTROLE
						if(temperaturas[i]>temMax){
							contMax += 1;
							System.out.println("Mensagem: !!!CUIDADO, TEMPERATURA ACIMA DO LIMITE!!!");
							System.out.println("Temperatura registrada com sucesso!");
						}else if(temperaturas[i]<temMin){
							System.out.println("Mensagem: Atenção, temperatura abaixo da mínima!");
							System.out.println("Temperatura registrada com sucesso!");
						}else {
							System.out.println("Temperatura registrada com sucesso!");
						}
						med = calc.valorMedia(temperaturas);
					}else {
						System.out.println();
						System.out.println();
		                System.out.println("Mensagem: !!ERRO, INSIRA APENAS NUMEROS!!");
		                scanner.next(); // 
		            }
		        }catch (Exception e){
		        	System.out.println("Mensagem: !!ERRO, INSIRA UM VALOR VÁLIDO!!");
		            scanner.next();
	        	}
	        }
		}
		
		//DECLARAÇÃO DE VARIÁVEIS DO RELATÓRIO FINAL E FORMATAÇÃO DE 2 CASAS DECIMAIS PARA O VALOR DE TEMPERATURA MÉDIA
		String media = String.format("%.2f", med);
		int temMinReg = calc.minima(temperaturas);
		int temMaxReg = calc.maxima(temperaturas);
		
		//RELATÓRIO FINAL 
		System.out.println();
		System.out.println("------Relatório------");
		System.out.println();
		System.out.println("Temperatura média:"+media+"°C");
		System.out.println("Contagem de temperaturas acima do limite máximo: "+contMax+" registros");
		System.out.println("Temperatura mínima registrada: "+temMinReg+"°C");
		System.out.println("Temperatura máxima registrada: "+temMaxReg+"°C");
		System.out.println();
		System.out.println();
		

	}
}
