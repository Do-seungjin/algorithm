package algorithm_day1;

import java.util.Scanner;

public class 숫자만추출 {
	public int solution(String s) {
		String answer = "";
		for(char x : s.toCharArray()) {
			if(Character.isDigit(x)) {
				answer += x;
			}
		}
		return Integer.parseInt(answer);
	}
	public static void main(String[] args) {
		숫자만추출 T = new 숫자만추출();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
		sc.close();
	}
	
}
