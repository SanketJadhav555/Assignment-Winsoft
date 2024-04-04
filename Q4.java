/*
Q4:Write a Java Program to find the duplicate characters in a string.
*/


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DublicateWord {

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter a string:");
	        String inputString = scanner.nextLine();

	        Map<Character, Integer> charCountMap = new HashMap<>();

	        inputString = inputString.toLowerCase();

	        for (char c : inputString.toCharArray()) {
	            if (c != ' ') { // Exclude spaces
	                if (charCountMap.containsKey(c)) {
	                 
	                    charCountMap.put(c, charCountMap.get(c) + 1);
	                } else {
	                 
	                    charCountMap.put(c, 1);
	                }
	            }
	        }

	        System.out.println("Duplicate characters:");
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
	            }
	        }
	        
	        scanner.close(); 
	    }
	}




/*

****************op*********

Enter a string:
hi my name is sanket
Duplicate characters:
a - 2 times
s - 2 times
e - 2 times
i - 2 times
m - 2 times
n - 2 times


*/
