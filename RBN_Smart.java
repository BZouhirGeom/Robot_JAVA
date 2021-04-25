
public class RBN_Smart extends Robot {
	Monde m;
	public RBN_Smart(Monde m) {
		super(m);
	}
	public void parcourir(Monde m) throws Erreur {
		for (int i=0;i<m.nbL;i++) {
			for (int j=0;j<m.nbC;j=j+1) {
				if (m.Mat[i][j]==true) {
					m.prend_papier_gras(i,j);
				}
			}
			System.out.println();
		}
	}
}

