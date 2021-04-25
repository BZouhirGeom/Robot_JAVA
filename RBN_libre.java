public class RBN_libre extends Robot {
	Monde m;
	public RBN_libre(Monde m) {
		super(m);
	}
	public void parcourir(Monde m) throws Erreur {
		for (int i=(int)(Math.random()*m.nbL-1);i<m.nbL;i++) {
			for (int j=(int)(Math.random()*m.nbC-1);j<m.nbC;j=j+1) {
				m.prend_papier_gras(i,j);
			}
			System.out.println();
		}
	}
}

