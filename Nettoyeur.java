public class Nettoyeur extends Robot {
	int ColDepart;
	Monde m;
	public Nettoyeur(int ColDepart,Monde m) {
		super(m);
		this.ColDepart=ColDepart;
	}
	public void parcourir(Monde m) throws Erreur {
		for (int i=0;i<m.nbL;i++) {
			m.prend_papier_gras(i, ColDepart);
		}
		
	}
};
