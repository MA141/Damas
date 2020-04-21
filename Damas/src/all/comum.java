package all;

public class comum extends Piece{
	
	comum(int team){
		super(team);
	}
	
	boolean verifComp(String com) { //Verifica se o movimento é compativel;
		//Se dist ==1, ver se vai para frente
		if(com.charAt(0)==com.charAt(3) || com.charAt(1)==com.charAt(4)) {
			return false;
		}
		if (Math.abs((int)(com.charAt(3))-(int)(com.charAt(0)))==1) {
			if (color==1) { //se eh preta
				if ((int)(com.charAt(1))>(int)(com.charAt(4))) { //Andou para frente
					return true;
				}
				else {
					return false;
				}
			}
			else { //se eh branca
				if ((int)(com.charAt(1))<(int)(com.charAt(4))) { //Andou para frente
					return true;
				}
				else {
					return false;
				}
			}
		}
		
		else { //Se dist>1, tem que verificar se captura
			int dist=Math.abs((int)(com.charAt(3))-(int)(com.charAt(0)));
			if (dist%2==1) { //A distancia nao pode ser impar e maior que 1;
				return false;
			}
			return true;
			/*if (dist==2) { //Captura uma vez;
			 Deve-se verificar se ha uma inimiga no caminho, ou seja, o tabuleiro deve ser consultado, entao talvez esta parte deva ser feita nele;
				Nesse caso, dist deveria ser calculada de novo la, pois nao sera retornada
			}*/
		}
			
	}
	
	/*public boolean verifica(pos inicial-> pos final) {
		pecas comuns so podem andar para frente, e apenas uma posicao, entao as verificacoes sao:
		 If team==1 (se for preta)-> a linha final deve ter indice maior que a inicial, e o contrario se team==0;
		 Verificar se a casa final esta livre. E verificar se nao ha nenhuma peca aliada entre elas;
		 Se ha uma inimiga entre a final e inicial, deve-se remove-la; 
		 Deve-se verificar, caso ela nao tenha capturado, se nao ha outra inimiga em outra direcao que ele deixou de capturar
		 (pode ser em qualquer diagonal, tanto para tras quanto para frente), isso envolve verificar se ha alguma peca na diagonal
		 e ver se a casa apos ela esta vazia;
		 
		 Talvez seja util fazer que, caso a peca ande mais de duas casas, seja feita uma analise de cada captura. Por exemplo:
		 Chamar a funcao verifica, se ela captura alguma peca, faz verifica(nova posicao inicial-> pos final)
		 
		 Primeiro:
		 Ver se esta no turno.. ver se havera captura, se nao houver, ver se a distancia eh 1, e se esta andando para frente;
		 
		 Se a distancia for 2 ou mais, ela deve ser par; Caso seja, deve-se verificar se ela faz capturas, creio que o ideal seja
		 fazer recursivamente, ou seja, faz uma captura e depois chama a verificacao a partir da nova posicao;
		 Durante a verificacao: Ver se na proxima posicao na direcao da pos final, ha uma peca inimiga, ou se a proxima for a final;
		 
		 Criar um metodo que verifica quantas pecas inimigas ha ao redor da peca, e esta sera chamada a cada verif;
		 
		 
		 
	}*/
}
