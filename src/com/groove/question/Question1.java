package com.groove.question;

/*
### Task 1
Write a function that takes in a string of one or more words, and returns the same string, but with all five or more letter words reversed

[Video description](https://youtu.be/ZAIA3_SwA3Q)
#### Example 1
##### input
swirlWords( "Hey fellow warriors" )
##### output
"Hey wollef sroirraw"

#### Example 2
##### input
swirlWords( "This is another test" )
##### output
"This is rehtona test"
*/

public class Question1 {

	public static void main(String[] args) {
		/*
		 * For custom input
		 
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println(swirlWords(str));
		*/
		
		String test1 = "Hey fellow warriors";
		String test2 = "This is another test";
		
		System.out.println(test1);
		System.out.println(swirlWords(test1));
		
		System.out.println(test2);
		System.out.println(swirlWords(test2));

	}
	
	private static String swirlWords(String str) {
		String[] strArray = str.split("\\s+");
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<strArray.length; i++) {
			String currString = strArray[i];
			
			if(currString.length() >= 5) {
				String revString = reverseString(currString);
				
				sb.append(revString);
			}else {
				sb.append(currString);
			}
			
			sb.append(" ");
		} 
		
		return sb.toString().trim();
	}
	
	private static String reverseString(String str) {
		StringBuilder sb = new StringBuilder(str);
		
		return sb.reverse().toString();
	}
	
	

}

