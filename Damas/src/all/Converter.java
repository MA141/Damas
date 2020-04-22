package all;

public class Converter {
	int[][] conv(String[] vet){// converte os movimentos da lista de comandos em uma lista de coordenas [[iInical,jInical,iFinal,jFinal],...]
		int[][] a= new int[vet.length][4];
		for(int i=0;i<vet.length;i++) {
			a[i][0]=7-(((int)(vet[i].charAt(1)))-49);
			a[i][1]=(((int)(vet[i].charAt(0)))-97);
			a[i][2]=7-(((int)(vet[i].charAt(4)))-49);
			a[i][3]=(((int)(vet[i].charAt(3)))-97);
			
		}
		return a;
	}
}
