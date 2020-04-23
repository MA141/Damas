package all;

public class Dama extends Piece {
	public Board table;
	
	
	Dama(int team){
		super(team);
	}
	
	int gtClass() {//0 se piece(vazia), 1 se comum, 2 se dama
		return 2;
	}
	
	int verifComp(int[] com, Board table) {//Verifica se o movimento é compativel;//0=mov. invalido 1=mov normal 2= mov captura
		this.table=table;
		//A unica restricao eh, ela deve andar na diagonal. Para verificar se ela pode capturar, isso sera verificado na table;
		if(com[0]==com[2] || com[1]==com[3]) {
			return 0;
		}
		//Ver se come, e ver se nao passa por nenhum aliado.
		int ver=verifCap(com, table);
		return ver;
	}
	
	int verifCap(int[] com, Board table) {//0 -> passa por aliado, 1-> n captura, 2-> captura
		if (com[1]<com[3] && com[0]<com[2]) {
			int i=com[2], j=com[3];
			while (i!=com[0] && j!=com[1]) {
				i--;
				j--;
				if (table.tabela[i][j].color==this.color){
					return 0;
				}
				else if(table.tabela[i][j].color!=-1) {//Se houver inimiga, eh excluida aqui
					table.tabela[i][j]=new Piece(-1);
					return 2;
				}
				
			}
		}
		else if(com[1]>com[3] && com[0]>com[2]) {
			int i=com[2], j=com[3];
			while (i!=com[0] && j!=com[1]) {
				i++;
				j++;
				if (table.tabela[i][j].color==this.color){
					return 0;
				}
				else if(table.tabela[i][j].color!=-1) { //Se houver inimiga, eh excluida aqui
					table.tabela[i][j]=new Piece(-1);
					return 2;
				}
			}
		}
		
		else if(com[1]>com[3] && com[0]<com[2]) {
			int i=com[2], j=com[3];
			while (i!=com[0] && j!=com[1]) {
				i--;
				j++;
				if (table.tabela[i][j].color==this.color){
					return 0;
				}
				else if(table.tabela[i][j].color!=-1) {//Se houver inimiga, eh excluida aqui
					table.tabela[i][j]=new Piece(-1);
					return 2;
				}
			}
		}
		
		else if(com[1]<com[3] && com[0]>com[2]) {
			int i=com[2], j=com[3];
			while (i!=com[0] && j!=com[1]) {
				i++;
				j--;
				if (table.tabela[i][j].color==this.color){
					return 0;
				}
				else if(table.tabela[i][j].color!=-1) {//Se houver inimiga, eh excluida aqui
					table.tabela[i][j]=new Piece(-1);
					return 2;
				}
			}
		}
		return 1;
	}
	
	/*public boolean verifica() {
	 	Deve-se verificar se esta no seu lance;
		Dama consegue andar varias posicoes em uma jogada, entao deve-se verificar se ela nao esta bloqueada por outra peca
		do mesmo time, ou ver se a pos final nao esta ocupada. 
		Deve-se verificar, caso esta nao tenha capturado na jogada, se ela nao deixou de capturar outra peca;
		
		 Talvez seja util fazer que, caso a peca ande mais de duas casas, seja feita uma analise de cada captura. Por exemplo:
		 Chamar a funcao verifica, se ela captura alguma peca, faz verifica(nova posicao inicial-> pos final)
	
	Criar o metodo verifCap, que vê quantas peças inimigas tem entre a pos inicial e final, caso haja mais de uma, deve-se verificar se
	eh possivel captura-la (se ha um espaco apos ela), e caso haja uma peca do mesmo time, retorna -1, tornando a jogada invalida;
	
	Criar o metodo verifDiag, que verifica todas as diagonais a partir da pos inicial, se houver, ela devera ser capturada
	(Obs: Nao sei o que sera feito caso isso ocorra, ja que nesse caso a nova jogada deveria ser dada pela entrada);
	Por enquanto, nao sei se eh necessario implementar verifDiag, ja que talvez seja inutil.
	
	}*/
}
