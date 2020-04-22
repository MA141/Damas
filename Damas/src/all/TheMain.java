package all;

import java.util.Arrays;

public class TheMain {

	public static void main(String[] args) {
		Board tab = new Board();
		tab.create();
		System.out.println("Tabuleiro inicial:");
		tab.show();
		
		CSVReader test = new CSVReader();
		test.setDataSource("C:\\Users\\Artur\\Desktop\\UNICAMP\\2020-1\\MC322\\lab6\\Damas\\testeDamas1.csv");
		String commands[] = test.requestCommands();
		Converter ini = new Converter();//apenas para incializar um objeto da classe
		int [][] coords = ini.conv(commands);
		
		System.out.println(Arrays.deepToString(coords));
		
		moveTudo(coords,tab);
	}
	
	static void moveTudo(int[][] com,Board tab){
		for(int k = 0; k<com.length; k++) {
			int tipoMovimento = tab.tabela[com[k][0]][com[k][1]].verifComp(com[k]);
			if((tab.temCaptura() && tipoMovimento!=2)||(tipoMovimento==0)){
				//se ha uma captura e o movimento nao eh de captura ou se o movimento nao eh possivel
				System.out.println("Jogada Invalida");
				return;
			}
			if(tab.verifTab(com[k],tipoMovimento)) {//se o movimento for possivel no tabuleiro
				tab.move(com[k],tipoMovimento);
				tab.show();
			}
			else {
				System.out.println("Jogada Invalida");
				break;
			}
		}
	}

}
