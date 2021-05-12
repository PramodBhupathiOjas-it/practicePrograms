package CollectionPrograms;

import java.util.Scanner;

public class Snippet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter String to encrypt");
		
		String str = sc.next();
		
		char[] ch = str.toCharArray();
		
		char[] apl = new char[26];
		char[] rev = new char[26];
		int i =0;
		for( char c = 'a'; c <= 'z'; ++c) {
			apl[i] = c;
			i++;
		}
		
		int j = 0;
		for( char c = 'z'; c >= 'a'; c--) {
			rev[j] = c;
			j++;
		}
		
		String res = "";
		
		for(int x = 0;x<ch.length;x++) {
			for(int y =0 ;y<apl.length;y++) {
				if(apl[y] == ch[x]) {
					res +=rev[y];
				}
			}
		}
		
		System.out.println(res);
		      

	}
}
