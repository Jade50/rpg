package partie;
import evenement.*;

public class Partie {

	// Propriété
	private Character character;
	
	// Constructeur
	public Partie(Character character) {
		
		this.character = character;
	}
	
	
	// Tour
	public void tour() {
		
		int percent = (int)(Math.random() * 10);
		
		Evenement e;
		
		// 70 % de chances de tomber sur un monstre
		if(percent >= 0 && percent <= 7) {
			
			e = new EvenementMonstre();
		
		// 20% de chances de tomber sur le coach
		} else if(percent >=0 && percent <=2) {
			
			e = new EvenementCoach();
		
		// 10% de chances de tomber sur le medecin
		} else {
			e = new EvenementMonstre();
		}
		
		e.evenement();
	}
}
