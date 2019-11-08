package character;

public class Character {

	protected int force;
	protected int agilite;
	protected int intelligence;
	protected int pv;
	protected int xp;
	protected int level;
	
	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getAgilite() {
		return agilite;
	}

	public void setAgilite(int agilite) {
		this.agilite = agilite;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getPv() {
		return pv;
	}

	public void setPv(int pv) {
		this.pv = pv;
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int physicAttack(Character character) {
		
		// chance de réussite de l'attaque
		double resultAttack = 0.7 + (character.level - this.level) * 0.1 + (character.level - this.agilite) * 0.5;

		int damage = 0;
		
		// attaque réussie
		if(resultAttack >= 1) {
			
			int dice = (int)(Math.random() * 12);
			damage = this.force + dice;
			
			return damage;
			
		// attaque échouée
		}
		return damage;
		
	}
	
	public int MagicAttack(Character character) {
		
		double resultAttack = 0.9 + (character.level - this.level) * 0.1 + (character.level - this.agilite) * 0.5;
		
		// attaque réussie
		if(resultAttack >= 1) {
			
			int dice = (int)(Math.random() * 12);
			int damage = this.intelligence + dice;
			
			return damage;
			
		// attaque échouée
		} else {
			int damage = 0;
			
			return damage;
		}
	}
}
