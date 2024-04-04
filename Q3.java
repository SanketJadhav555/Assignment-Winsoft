/*
Q3:Write a Java Program to count the number of words in a string using HashMap
*/

import java.util.HashMap;
import java.util.Scanner;


public class CountNum {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter a string:");
	        String inputString = scanner.nextLine();

	        String[] words = inputString.split("\\s+");

	        HashMap<String, Integer> wordCountMap = new HashMap<>();

	        for (String word : words) {
	            if (wordCountMap.containsKey(word)) {
	               
	                wordCountMap.put(word, wordCountMap.get(word) + 1);
	            } else {
	             
	                wordCountMap.put(word, 1);
	            }
	        }

	        int totalCount = 0;
	        for (int count : wordCountMap.values()) {
	            totalCount += count;
	        }

	        System.out.println("Total word count: " + totalCount);
	        
	        scanner.close(); 
	    }
	}

/*
****************op**************
Enter a string:
hi my name is sanket
Total word count: 5

*/