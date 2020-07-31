package strings;
import java.util.Scanner;

public class Anagram3 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter string a");
		String a = sc.nextLine();
		System.out.println("Enter string b");
		String b = sc.nextLine();
		int al[] = new int[256];
		boolean isAnagram =true;
		for(char c : a.toCharArray()) {
			int index = (int)c;
			al[index]++;
		}
		for(char c : b.toCharArray()) {
			int index = (int)c;
			al[index]--;
		}
		for(int i=0 ; i<256 ; i++) {
			if(al[i]!= 0) {
				isAnagram = false;
				break;
			}
		}
		if(isAnagram) System.out.println("anagram");
		else System.out.println("not anagram");
	}
}
