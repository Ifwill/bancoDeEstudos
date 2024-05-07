package view;

import java.util.Scanner;

public class AutoTechView {
	private Scanner scanner;
	
	public AutoTechView() {
		scanner = new Scanner(System.in);
	}
	
	public int menu() {
		System.out.println("--------menu--------");
		System.out.println("1.");
		System.out.println("2.");
		System.out.println("3.");
		System.out.println("4.");		
		
		return scanner.nextInt();
	}

}
