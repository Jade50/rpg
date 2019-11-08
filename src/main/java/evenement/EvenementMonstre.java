package evenement;

import java.util.Scanner;

import character.Monster;

public class EvenementMonstre extends Evenement{

	// proprietes
	private Character character;
	private Character randomCharacter;
	
	// Constructeur
	public EvenementMonstre(Character character, Character randomCharacter) {
		this.character = character;
		this.randomCharacter = randomCharacter;
	}
	
	@Override
	public int evenement() {
		// TODO Auto-generated method stub
		Scanner chooseAttack = new Scanner(System.in);
		System.out.println("Veuillez choisir une attaque, 1 pour attaque physique et 2 pour attaque magique :");
		int attack = chooseAttack.nextInt();
		
		if(attack == 1) {
			
			int i = 0;
			while(this.character > 0 || this.randomCharacter > 0) {
				
//				this.character.physicAttack();
				
				i++;
			}
			
		} else {
			
		}
	}

}
