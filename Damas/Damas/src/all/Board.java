package all;

public class Board {
	Pices[][] tabela=new Pices[8][8];
	
	void create(){
		for (int i=0; i<8; i++){
			for(int j=0; j<8; j++) {
				if((i%2==0 && j%2!=0)||(j%2==0 && i%2!=0)) {//se esta na cor preta
					if(i<3) {
						tabela[i][j] = new Pices();//cor preta
					}
					if(i>4) {
						tabela[i][j] = new Pices();//cor branca
					}
				}
			}
		}
	}
	void show() {
		for (int i=0; i<8; i++){
			System.out.print(8-i+" ");
			for(int j=0; j<8; j++) {
				if(tabela[i][j].color==1) {//mude aqui
					System.out.print("B ");
				}
				if(tabela[i][j].color==2) {//aqui tb
					System.out.print("P ");
				}
				else{
					System.out.print("- ");
				}
			}
			System.out.println("");
		}
		System.out.println("  a b c d e f g h");
	}
}
