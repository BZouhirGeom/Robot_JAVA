import java.awt.BorderLayout;
import javax.swing.*; 
import java.awt.*;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceGraphique extends  JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton a,v,y,d,Z,Q,r,t,g,x,c,z,w;
	boolean action;
	private static JButton[][] tab;
	Panel s= new Panel();
	Border ligne=BorderFactory.createLineBorder(Color.black);
	static boolean test;
	private static InterfaceGraphique I;
	

	public InterfaceGraphique() {
		Panel e=new Panel();
		Panel f =new Panel();
		Panel h=new Panel();
		Panel è=new Panel();
		Panel é=new Panel();
		Panel à=new Panel();

		this.setTitle("Monde_ROBOT");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.setLayout(new BorderLayout());
		
		 this.setVisible(true);
		 e.setLayout (new GridLayout (4,0));
		 Z=new JButton("POLLUEURS LIBRES");
		 Z.addActionListener(this);
		 e.add (Z);
		 Q = new JButton ("POLLUEURS Sauteurs");
		 Q.addActionListener(this);
		 e.add(Q);
		  
		 t=new JButton ("POLLUEUR SMART");
		 t.addActionListener(this);
		 e.add(t);
		    
		 r=new JButton ("RESULTAT");
		 r.addActionListener(this);
		 e.add(r);
		 add ("West", e);
		 f.setLayout (new GridLayout (0,4));
		 c=new JButton("Polluer une case ");
		 f.add (c);
		 c.setBackground(Color.WHITE);
		 c.addActionListener(this);
		 d=new JButton("POLLUER TOUS LE MONDE");
		 f.add (d);
		 d.setBackground(Color.WHITE);
		 d.addActionListener(this);
		 g=new JButton("Réinitialiser le monde");
		 g.addActionListener(this);
		 f.add (g);
		 g.setBackground(Color.WHITE);
		 a=new JButton("QUITTER");
		 a.addActionListener(this);
		 f.add (a);
		 a.setBackground(Color.WHITE);
		 add ("North", f);
		 h.setLayout (new GridLayout (5,0));
		 x=new JButton("ROBOT DROIT");
		 x.addActionListener(this);
		 h.add (x);
		 y=new JButton("NETTOYEUR SAUTEUR");
		 y.addActionListener(this);
		 h.add (y);
		 z=new JButton("NETTOYEUR DROIT");
		 z.addActionListener(this);
		 h.add (z);
		 v=new JButton("NETTOYEUR SMART");
		 v.addActionListener(this);
		 v.setBackground(Color.white);
		 h.add (v);
		 w=new JButton("NETTOYEUR LIBRE");
		 w.addActionListener(this);
		 h.add (w);
		 add ("East", h);
		 
		//Grille centrale
		 s.setLayout (new GridLayout (10,10));
		 setTab(new JButton[10][10]);
		 test=true;
		 for (int i=0; i<10; i++){
		 	 for (int J=0; J<10; J++){  
		 	 	JButton b=new JButton("");
		 	 	getTab()[i][J]=b;
		 	 	s.add (getTab()[i][J]);
		    	getTab()[i][J].setBorder(ligne);
		    	getTab()[i][J].setBackground(Color.LIGHT_GRAY);
		 	  }
		  
		  }
		  add ("Center",s);
		  
		  é.add(è);
		  è.setBackground(Color.green);
		  è.setPreferredSize(new Dimension(150,150));
		  é.add(à);

		  à.setBackground(Color.red );
		  à.setPreferredSize(new Dimension(50,50));
		   
		  JButton k=new JButton("");
		     
		  k.setBackground(Color.green);
		   
		 
		   
		     s.setBackground(Color.BLUE);
		  }
	
	public void actionPerformed (ActionEvent e){
		/*Bouton QUITTER*/
			if (e.getSource()==a){	
				 this.setVisible(false);
			     this.dispose();	
			}
			else if(e.getSource()==x){
				int n=lire("Donnez le numero de colonne souhaité");
				for(int i=0;i<10;i++){
				 
		
					InterfaceGraphique.getTab()[i][n].setBackground(Color.red);
			}
			}
			//BOUTON NETTOYER
			else if (e.getSource()==g)  {
				for(int i=0;i<10;i++){
					for(int j=0;j<10;j++){ 
		
						InterfaceGraphique.getTab()[i][j].setBackground(Color.LIGHT_GRAY);
					}
				
				}
			}
				else if (e.getSource()==d)  {
					for(int i=0;i<10;i++){
						for(int j=0;j<10;j++){ 
		
							InterfaceGraphique.getTab()[i][j].setBackground(Color.red);
						}
					
					}
				}
			
				else if (e.getSource()==Z){
					InterfaceGraphique.getTab()[(int)(Math.random()*10)][(int)(Math.random()*10)].setBackground(Color.red);
				}
				else if (e.getSource()==Q){
					int k=0;
					
					int H=lire("Donnez le numero de colonne souhaité");	
					int V=lire("Donnez le nombre de cases sautées");
					InterfaceGraphique.getTab()[0][H].setBackground(Color.red);
					while(k<10){ 
						InterfaceGraphique.getTab()[k+V][H].setBackground(Color.red);
						 
						 k=k+V;
						 
				}
					
				}
				else if (e.getSource()==t){
				int k=0;
				int i=0;
				int j=0;
				for( i=0;i<10;i++){
					for( j=0;j<10;j++){ 
						if (InterfaceGraphique.getTab()[i][j].getBackground()!=Color.green){
							k=k+1;
						}
					}

				}
			JOptionPane.showMessageDialog( null, "le nombre de cases déja polluées est "+k);
			int a=lire("Donnez le numero de ligne souhaité");	
			int b=lire("Donnez le numero de COLONNE souhaité");
						//Color black = null;
				if (InterfaceGraphique.getTab()[a][b].getBackground()==Color.red){
					JOptionPane.showMessageDialog( null, "Case déja polluée");
				}
				else{
					InterfaceGraphique.getTab()[a][b].setBackground(Color.red);	
				}	
			}
				else if (e.getSource()==v){
						int i=0;
						int j=0;
						int k=0;
						for( i=0;i<10;i++){
							for( j=0;j<10;j++){ 
								if (InterfaceGraphique.getTab()[i][j].getBackground()!=Color.green){
									k=k+1;
								}
							}
						}
				        for( i=0;i<10;i++){
							for( j=0;j<10;j++){ 
								InterfaceGraphique.getTab()[i][j].setBackground(Color.green);	
							}	
						}
				        	
				        JOptionPane.showMessageDialog( null, "le nombre de cases nettoyées est "+k);    	
					}
					else if(e.getSource()==y){
					int k=0;
						
						int H=lire("Donnez le numero de colonne souhaité");	
						int V=lire("Donnez le nombre de cases souhaité");
						InterfaceGraphique.getTab()[0][H].setBackground(Color.green);
						 while(k<10){ 
							 InterfaceGraphique.getTab()[k+V][H].setBackground(Color.green);
							 
							 k=k+V;
						 }
					}
					else if(e.getSource()==c){
						int a=lire("Donnez le numero de ligne souhaité");	
						int b=lire("Donnez le numero de COLONNE souhaité");	
						InterfaceGraphique.getTab()[a][b].setBackground(Color.red);
					}
					else if(e.getSource()==z){
						
						int b=lire("Donnez le numero de COLONNE souhaité");
						for (int i=0; i<10;i++){
							InterfaceGraphique.getTab()[i][b].setBackground(Color.green);
						}
					}
			else if(e.getSource()==r){
				int k=0;
				int i=0;
				int j=0;
				int m=0;
				for( i=0;i<10;i++){
					for( j=0;j<10;j++){ 
						if (InterfaceGraphique.getTab()[i][j].getBackground()!=Color.green){
							k=k+1;
						}
					}			
						
				}
				for(int a=0;a<10;a++){
					for( int b=0;b<10;b++){ 
						if (InterfaceGraphique.getTab()[a][b].getBackground()==Color.blue){
						 m=m+1;
						}
					}						
				}
				
				JOptionPane.showMessageDialog( null, "Le nombre de cases déja polluées est "+k+"\n"+" Le  nombre de pollueurs smart est "+m);
				
			}
			else if(e.getSource()==z){
				
				int b=lire("Donnez le numero de COLONNE souhaité");
				for (int i=0; i<10;i++){
					InterfaceGraphique.getTab()[i][b].setBackground(Color.green);
				}
			}
			else if(e.getSource()==w){
				InterfaceGraphique.getTab()[(int)(Math.random()*10)][(int)(Math.random()*10)].setBackground(Color.green);	
				}
			}	
			
			 public static void main(String[] args) {
				   I = new InterfaceGraphique();
				}
			 public static int  lire(String question) {
					  
				 boolean correct=false;
				 int valeur=0;
				 do{
					 String rep=JOptionPane.showInputDialog(null, question);
					 if (rep==null) break;
					 try
					 {
						 valeur=Integer.parseInt(rep);
						 if (valeur>=0) correct =true;
						 if (valeur>10) correct=false;
					 }
					catch (NumberFormatException ex){}
					if (!correct) JOptionPane.showMessageDialog(null, "Numero  incorrect. Bien vouloir donner un numero entre 0 et 10");
				 }
				 while(!correct);
				 return valeur;
				 }
     
			public static JButton[][] getTab() {
				return tab;
			}
			public static void setTab(JButton[][] tab) {
				InterfaceGraphique.tab = tab;
			}  
			
}
	
