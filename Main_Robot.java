
public class Main_Robot {

	public static void main(String[] args) {
		Monde M=new Monde (5,5);
		
		try {
			M.met_papier_gras(2, 1);
			M.met_papier_gras(2, 2);
			M.met_papier_gras(0, 1);
			//M.met_papier_gras(2, 11);
		}
		catch (Erreur E) {};
		M.affiche();
		System.out.println("Le nombre de case pollue est "+M.compte_papier_gras());
		try {
			M.prend_papier_gras(2, 1);
			M.prend_papier_gras(2, 2);
			M.prend_papier_gras(0, 0);
		}
		catch (Erreur E) {};
		M.affiche();
	
		try {
			M.test_papier_gras(0, 0);
		}
		catch (Erreur E) {};
		
		try {
			RBP_tout_droit RBP=new RBP_tout_droit(2,M) ;
			RBP.parcourir(M);
			}
			catch (Erreur E) {};
			System.out.println("Robot pollueur tout droit ");
			M.affiche();
		
		try {
			Nettoyeur RBP=new Nettoyeur(2,M) ;
			RBP.parcourir(M);
			}
			catch (Erreur E) {};
			System.out.println("Robot Nettoyeur  tout droit ");
			M.affiche();
			
		try {
			RBP_libre RBP=new RBP_libre(M) ;
			RBP.parcourir(M);
			}
			catch (Erreur E) {};
			System.out.println("Robot Pollueur libre ");
			M.affiche();
			
		try {
			RBN_libre RBP=new RBN_libre(M) ;
			RBP.parcourir(M);
			}
			catch (Erreur E) {};
			System.out.println("Robot Nettoyeur libre ");
			M.affiche();
			
		try {
			RBP_Sauteur RBP=new RBP_Sauteur(M) ;
			RBP.parcourir(M);
			}
			catch (Erreur E) {};
			System.out.println("Robot Pollueur Sauteur ");
			M.affiche();
			
		try {
			RBN_Smart RNS=new RBN_Smart(M) ;
			RNS.parcourir(M);
			}
			catch (Erreur E) {};
			System.out.println("Robot Nettoyeur Smart ");
			M.affiche();
			
			
	}
	
}

