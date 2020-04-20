package all;

public class dama extends Piece {
	
	dama(int team){
		super(team);
	}
	/*public boolean verifica() {
	 	Deve-se verificar se esta no seu lance;
		Dama consegue andar varias posicoes em uma jogada, entao deve-se verificar se ela nao esta bloqueada por outra peca
		do mesmo time, ou ver se a pos final nao esta ocupada. 
		Deve-se verificar, caso esta nao tenha capturado na jogada, se ela nao deixou de capturar outra peca;
		
		 Talvez seja util fazer que, caso a peca ande mais de duas casas, seja feita uma analise de cada captura. Por exemplo:
		 Chamar a funcao verifica, se ela captura alguma peca, faz verifica(nova posicao inicial-> pos final)
	}*/
}
