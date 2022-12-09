package com.groove.question;

import java.util.Scanner;

/*
### Task 2
### Description
Write a function that will correct the errors in given string. Below are the rules
- For every captial letter, assume the need to place a fullstop at the end of the sentence before the current one.
- For every full-stops, there shall be only one whitespace to the next sentence.
- Each first letter of every sentance must be capitalised.
- Trailling and leading spaces to be removed.

[Video Description](https://youtu.be/x5kzHW8zTqE)
#### input
correct_it("John have   an apple The sky is blue.  they get a coin")
#### output
"John have an apple. The sky is blue. They get a coin."

 */

public class Question2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println(correctIt(str));

	}
	
	private static String correctIt(String str) {
		String[] strArr = str.split("\\s+");
		StringBuilder sb = new StringBuilder();
		
		String firstWord = strArr[0];
		firstWord = Character.toUpperCase(firstWord.charAt(0)) + firstWord.substring(1);
		sb.append(firstWord);
		boolean isNextWord = false;
		boolean isFullStopPresnt = false;
		
		for(int i=1; i<strArr.length; i++) {
			String currString = strArr[i];
			currString = currString.trim();
			
			if(Character.isUpperCase(currString.charAt(0)) || isNextWord) {
				if(!isFullStopPresnt) {
					sb.append(". ");
					isFullStopPresnt = false;
				}
				currString = Character.toUpperCase(currString.charAt(0)) + currString.substring(1);
				sb.append(" ");
				sb.append(currString);
				isNextWord = false;
			}else if(currString.charAt(currString.length()-1) == '.') {
				isNextWord = true;
				isFullStopPresnt = true;
				sb.append(" ");
				sb.append(currString);
			}
			else {
				isNextWord = false;
				sb.append(" ");
				sb.append(currString);
			}
		}
		sb.append(".");
		
		return sb.toString();
	}

}
