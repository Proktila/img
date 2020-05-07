import javax.swing.*; // Pour les composants graphiques que l'on ajoutera dans la méthode creerWidget
import java.awt.*;    // Pour la JFrame++++++++++++++++++
import java.awt.Color;
import javax.swing.JFrame;

 
public class Credits extends JFrame {

  public Credits() {
 
    creerWidget();
 	
 	this.setTitle("Page credit du jeu");
    setSize(500,600);                                // Fixe la taille par défaut
    setVisible(true);                                // Affiche la fenetre

    //JPanel pano = new JPanel();                       // Pour mettre un arrière plan de couleur
    //pano.setBackground(Color.BLACK);
    //this.setContentPane(pano);                  

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Gestion de la fermeture
  }
 
  public void creerWidget() {
	

		// un texte contenant un retour à la ligne
  	String text0 = "Credits";
	String text1 = "Le jeu a ete concu par Julien, Lisa, Marion, Theo, Nathan, Arthur";
	String text2 = "La musique utilisee est celle de Harry potter, Nyan Cat etc";
	String text3 = "Pour la realisation de ce jeu on tient a remercier notre tuteur monsieur Couchot etc. ";
	 
	JTextArea taText0 = new JTextArea(text0); 
	JTextArea taText1 = new JTextArea(text1);
	JTextArea taText2 = new JTextArea(text2);
	JTextArea taText3 = new JTextArea(text3);

	JPanel pano = new JPanel(new FlowLayout(FlowLayout.CENTER, 4000 ,100));
	pano.add(taText0);
	pano.add(taText1);   // Création d'un JPanel qui va contenir
	pano.add(taText2);
	pano.add(taText3);
	setContentPane(pano);         // Ajoute pano à la fenêtre principale
	}
}
