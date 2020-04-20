package all;

public class comum extends Piece{
	
	comum(int team){
		super(team);
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
		 
		 
	}*/
}
