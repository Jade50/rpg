package character;

public class Guerrier extends Character {

	public Guerrier() {
		
		this.force = 10;
		this.agilite = 8;
		this.intelligence = 6;
		this.pv = 300;
	}
	
	public void levelUp() {
		
		this.force += 4;
		this.agilite += 1;
		this.intelligence += 1;
		
		int percent = this.pv * (10/100);
		
		this.pv += percent;
	}
}
