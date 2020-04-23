package all;

public class Piece {
	public int color; //1 se preto, 0 se branco, e -1 caso a peça nao exista.
	
	Piece(int color){
		this.color=color;
	}
	
	int verifComp(int[] com, Board tab) {
		return 0;
	}
	
	int gtClass() {//0 se piece(vazia), 1 se comum, 2 se dama
		return 0;
	}
	
	
}
