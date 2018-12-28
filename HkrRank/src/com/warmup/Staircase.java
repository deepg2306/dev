package com.warmup;

public class Staircase {

	public static void main(String[] args) {
		int n = 6;
		for (int i = 0; i < n; i++) {
			for (int j = n - i - 1; j > 0; j--) {
				System.out.print(" ");

			}
			for (int k = 0; k <= i; k++) {
				System.out.print("#");
			}
			System.out.println();

		}

	}

}

/*
 * #include <stdio.h>
 * 
 * int main() { int i, j, rows;
 * 
 * printf("Enter the number of rows\n"); scanf("%d", &rows);
 * 
 * for(i = 1; i <= rows; i++){ for r th row, first print rows-r spaces then
 * stars for(j = 1; j <= rows; j++){ if(j <= rows-i){ printf(" "); } else {
 * printf("*"); } } move to next row printf("\n"); }
 * 
 * return 0; }
 */