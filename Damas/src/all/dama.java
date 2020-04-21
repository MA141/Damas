package all;

public class dama extends Piece {
	
	dama(int team){
		super(team);
	}
	
	boolean verifComp(String com) {
		//A unica restricao eh, ela deve andar na diagonal. Para verificar se ela pode capturar, isso sera verificado na table;
		if(com.charAt(0)==com.charAt(3) || com.charAt(1)==com.charAt(4)) {
			return false;
		}
		return true;
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
