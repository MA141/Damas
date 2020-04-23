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

}
