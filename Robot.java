
public abstract class Robot {
	float posx;
	float posy;
	Monde m;
	public Robot(int x, int y) {
		posx=x;
		posy=y;
	};
	public Robot(Monde m) {
		posx=(int)(Math.random()*m.nbL-1);
		posy=(int)(Math.random()*m.nbL-1);
	}
	public void deplace(int i,int j)throws Erreur{
		if (i>this.m.nbL-1 || j>this.m.nbC-1) { throw new Erreur(); 
		}
		else {
			m.nbL=i;
			m.nbC=j;
		}
	}
	public abstract void parcourir(Monde m) throws Erreur;
}

