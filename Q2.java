/*    
Q2:Find maximum sum path involving elements of given arrays
Given two sorted arrays of integers, find a maximum sum path involving elements of both arrays whose sum is maximum. 
We can start from either array, but we can switch between arrays only through its common elements.
 */

import java.util.Scanner;

public class MaxSum {

	

	
	    
	    public static int maxSumPath(int[] X, int[] Y) {
	        int m = X.length;
	        int n = Y.length;
	        
	        int i = 0, j = 0;
	        int sumX = 0, sumY = 0, result = 0;
	        
	        while (i < m && j < n) {
	            if (X[i] < Y[j]) {
	                sumX += X[i++];
	            } else if (X[i] > Y[j]) {
	                sumY += Y[j++];
	            } else {
	                result += Math.max(sumX, sumY) + X[i];
	                sumX = 0;
	                sumY = 0;
	                i++;
	                j++;
	            }
	        }
	        
	        while (i < m) {
	            sumX += X[i++];
	        }
	        
	        while (j < n) {
	            sumY += Y[j++];
	        }
	        
	        result += Math.max(sumX, sumY);
	        
	        return result;
	    }
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter the number of elements in array X:");
	        int m = scanner.nextInt();
	        int[] X = new int[m];
	        System.out.println("Enter the elements of array X:");
	        for (int i = 0; i < m; i++) {
	            X[i] = scanner.nextInt();
	        }
	        
	        System.out.println("Enter the number of elements in array Y:");
	        int n = scanner.nextInt();
	        int[] Y = new int[n];
	        System.out.println("Enter the elements of array Y:");
	        for (int i = 0; i < n; i++) {
	            Y[i] = scanner.nextInt();
	        }
	        
	        int maxSum = maxSumPath(X, Y);
	        System.out.println("The maximum sum is: " + maxSum);
	        
	        scanner.close();
	    }
	}


/*

***********op**********

Enter the number of elements in array X:
9
Enter the elements of array X:
3
6
7
8
10
12
15
18
100
Enter the number of elements in array Y:
13
Enter the elements of array Y:
1
2
3
5
7
9
10
11
15
16
18
25
50
The maximum sum is: 199
*************************

*/