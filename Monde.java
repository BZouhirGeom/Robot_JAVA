
public class Monde {
	int nbL;
	int nbC;
	boolean [][]Mat;
	public Monde(int nbl,int nbc) {
		nbL=nbl;
		nbC=nbc;
		Mat=new boolean[nbL][nbC];
		for (int i=0;i<nbL;i++) {
			for (int j=0;j<nbC;j++) {
				Mat[i][j]=false;
			}
		}
	}
	public void met_papier_gras(int i,int j)throws Erreur{
		if (i>nbL-1 || j>nbC-1) { throw new Erreur(); 
		}
		else {
			Mat[i][j]=true;
		}
	
	};
	public void prend_papier_gras(int i,int j)throws Erreur {
		if (i>nbL-1 || j>nbC-1) { throw new Erreur(); 
		}
		else {
		Mat[i][j]=false;
		}

	}
	public boolean test_papier_gras(int i,int j)throws Erreur{
		boolean test;
		if (i>nbL-1 || j>nbC-1) { throw new Erreur(); 
		}
		else {
			if (Mat[i][j]==true) {
				test=true;
			}
			else {
				test=false;
			}
		}
		
		return test;
	};
	public int compte_papier_gras() {
		int cpte=0;
		for (int i=0;i<nbL;i++) {
			for (int j=0;j<nbC;j++) {
				if (Mat[i][j]==true) { 
					cpte=cpte+1;
				}
			}
		}
		return cpte;
	}
	public void affiche() {
		for (int i=0;i<nbL;i++) {
			for (int j=0;j<nbC;j++) {
				if (Mat[i][j]==true) {
					System.out.print("\t1");
				}
				else {
					System.out.print("\t0");
				}
				
			}
			System.out.println();
		}
	}
};