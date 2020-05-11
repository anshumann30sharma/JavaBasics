package com.syntax.class18;

public class practice01 {
/*Returns:
a String
Name:
alphabetical
Parameters:
a String called str
Purpose:
Return a string that is composed of each letter as long as the letter is later on in the alphabet
than its previous one.  You can assume actual parameters are lowercase.
See below examples.

Additional Info:
You can use < and > to compare characters (not Strings), where characters later on in the alphabet are "greater".  Examples:
'a' < 'b' ==> True
'a' < 'a' ==> False
'a' > 'b' ==> False

Examples:
alphabetical("hello") ==> "hlo"
alphabetical("software") ==> "stwr"
alphabetical("language") ==> "lnug"
*/
	public static String alphabetical(String str) {
		str = str.toLowerCase();
		char[] ch = str.toCharArray();
		String alphabetical = "";
		alphabetical = alphabetical + ch[0];
		char c = ch[0];
		for (int i = 0; i < ch.length; i++) {
			if (c < ch[i]) {
				alphabetical += ch[i];
			}
			c = ch[0 + i];
		}
		return alphabetical;
	}
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(alphabetical("hello")); //"hlo"
		System.out.println(alphabetical("software")); //"stwr"
		System.out.println(alphabetical("language")); //"lnug"
	}
}
