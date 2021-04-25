
public class RBP_Sauteur extends Robot {
	Monde m;
	public RBP_Sauteur(Monde m) {
		super (m);	
	}
	public void parcourir(Monde m) throws Erreur {
		for (int i=0;i<m.nbL;i++) {
			for (int j=0;j<m.nbC;j=j+2) {
				m.met_papier_gras(i,j);
			}
			System.out.println();
		}
	}
}

