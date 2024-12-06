package algorithm_day1;

import java.util.Scanner;

public class 문자찾기 {

	public int answer(String word, char alpha){
		// TODO Auto-generated method stub
		int a = 0;
		word = word.toUpperCase();
		alpha = Character.toUpperCase(alpha);
		for(int i=0; i<word.length();i++) {
			if(word.charAt(i)==alpha) {
				a++;
				}
		}
		return a;
	}
	
	public static void main(String[] args) {
		문자찾기 T = new 문자찾기();
		Scanner kb = new Scanner(System.in);
//		System.out.print("단어를 입력하세요 : ");
		String str = kb.next();
//		System.out.print("문자를 입력하세요 : ");
		char c = kb.next().charAt(0);
		
		
		System.out.println(T.answer(str,c));
		kb.close();
	}
	

}
