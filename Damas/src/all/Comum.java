package all;

public class Comum extends Piece{
	
	Comum(int team){
		super(team);
	}
	
	int gtClass() {//0 se piece(vazia), 1 se comum, 2 se dama
		return 1;
	}
	
	int verifComp(int[] com, Board tab) { //Verifica se o movimento é compativel;//0=mov. invalido 1=mov normal 2= mov captura
		//Se dist ==1, ver se vai para frente
		if(com[1]==com[3] || com[0]==com[2]) {//0=1;1==0;3==3;4==2
			return 0;
		}
		if (Math.abs(com[3]-com[1])==1) {
			if (color==1) { //se eh preta
				if (com[0]<com[2]) { //Andou para frente
					return 1;
				}
				else {
					return 0;
				}
			}
			else { //se eh branca
				if (com[0]>com[2]) { //Andou para frente
					return 1;
				}
				else {
					return 0;
				}
			}
		}
		
		else { //Se dist>1, tem que verificar se captura
			int dist=Math.abs(com[3]-com[1]);
			if (dist%2==1) { //A distancia nao pode ser impar e maior que 1;
				return 0;
			}
			return 2;
		}
			
	}
	
}
