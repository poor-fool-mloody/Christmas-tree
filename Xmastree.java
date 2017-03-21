package pl.xmastree;

import java.util.Scanner;

public class Xmastree {

	public static void main(String[] args) {
				 
		drawxmastree();		

	
	}

	private static void drawxmastree() {	
		Scanner read = new Scanner(System.in);
		String  orientation;
		

			orientation = getorientation();		
			switch (orientation){
				case "up":	  draw_up();
							  break;
				case "down":  draw_down();
							  break;
				case "left":  draw_left();
							  break;
				case "right": draw_right();
							  break;
				default: System.out.println("Invalid data");			  	
				  
		}
		read.close();
	}

	
	private static void draw_up() {
		int xmas_height = getxmasheight();
		
		for ( int i = 0; i < xmas_height; i++ ){
			for ( int j = xmas_height -i-1; j != 0;j-- ){
				System.out.print(" ");				
			}
			for ( int k = 0; k <i; k++ ){
				System.out.print("*");				
			}
			
			System.out.print("*");
			
			for ( int k = 0; k < i; k++ ){
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void draw_down() {
		int xmas_height = getxmasheight();
		
		for ( int i = xmas_height; i > 0; i-- ){
			for ( int j = i; j < xmas_height; j++ ){
				System.out.print(" ");				
			}
			for ( int k = 0; k <i-1; k++ ){
				System.out.print("*");				
			}
			
			System.out.print("*");
			
			for ( int k = 0; k < i-1; k++ ){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	
	private static void draw_left() {
		int xmas_height = getxmasheight();
		
		for ( int i = 1; i < xmas_height; i++ ){
			for ( int j = xmas_height; j > i; j-- ){
				System.out.print(" ");				
			}
			for ( int k = 0; k <i; k++ ){
				System.out.print("*");				
			}

			System.out.println();
		}
		
		for ( int i = xmas_height; i > 0; i-- ){
			for ( int j = 0; j < xmas_height - i; j++ ){
				System.out.print(" ");				
			}
			for ( int k = 0; k <i; k++ ){
				System.out.print("*");				
			}

			System.out.println();
		}
		
	}
	
	private static void draw_right() {
		int xmas_height = getxmasheight();
		
		for ( int i = 1; i < xmas_height; i++ ){
			for ( int j = 0; j < i; j++ ){
				System.out.print("*");				
			}
			System.out.println();
		}
		
		for ( int i = 0; i < xmas_height; i++ ){
			for ( int j = 0; j < xmas_height -i; j++ ){
				System.out.print("*");				
			}
			System.out.println();
		}
	}
	
	private static int getxmasheight() { 
		System.out.println("Enter number of xmas branches: ");
		Scanner read = new Scanner(System.in);
		int xmas_height;

		while ( !read.hasNextInt()){
			System.out.println("Enter natural number");
			read.next();			
		}
		
		xmas_height = read.nextInt();

		return xmas_height;
	}

	private static String getorientation() {
		System.out.println("Enter xmas orientation: (up, down, left, right)");
		Scanner read = new Scanner(System.in);
		String orientation;
		
		orientation = read.next();
		

		return orientation;
	}
}

