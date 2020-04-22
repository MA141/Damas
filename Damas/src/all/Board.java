package all;

public class Board {
	Piece[][] tabela=new Piece[8][8];
	int lastTurn=-1; //Inicia com -1, pois no inicio ninguem jogou ainda;
					 //Nas jogadas, verificar se table[pos inicial].color!= lastTurn-> lastTurn=color; e return True; else-> return false;
	
	void create(){//cria o tabuleiro inicial
		for (int i=0; i<8; i++){
			for(int j=0; j<8; j++) {
				if((i%2==0 && j%2!=0)||(j%2==0 && i%2!=0)) {//se esta na cor preta
					if(i<3) {
						tabela[i][j] = new Comum(1);//cor preta
					}
					if(i>4) {
						tabela[i][j] = new Comum(0);//cor branca
					}
					if(i==3 || i==4){
						tabela[i][j] = new Piece(-1);//nao tem peca
					}
				}
				else {
					tabela[i][j] = new Piece(-1);//nao tem peca
				}
			}
		}
	}
	void show() {//printa o tabuleiro
		for (int i=0; i<8; i++){
			System.out.print(8-i+" ");
			for(int j=0; j<8; j++) {
				if(tabela[i][j].color==0) {
					System.out.print("B ");
				}
				if(tabela[i][j].color==1) {
					System.out.print("P ");
				}
				if(tabela[i][j].color==-1) {
					System.out.print("- ");
				}
			}
			System.out.println("");
		}
		System.out.println("  a b c d e f g h \n");
	}
	boolean verifTab(int[] com, int capture) {//verifica se o movimento eh possivel no tabuleiro
		if(tabela[com[0]][com[1]].gtClass()==1) {//se eh uma peca comum
			if(capture==0 || tabela[com[2]][com[3]].color!=-1){///se o movimento nao for possivel ou se a casa alvo nao estiver livre
				return false;
			}
			if(capture==2) {//se o movimento eh uma captura
				 int xEntre= (com[0]>com[2])?com[0]-1:com[2]-1;
				 int yEntre= (com[1]>com[3])?com[1]-1:com[3]-1;
				 if(tabela[xEntre][yEntre].color!=tabela[com[0]][com[1]].color && tabela[xEntre][yEntre].color!=-1 ){//se a peca a ser capturada existe e nao eh amiga
					 return true;
					 }
				 else {
					 return false;
				 }
			}
			else {
				return true;//portanto, o movimento nao eh de captura e a casa alvo esta livre
			}
		}
		else {//se eh uma dama
			
		}
		return false;//o programa nunca chega aqui, mas precisa desse return pra compilar
	}
	boolean temCaptura() {
		for (int i=0; i<8; i++){
			for(int j=0; j<8; j++) {
				if(tabela[i][j].gtClass()==1) {//peca comum
					int[][] targets = new int[4][4];//lista de casas alvo e a casa entre a casa alvo e a de saida
					targets[0][0]=99;targets[1][0]=99;targets[2][0]=99;targets[3][0]=99;
					if(i-2>=0 && j-2>=0) {
						targets[0][0]=i-2;targets[0][1]=j-2;targets[0][2]=i-1;targets[0][3]=j-1;
					}
					if(i-2>=0 && j+2<8) {
						targets[1][0]=i-2;targets[1][1]=j+2;targets[1][2]=i-1;targets[1][3]=j+1;						
					}
					if(i+2<8 && j-2>=0) {
						targets[2][0]=i+2;targets[2][1]=j-2;targets[2][2]=i+1;targets[2][3]=j-1;
					}
					if(i+2<8 && j+2<8) {
						targets[3][0]=i+2;targets[3][1]=j+2;targets[3][2]=i+1;targets[3][3]=j+1;
					}
					for(int k =0; k < 4; k++) {
						if(targets[k][0]!=99) {
							if(tabela[targets[k][0]][targets[k][1]].color==-1 && tabela[targets[k][2]][targets[k][3]].color!=tabela[i][j].color && tabela[targets[k][2]][targets[k][3]].color!=-1) {
								return true;
							}
						}	
					}
					
				}
				if(tabela[i][j].gtClass()==2) {//dama
					//checa se tem alguma captura pra dama
				}
			}
		}
		return false;
	}
	void move(int[] com, int capture){//realiza a jogada
		if(capture==2) {//se eh uma captura, eh retirada a peca entre a casa de saida e a casa alvo
			int xEntre= (com[0]>com[2])?com[0]-1:com[2]-1;
			int yEntre= (com[1]>com[3])?com[1]-1:com[3]-1;
			Piece temp = new Piece(-1);
			tabela[xEntre][yEntre]= temp;
			
		}
		if(com[2] == 0 && tabela[com[0]][com[1]].color==0) {//se houve promocao para dama branca
			Dama temp3 = new Dama(0);
			tabela[com[2]][com[3]]=temp3;
		}
		if(com[2] == 7 && tabela[com[0]][com[1]].color==1) {//se houve promocao para dama preta
			Dama temp4 = new Dama(1);
			tabela[com[2]][com[3]]=temp4;
		}
		else {//se foi um movimento normal
			tabela[com[2]][com[3]]=tabela[com[0]][com[1]];
		}
		Piece temp2 = new Piece(-1);
		tabela[com[0]][com[1]]=temp2;// para todos os casos, a casa de saida vira uma casa vazia
	}
}
