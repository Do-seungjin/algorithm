package algorithm_day1;

import java.util.Scanner;

public class 특정문자뒤집기 {
	public String solution(String str) {
		String answer;
		
		char[] s = str.toCharArray(); // 문자 배열 생성
		int lt = 0;
		int rt = str.length()-1;
		while(lt<rt) {
			// 알파벳이 아닐때
			if(!Character.isAlphabetic(s[lt])) {
				lt++;
			}else if(!Character.isAlphabetic(s[rt])) {
				rt--;
			}else {
				char tmp=s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
			}
		}
		answer=String.valueOf(s);
		
		return answer;
	}
	
	public static void main(String[] args) {
		특정문자뒤집기 T = new 특정문자뒤집기();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
		sc.close();
	}
}
