package all;

public class Board {
	Piece[][] tabela=new Piece[8][8];
	int lastTurn=-1; //Inicia com -1, pois no inicio ninguem jogou ainda;
					 //Nas jogadas, verificar se table[pos inicial].color!= lastTurn-> lastTurn=color; e return True; else-> return false;
	
	void create(){
		for (int i=0; i<8; i++){
			for(int j=0; j<8; j++) {
				if((i%2==0 && j%2!=0)||(j%2==0 && i%2!=0)) {//se esta na cor preta
					if(i<3) {
						tabela[i][j] = new Piece(1);//cor preta
					}
					if(i>4) {
						tabela[i][j] = new Piece(0);//cor branca
					}
				}
			}
		}
	}
	void show() {
		for (int i=0; i<8; i++){
			System.out.print(8-i+" ");
			for(int j=0; j<8; j++) {
				if(tabela[i][j].color==0) {//mude aqui   //Mudei, mas n sei se esta correto
					System.out.print("B ");
				}
				if(tabela[i][j].color==1) {//aqui tb
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
