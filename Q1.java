/*Q1: Merge two arrays by satisfying given constraints
Given two sorted arrays X[] and Y[] of size m and n each where m >= n and X[] has exactly n vacant cells,
 merge elements of Y[] in their correct position in array X[], i.e., merge (X, Y) by keeping the sorted order.*/



import java.util.Scanner;


public class Merge {


	    public static void mergeArrays(int[] X, int[] Y) {
	        int m = X.length;
	        int n = Y.length;

	        int k = m - 1;
	        for (int i = m - 1; i >= 0; i--) {
	            if (X[i] != 0) {
	                X[k--] = X[i];
	            }
	        }

	        int i = k + 1; 
	        int j = 0; 
	        int idx = 0;

	        while (i < m && j < n) {
	            if (X[i] < Y[j]) {
	                X[idx++] = X[i++];
	            } else {
	                X[idx++] = Y[j++];
	            }
	        }

	        while (j < n) {
	            X[idx++] = Y[j++];
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of X array: ");
	        int m = scanner.nextInt();

	        System.out.print("Enter elements of X array: ");
	        int[] X = new int[m];
	        for (int i = 0; i < m; i++) {
	            X[i] = scanner.nextInt();
	        }

	        System.out.print("Enter the size of Y array: ");
	        int n = scanner.nextInt();

	        System.out.print("Enter elements of Y array: ");
	        int[] Y = new int[n];
	        for (int i = 0; i < n; i++) {
	            Y[i] = scanner.nextInt();
	        }

	        mergeArrays(X, Y);

	        System.out.print("Merged Array: { ");
	        for (int i = 0; i < X.length; i++) {
	            if (i != X.length - 1) {
	                System.out.print(X[i] + ", ");
	            } else {
	                System.out.print(X[i]);
	            }
	        }
	        System.out.println(" }");

	        scanner.close();
	    }
	}
/*

******op***********
Enter the size of X array: 9
Enter elements of X array: 0
2
0
3
0
5
6
0
0
Enter the size of Y array: 5
Enter elements of Y array: 1
8
9
10
15
Merged Array: { 1, 2, 3, 5, 6, 8, 9, 10, 15 }

*********************

*/

