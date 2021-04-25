
public class RBN_Standard extends Robot{
	Monde m;
	public RBN_Standard(Monde m) {
	super(m);
	}
	public void parcourir(Monde m) throws Erreur {
		for (int i=0;i<m.nbL;i++) {
			for (int j=0;j<m.nbC;j=j+2) {
				m.prend_papier_gras(i,j);
			}
			System.out.println();
		}
	}
}
