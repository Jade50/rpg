package fr.jade.rpg;

import java.util.Scanner;
import character.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner chooseCharacter = new Scanner(System.in);
		System.out.println("Veuillez entrer le personnage de votre choix :");
		String character = chooseCharacter.nextLine();
		
//		System.out.println(character);
		
		switch(character) {
			case "guerrier":
				Guerrier guerrier = new Guerrier();
			break;
			default :
				String str = "Vous n'avez pas tapé un bon perso";
		}
	}

}
