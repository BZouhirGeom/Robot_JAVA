public class RBP_tout_droit extends Robot{
	int ColDepart;
	Monde m;
	public RBP_tout_droit(int ColDepart,Monde m) {
		super(m);
		this.ColDepart=ColDepart;
	}
	public void parcourir(Monde m) throws Erreur {
		for (int i=0;i<m.nbL;i++) {
			m.met_papier_gras(i, ColDepart);
		}
	}
}

