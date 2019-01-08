package com.java;

import java.util.Scanner;

public class Java1darray {

	public static boolean canWin(int leap, int[] game) {
		if (game[(game.length-leap)]==0)
			return true;
		else
			return false;
			
		
       
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}


